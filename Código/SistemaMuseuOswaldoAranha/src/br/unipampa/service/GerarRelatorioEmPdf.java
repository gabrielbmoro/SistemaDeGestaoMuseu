/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.service;

import br.unipampa.model.ItemConsignado;
import br.unipampa.model.ItemTombo;
import br.unipampa.model.LivroDaBiblioteca;
import br.unipampa.view.GeradorDeMensagem;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabrielbmoro
 */
public class GerarRelatorioEmPdf {

    private Document doc;
    private OutputStream os;
    private static String CAMINHO_LOGO = "/br/unipampa/view/icons/logoTipoRelatorio.png";
    private static final int COR_TABELA_CABECALHO_RED = 255;
    private static final int COR_TABELA_CABECALHO_GREEN = 255;
    private static final int COR_TABELA_CABECALHO_BLUE = 255;
    private final Font fontePadrao = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL);
    private final Font fontePadraoNegrito = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
    private final Font fontePadraoItalico = new Font(Font.FontFamily.TIMES_ROMAN, 13, Font.ITALIC);
    private PdfWriter pdfWriter;

    public boolean gerarRelatorio(List<Object> dadosDeRelatorio, String diretorio, String descricaoDeArquivo, TipoDeRelatorio tipoDeRelatorio) {
        if (dadosDeRelatorio.isEmpty() || dadosDeRelatorio == null) {
            return false;
        } else {
            try {
                doc = null;
                OutputStream os = null;
                fontePadraoNegrito.setColor(BaseColor.BLACK);
                doc = new Document(new Rectangle(1108, 508), 72, 72, 72, 72);
                File file = new File(diretorio);
                if (!file.isDirectory()) {
                    diretorio = System.getProperty("user.home") + descricaoDeArquivo;
                    GeradorDeMensagem.exibirMensagemDeInformacao("O relatório pode ser encontrado no seguinte endereço padrão: \n"
                            + "<sua pasta de usuário>//", descricaoDeArquivo);
                } else {
                    diretorio = diretorio + File.separator + descricaoDeArquivo;
                }
                os = new FileOutputStream(diretorio);
                pdfWriter = PdfWriter.getInstance(doc, os);
                doc.open();

                doc.add(recuperarLogoRelatorio());
                doc.add(recuperarCabecalho(tipoDeRelatorio));
                doc.add(new Paragraph("                      ", fontePadrao));
                doc.add(new Paragraph("                       ", fontePadrao));
                switch (tipoDeRelatorio) {
                    case ITEM_CONSIGNADO:
                        escreverTabelaConsignados(dadosDeRelatorio, doc);
                        break;
                    case ITEM_TOMBO:
                        escreverTabelaTombos(dadosDeRelatorio, doc);
                        break;
                    case ITEM_BIBLIOTECA:
                        escreverTabelaLivrosDeBiblioteca(dadosDeRelatorio, doc);
                        break;
                }
                doc.add(recuperaRodape());
                doc.close();
                return true;
            } catch (FileNotFoundException erro) {
                return false;
            } catch (DocumentException erro1) {
                return false;
            }
        }
    }

    private Paragraph recuperarCabecalho(TipoDeRelatorio tipoDeRelatorio) {
        String tituloDeRelatorio = "Relatorio Geral do Museu Oswaldo Aranha: ";
        switch (tipoDeRelatorio) {
            case ITEM_CONSIGNADO:
                tituloDeRelatorio = tituloDeRelatorio + "Itens de Acervo em Consignado";
                break;
            case ITEM_TOMBO:
                tituloDeRelatorio = tituloDeRelatorio + "Itens de Acervo do Museu - Tombo";
                break;
            case ITEM_BIBLIOTECA:
                tituloDeRelatorio = tituloDeRelatorio + "Livros da Biblioteca";
                break;
        }
        Font fonteCabecalho = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
        Paragraph cabecalho = new Paragraph(tituloDeRelatorio, fonteCabecalho);
        cabecalho.setAlignment(Element.ALIGN_CENTER);
        return cabecalho;

    }

    private Image recuperarLogoRelatorio() {
        try {
            Image img = Image.getInstance(
                    getClass().
                    getResource(CAMINHO_LOGO));
            img.setAlignment(Element.ALIGN_CENTER);
            return img;
        } catch (BadElementException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }

    private void escreverTabelaLivrosDeBiblioteca(List<Object> resultados, Document doc) throws DocumentException {
        if (!resultados.isEmpty()) {
            doc.newPage();
            PdfPTable tabela = new PdfPTable(new float[]{0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f});

            doc.newPage();

            Paragraph paragrafoID = new Paragraph("ID", fontePadraoNegrito);
            paragrafoID.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela = new PdfPCell(paragrafoID);
            celulaMaeTabela.setRowspan(2);
            celulaMaeTabela.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela);

            Paragraph outroCodigo = new Paragraph("Outro Codigo", fontePadraoNegrito);
            outroCodigo.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela5 = new PdfPCell(outroCodigo);
            celulaMaeTabela5.setRowspan(2);
            celulaMaeTabela5.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela5);

            Paragraph anoDeLancamento = new Paragraph("Ano de Lançamento", fontePadraoNegrito);
            anoDeLancamento.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela1 = new PdfPCell(anoDeLancamento);
            celulaMaeTabela1.setRowspan(2);
            celulaMaeTabela1.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela1);

            Paragraph grafica = new Paragraph("Grafica", fontePadraoNegrito);
            grafica.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela2 = new PdfPCell(grafica);
            celulaMaeTabela2.setRowspan(2);
            celulaMaeTabela2.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela2);

            Paragraph nomeDoAutor = new Paragraph("Nome do Autor", fontePadraoNegrito);
            nomeDoAutor.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela3 = new PdfPCell(nomeDoAutor);
            celulaMaeTabela3.setRowspan(2);
            celulaMaeTabela3.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela3);

            Paragraph nomeDoLivro = new Paragraph("Nome do Livro", fontePadraoNegrito);
            nomeDoLivro.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela4 = new PdfPCell(nomeDoLivro);
            celulaMaeTabela4.setRowspan(2);
            celulaMaeTabela4.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela4);

            Paragraph pais = new Paragraph("Pais", fontePadraoNegrito);
            pais.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela6 = new PdfPCell(pais);
            celulaMaeTabela6.setRowspan(2);
            celulaMaeTabela6.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela6);

            Paragraph regiao = new Paragraph("Regiao", fontePadraoNegrito);
            regiao.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela7 = new PdfPCell(regiao);
            celulaMaeTabela7.setRowspan(2);
            celulaMaeTabela7.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela7);

            for (Object objetoTemp : resultados) {
                LivroDaBiblioteca livroDaBiblioteca = (LivroDaBiblioteca) objetoTemp;

                PdfPCell celulaTempDireta = new PdfPCell(new Paragraph(
                        livroDaBiblioteca.getID().toString(), fontePadrao));
                celulaTempDireta.setBackgroundColor(BaseColor.LIGHT_GRAY);
                tabela.addCell(celulaTempDireta);

                PdfPCell celulaTempDireta1 = new PdfPCell(new Paragraph(
                        String.valueOf(livroDaBiblioteca.getOutroCodigo()), fontePadrao));
                celulaTempDireta1.setBackgroundColor(BaseColor.LIGHT_GRAY);
                tabela.addCell(celulaTempDireta1);

                if (livroDaBiblioteca.getAnoLacamento() != 0) {
                    PdfPCell celulaTempDireta2 = new PdfPCell(new Paragraph(
                            String.valueOf(livroDaBiblioteca.getAnoLacamento()), fontePadrao));
                    celulaTempDireta2.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta2);
                } else {
                    PdfPCell celulaTempDireta2 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta2.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta2);
                }
                if (livroDaBiblioteca.getGrafica() != null) {
                    PdfPCell celulaTempDireta3 = new PdfPCell(new Paragraph(
                            livroDaBiblioteca.getGrafica().toString(), fontePadrao));
                    celulaTempDireta3.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta3);
                } else {
                    PdfPCell celulaTempDireta3 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta3.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta3);
                }
                if (livroDaBiblioteca.getNomeAutor() != null) {
                    PdfPCell celulaTempDireta4 = new PdfPCell(new Paragraph(
                            livroDaBiblioteca.getNomeAutor(), fontePadrao));
                    celulaTempDireta4.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta4);
                } else {
                    PdfPCell celulaTempDireta4 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta4.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta4);
                }
                if (livroDaBiblioteca.getNomeLivro() != null) {
                    PdfPCell celulaTempDireta5 = new PdfPCell(new Paragraph(
                            livroDaBiblioteca.getNomeLivro(), fontePadrao));
                    celulaTempDireta5.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta5);
                } else {
                    PdfPCell celulaTempDireta5 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta5.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta5);
                }
                if (livroDaBiblioteca.getPais() != null) {
                    PdfPCell celulaTempDireta6 = new PdfPCell(new Paragraph(
                            livroDaBiblioteca.getPais(), fontePadrao));
                    celulaTempDireta6.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta6);
                } else {
                    PdfPCell celulaTempDireta6 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta6.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta6);
                }
                if (livroDaBiblioteca.getRegiao() != null) {
                    PdfPCell celulaTempDireta7 = new PdfPCell(new Paragraph(
                            livroDaBiblioteca.getRegiao(), fontePadrao));
                    celulaTempDireta7.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta7);
                } else {
                    PdfPCell celulaTempDireta7 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta7.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta7);
                }
            }

            doc.add(tabela);

        }
    }

    private void escreverTabelaTombos(List<Object> resultados, Document doc) throws DocumentException {
        if (!resultados.isEmpty()) {
            doc.newPage();
            PdfPTable tabela = new PdfPTable(new float[]{0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f});

            doc.newPage();

            Paragraph paragrafoID = new Paragraph("ID", fontePadraoNegrito);
            paragrafoID.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela = new PdfPCell(paragrafoID);
            celulaMaeTabela.setRowspan(2);
            celulaMaeTabela.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela);

            Paragraph codigoAux = new Paragraph("Codigo Aux.", fontePadraoNegrito);
            codigoAux.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela1 = new PdfPCell(codigoAux);
            celulaMaeTabela1.setRowspan(2);
            celulaMaeTabela1.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela1);

            Paragraph dataDeUtilizacaoInicial = new Paragraph("Data de Ut. Inicial", fontePadraoNegrito);
            dataDeUtilizacaoInicial.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela2 = new PdfPCell(dataDeUtilizacaoInicial);
            celulaMaeTabela2.setRowspan(2);
            celulaMaeTabela2.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela2);

            Paragraph dataDeUtilizacaoFinal = new Paragraph("Data de Ut. Final", fontePadraoNegrito);
            dataDeUtilizacaoFinal.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela3 = new PdfPCell(dataDeUtilizacaoFinal);
            celulaMaeTabela3.setRowspan(2);
            celulaMaeTabela3.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela3);

            Paragraph estilo = new Paragraph("Estilo", fontePadraoNegrito);
            estilo.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela4 = new PdfPCell(estilo);
            celulaMaeTabela4.setRowspan(2);
            celulaMaeTabela4.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela4);

            Paragraph funcaoEspecifica = new Paragraph("Funçao Especifica", fontePadraoNegrito);
            funcaoEspecifica.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela5 = new PdfPCell(funcaoEspecifica);
            celulaMaeTabela5.setRowspan(2);
            celulaMaeTabela5.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela5);

            Paragraph grupoLinguistico = new Paragraph("Grupo Ling.", fontePadraoNegrito);
            grupoLinguistico.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela6 = new PdfPCell(grupoLinguistico);
            celulaMaeTabela6.setRowspan(2);
            celulaMaeTabela6.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela6);

            Paragraph materiaPrima = new Paragraph("Materia Prima", fontePadraoNegrito);
            materiaPrima.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela7 = new PdfPCell(materiaPrima);
            celulaMaeTabela7.setRowspan(2);
            celulaMaeTabela7.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela7);

            Paragraph pais = new Paragraph("Pais", fontePadraoNegrito);
            pais.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela8 = new PdfPCell(pais);
            celulaMaeTabela8.setRowspan(2);
            celulaMaeTabela8.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela8);

            Paragraph procedencia = new Paragraph("Procedencia", fontePadraoNegrito);
            procedencia.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela9 = new PdfPCell(procedencia);
            celulaMaeTabela9.setRowspan(2);
            celulaMaeTabela9.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela9);

            Paragraph regiao = new Paragraph("Regiao", fontePadraoNegrito);
            regiao.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela10 = new PdfPCell(regiao);
            celulaMaeTabela10.setRowspan(2);
            celulaMaeTabela10.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela10);

            Paragraph sitio = new Paragraph("Sitio", fontePadraoNegrito);
            sitio.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela11 = new PdfPCell(sitio);
            celulaMaeTabela11.setRowspan(2);
            celulaMaeTabela11.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela11);

            Paragraph tecManufatura = new Paragraph("Tec. de Manufatura", fontePadraoNegrito);
            tecManufatura.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela12 = new PdfPCell(tecManufatura);
            celulaMaeTabela12.setRowspan(2);
            celulaMaeTabela12.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela12);

            Paragraph tipoDeObjeto = new Paragraph("Tipo de Objeto", fontePadraoNegrito);
            tipoDeObjeto.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela13 = new PdfPCell(tipoDeObjeto);
            celulaMaeTabela13.setRowspan(2);
            celulaMaeTabela13.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela13);

            for (Object objetoTemp : resultados) {
                ItemTombo itemTombo = (ItemTombo) objetoTemp;

                PdfPCell celulaTempDireta = new PdfPCell(new Paragraph(
                        itemTombo.getID().toString(), fontePadrao));
                celulaTempDireta.setBackgroundColor(BaseColor.LIGHT_GRAY);
                tabela.addCell(celulaTempDireta);

                PdfPCell celulaTempDireta1 = new PdfPCell(new Paragraph(
                        String.valueOf(itemTombo.getOutroCodigo()), fontePadrao));
                celulaTempDireta1.setBackgroundColor(BaseColor.LIGHT_GRAY);
                tabela.addCell(celulaTempDireta1);

                if (itemTombo.getDataUtilizacaoInicial() != null) {
                    PdfPCell celulaTempDireta2 = new PdfPCell(new Paragraph(
                            itemTombo.getDataUtilizacaoInicial().toString(), fontePadrao));
                    celulaTempDireta2.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta2);
                } else {
                    PdfPCell celulaTempDireta2 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta2.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta2);
                }
                if (itemTombo.getDataUtilizacaoFinal() != null) {
                    PdfPCell celulaTempDireta3 = new PdfPCell(new Paragraph(
                            itemTombo.getDataUtilizacaoFinal().toString(), fontePadrao));
                    celulaTempDireta3.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta3);
                } else {
                    PdfPCell celulaTempDireta3 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta3.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta3);
                }
                if (itemTombo.getEstilo() != null) {
                    PdfPCell celulaTempDireta4 = new PdfPCell(new Paragraph(
                            itemTombo.getEstilo(), fontePadrao));
                    celulaTempDireta4.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta4);
                } else {
                    PdfPCell celulaTempDireta4 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta4.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta4);
                }
                if (itemTombo.getFuncaoEspecifica() != null) {
                    PdfPCell celulaTempDireta5 = new PdfPCell(new Paragraph(
                            itemTombo.getFuncaoEspecifica(), fontePadrao));
                    celulaTempDireta5.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta5);
                } else {
                    PdfPCell celulaTempDireta5 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta5.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta5);
                }
                if (itemTombo.getGrupoLinguistico() != null) {
                    PdfPCell celulaTempDireta6 = new PdfPCell(new Paragraph(
                            itemTombo.getGrupoLinguistico(), fontePadrao));
                    celulaTempDireta6.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta6);
                } else {
                    PdfPCell celulaTempDireta6 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta6.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta6);
                }
                if (itemTombo.getMateriaPrima() != null) {
                    PdfPCell celulaTempDireta7 = new PdfPCell(new Paragraph(
                            itemTombo.getMateriaPrima(), fontePadrao));
                    celulaTempDireta7.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta7);
                } else {
                    PdfPCell celulaTempDireta7 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta7.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta7);
                }
                if (itemTombo.getPais() != null) {
                    PdfPCell celulaTempDireta8 = new PdfPCell(new Paragraph(
                            itemTombo.getPais(), fontePadrao));
                    celulaTempDireta8.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta8);
                } else {
                    PdfPCell celulaTempDireta8 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta8.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta8);
                }
                if (itemTombo.getProcedencia() != null) {
                    PdfPCell celulaTempDireta9 = new PdfPCell(new Paragraph(
                            itemTombo.getProcedencia(), fontePadrao));
                    celulaTempDireta9.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta9);
                } else {
                    PdfPCell celulaTempDireta9 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta9.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta9);
                }
                if (itemTombo.getRegiao() != null) {
                    PdfPCell celulaTempDireta10 = new PdfPCell(new Paragraph(
                            itemTombo.getRegiao(), fontePadrao));
                    celulaTempDireta10.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta10);
                } else {
                    PdfPCell celulaTempDireta10 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta10.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta10);
                }
                if (itemTombo.getSitio() != null) {
                    PdfPCell celulaTempDireta11 = new PdfPCell(new Paragraph(
                            itemTombo.getSitio(), fontePadrao));
                    celulaTempDireta11.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta11);
                } else {
                    PdfPCell celulaTempDireta11 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta11.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta11);
                }
                if (itemTombo.getTecnicaManufatura() != null) {
                    PdfPCell celulaTempDireta12 = new PdfPCell(new Paragraph(
                            itemTombo.getTecnicaManufatura(), fontePadrao));
                    celulaTempDireta12.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta12);
                } else {
                    PdfPCell celulaTempDireta12 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta12.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta12);
                }
                if (itemTombo.getTipoObjeto() != null) {
                    PdfPCell celulaTempDireta13 = new PdfPCell(new Paragraph(
                            itemTombo.getTipoObjeto(), fontePadrao));
                    celulaTempDireta13.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta13);
                } else {
                    PdfPCell celulaTempDireta13 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta13.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta13);
                }

            }

            doc.add(tabela);

        }
    }

    private void escreverTabelaConsignados(List<Object> resultados, Document doc) throws DocumentException {
        if (!resultados.isEmpty()) {
            doc.newPage();
            PdfPTable tabela = new PdfPTable(new float[]{0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f, 0.3f});

            doc.newPage();

            Paragraph paragrafoID = new Paragraph("ID", fontePadraoNegrito);
            paragrafoID.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela = new PdfPCell(paragrafoID);
            celulaMaeTabela.setRowspan(2);
            celulaMaeTabela.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela);

            Paragraph codigoAux = new Paragraph("Codigo Aux.", fontePadraoNegrito);
            codigoAux.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela1 = new PdfPCell(codigoAux);
            celulaMaeTabela1.setRowspan(2);
            celulaMaeTabela1.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela1);

            Paragraph dataDeUtilizacaoInicial = new Paragraph("Data de Ut. Inicial", fontePadraoNegrito);
            dataDeUtilizacaoInicial.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela2 = new PdfPCell(dataDeUtilizacaoInicial);
            celulaMaeTabela2.setRowspan(2);
            celulaMaeTabela2.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela2);

            Paragraph dataDeUtilizacaoFinal = new Paragraph("Data de Ut. Final", fontePadraoNegrito);
            dataDeUtilizacaoFinal.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela3 = new PdfPCell(dataDeUtilizacaoFinal);
            celulaMaeTabela3.setRowspan(2);
            celulaMaeTabela3.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela3);

            Paragraph estilo = new Paragraph("Estilo", fontePadraoNegrito);
            estilo.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela4 = new PdfPCell(estilo);
            celulaMaeTabela4.setRowspan(2);
            celulaMaeTabela4.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela4);

            Paragraph funcaoEspecifica = new Paragraph("Funçao Especifica", fontePadraoNegrito);
            funcaoEspecifica.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela5 = new PdfPCell(funcaoEspecifica);
            celulaMaeTabela5.setRowspan(2);
            celulaMaeTabela5.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela5);

            Paragraph grupoLinguistico = new Paragraph("Grupo Ling.", fontePadraoNegrito);
            grupoLinguistico.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela6 = new PdfPCell(grupoLinguistico);
            celulaMaeTabela6.setRowspan(2);
            celulaMaeTabela6.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela6);

            Paragraph materiaPrima = new Paragraph("Materia Prima", fontePadraoNegrito);
            materiaPrima.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela7 = new PdfPCell(materiaPrima);
            celulaMaeTabela7.setRowspan(2);
            celulaMaeTabela7.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela7);

            Paragraph pais = new Paragraph("Pais", fontePadraoNegrito);
            pais.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela8 = new PdfPCell(pais);
            celulaMaeTabela8.setRowspan(2);
            celulaMaeTabela8.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela8);

            Paragraph procedencia = new Paragraph("Procedencia", fontePadraoNegrito);
            procedencia.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela9 = new PdfPCell(procedencia);
            celulaMaeTabela9.setRowspan(2);
            celulaMaeTabela9.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela9);

            Paragraph regiao = new Paragraph("Regiao", fontePadraoNegrito);
            regiao.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela10 = new PdfPCell(regiao);
            celulaMaeTabela10.setRowspan(2);
            celulaMaeTabela10.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela10);

            Paragraph sitio = new Paragraph("Sitio", fontePadraoNegrito);
            sitio.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela11 = new PdfPCell(sitio);
            celulaMaeTabela11.setRowspan(2);
            celulaMaeTabela11.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela11);

            Paragraph tecManufatura = new Paragraph("Tec. de Manufatura", fontePadraoNegrito);
            tecManufatura.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela12 = new PdfPCell(tecManufatura);
            celulaMaeTabela12.setRowspan(2);
            celulaMaeTabela12.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela12);

            Paragraph tipoDeObjeto = new Paragraph("Tipo de Objeto", fontePadraoNegrito);
            tipoDeObjeto.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela13 = new PdfPCell(tipoDeObjeto);
            celulaMaeTabela13.setRowspan(2);
            celulaMaeTabela13.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela13);

            Paragraph dataDeEmprestimo = new Paragraph("Data de Emprestimo", fontePadraoNegrito);
            dataDeEmprestimo.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela14 = new PdfPCell(dataDeEmprestimo);
            celulaMaeTabela14.setRowspan(2);
            celulaMaeTabela14.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela14);

            Paragraph dataDeDevolucao = new Paragraph("Data de Devoluçao", fontePadraoNegrito);
            dataDeDevolucao.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela15 = new PdfPCell(dataDeDevolucao);
            celulaMaeTabela15.setRowspan(2);
            celulaMaeTabela15.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela15);

            Paragraph responsavelDaFamilia = new Paragraph("Responsavel da Familia", fontePadraoNegrito);
            responsavelDaFamilia.setAlignment(Paragraph.ALIGN_CENTER);
            PdfPCell celulaMaeTabela16 = new PdfPCell(responsavelDaFamilia);
            celulaMaeTabela16.setRowspan(2);
            celulaMaeTabela16.setBackgroundColor(new BaseColor(COR_TABELA_CABECALHO_RED, COR_TABELA_CABECALHO_GREEN, COR_TABELA_CABECALHO_BLUE));
            tabela.addCell(celulaMaeTabela16);

            for (Object objetoTemp : resultados) {
                ItemConsignado itemConsignado = (ItemConsignado) objetoTemp;

                PdfPCell celulaTempDireta = new PdfPCell(new Paragraph(
                        itemConsignado.getID().toString(), fontePadrao));
                celulaTempDireta.setBackgroundColor(BaseColor.LIGHT_GRAY);
                tabela.addCell(celulaTempDireta);

                PdfPCell celulaTempDireta1 = new PdfPCell(new Paragraph(
                        String.valueOf(itemConsignado.getOutroCodigo()), fontePadrao));
                celulaTempDireta1.setBackgroundColor(BaseColor.LIGHT_GRAY);
                tabela.addCell(celulaTempDireta1);

                if (itemConsignado.getDataUtilizacaoInicial() != null) {
                    PdfPCell celulaTempDireta2 = new PdfPCell(new Paragraph(
                            itemConsignado.getDataUtilizacaoInicial().toString(), fontePadrao));
                    celulaTempDireta2.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta2);
                } else {
                    PdfPCell celulaTempDireta2 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta2.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta2);
                }
                if (itemConsignado.getDataUtilizacaoFinal() != null) {
                    PdfPCell celulaTempDireta3 = new PdfPCell(new Paragraph(
                            itemConsignado.getDataUtilizacaoFinal().toString(), fontePadrao));
                    celulaTempDireta3.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta3);
                } else {
                    PdfPCell celulaTempDireta3 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta3.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta3);
                }
                if (itemConsignado.getEstilo() != null) {
                    PdfPCell celulaTempDireta4 = new PdfPCell(new Paragraph(
                            itemConsignado.getEstilo(), fontePadrao));
                    celulaTempDireta4.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta4);
                } else {
                    PdfPCell celulaTempDireta4 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta4.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta4);
                }
                if (itemConsignado.getFuncaoEspecifica() != null) {
                    PdfPCell celulaTempDireta5 = new PdfPCell(new Paragraph(
                            itemConsignado.getFuncaoEspecifica(), fontePadrao));
                    celulaTempDireta5.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta5);
                } else {
                    PdfPCell celulaTempDireta5 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta5.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta5);
                }
                if (itemConsignado.getGrupoLinguistico() != null) {
                    PdfPCell celulaTempDireta6 = new PdfPCell(new Paragraph(
                            itemConsignado.getGrupoLinguistico(), fontePadrao));
                    celulaTempDireta6.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta6);
                } else {
                    PdfPCell celulaTempDireta6 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta6.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta6);
                }
                if (itemConsignado.getMateriaPrima() != null) {
                    PdfPCell celulaTempDireta7 = new PdfPCell(new Paragraph(
                            itemConsignado.getMateriaPrima(), fontePadrao));
                    celulaTempDireta7.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta7);
                } else {
                    PdfPCell celulaTempDireta7 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta7.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta7);
                }
                if (itemConsignado.getPais() != null) {
                    PdfPCell celulaTempDireta8 = new PdfPCell(new Paragraph(
                            itemConsignado.getPais(), fontePadrao));
                    celulaTempDireta8.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta8);
                } else {
                    PdfPCell celulaTempDireta8 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta8.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta8);
                }
                if (itemConsignado.getProcedencia() != null) {
                    PdfPCell celulaTempDireta9 = new PdfPCell(new Paragraph(
                            itemConsignado.getProcedencia(), fontePadrao));
                    celulaTempDireta9.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta9);
                } else {
                    PdfPCell celulaTempDireta9 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta9.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta9);
                }
                if (itemConsignado.getRegiao() != null) {
                    PdfPCell celulaTempDireta10 = new PdfPCell(new Paragraph(
                            itemConsignado.getRegiao(), fontePadrao));
                    celulaTempDireta10.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta10);
                } else {
                    PdfPCell celulaTempDireta10 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta10.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta10);
                }
                if (itemConsignado.getSitio() != null) {
                    PdfPCell celulaTempDireta11 = new PdfPCell(new Paragraph(
                            itemConsignado.getSitio(), fontePadrao));
                    celulaTempDireta11.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta11);
                } else {
                    PdfPCell celulaTempDireta11 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta11.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta11);
                }
                if (itemConsignado.getTecnicaManufatura() != null) {
                    PdfPCell celulaTempDireta12 = new PdfPCell(new Paragraph(
                            itemConsignado.getTecnicaManufatura(), fontePadrao));
                    celulaTempDireta12.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta12);
                } else {
                    PdfPCell celulaTempDireta12 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta12.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta12);
                }
                if (itemConsignado.getTipoObjeto() != null) {
                    PdfPCell celulaTempDireta13 = new PdfPCell(new Paragraph(
                            itemConsignado.getTipoObjeto(), fontePadrao));
                    celulaTempDireta13.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta13);
                } else {
                    PdfPCell celulaTempDireta13 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta13.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta13);
                }
                if (itemConsignado.getDataDoEmprestimo() != null) {
                    PdfPCell celulaTempDireta14 = new PdfPCell(new Paragraph(
                            itemConsignado.getDataDoEmprestimo().toString(), fontePadrao));
                    celulaTempDireta14.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta14);
                } else {
                    PdfPCell celulaTempDireta14 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta14.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta14);
                }
                if (itemConsignado.getDataDeDevolucao() != null) {
                    PdfPCell celulaTempDireta15 = new PdfPCell(new Paragraph(
                            itemConsignado.getDataDeDevolucao().toString(), fontePadrao));
                    celulaTempDireta15.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta15);
                } else {
                    PdfPCell celulaTempDireta15 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta15.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta15);
                }
                if (itemConsignado.getResponsavelDaFamilia() != null) {
                    PdfPCell celulaTempDireta16 = new PdfPCell(new Paragraph(
                            itemConsignado.getResponsavelDaFamilia(), fontePadrao));
                    celulaTempDireta16.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta16);
                } else {
                    PdfPCell celulaTempDireta16 = new PdfPCell(new Paragraph("-", fontePadrao));
                    celulaTempDireta16.setBackgroundColor(BaseColor.LIGHT_GRAY);
                    tabela.addCell(celulaTempDireta16);

                }
            }

            doc.add(tabela);

        }
    }

    private Paragraph recuperaRodape() {
        Font fonteRodape = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.NORMAL);

        String rodape = "\n\n\u00a9 Todos os direitos reservados - Museu Oswaldo Aranha";
        return new Paragraph(rodape, fonteRodape);
    }
}
