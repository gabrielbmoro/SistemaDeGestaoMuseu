/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.view;

import br.unipampa.model.ItemConsignado;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Date;

/**
 *
 * @author gabrielbmoro
 */
public class FrameInformacoesEditarLivroConsignado extends javax.swing.JFrame implements WindowListener{

    private ItemConsignado itemConsignado;

    /**
     * Creates new form FrameInformacoesEditarLivroConsignado
     */
    public FrameInformacoesEditarLivroConsignado(ItemConsignado itemConsignado, boolean informacoes) {
        initComponents();
        this.itemConsignado = itemConsignado;

        preencherCampos();
        if (informacoes) {
            desabilitarComponentes();
            btnAtualizarDados.setEnabled(false);
            btnEditarLivroConsignado.setEnabled(true);
        } else {
            btnEditarLivroConsignado.setEnabled(false);
        }
        ConfiguracaoFrame.configFrameComTamanhoPersonalizado(this, 1108, 405);
        addWindowListener(this);
    }

    private void desabilitarComponentes() {
        this.txtMateriaPrimaLivroConsignado.setEnabled(false);
        this.jDateEmprestimoLivroConsignado.setEnabled(false);
        this.jDateChooserDevolucaoLivroConsignado.setEnabled(false);
        this.jDateDeUtilizacaoInicialLivroConsignado.setEnabled(false);
        this.jDateDeUtilizacaoFinalLivroConsignado.setEnabled(false);
        this.txtResponsavelDaFamiliaLivroConsignado.setEnabled(false);
        this.txtEstiloLivroConsignado.setEnabled(false);
        this.txtGrupoLingLivroConsignado.setEnabled(false);
        this.txtRegiaoLivroConsignado.setEnabled(false);
        this.jComboPaisLivroConsignado.setEnabled(false);
        this.txtProcedenciaLivroConsignado.setEnabled(false);
        this.txtFuncaoEspecificaLivroConsignado.setEnabled(false);
        this.txtCulturaLivroConsignado.setEnabled(false);
        this.txtSitioLivroConsignado.setEnabled(false);
        this.txtTecmanufaturaLivroConsignado1.setEnabled(false);
        this.txtTipoDeObjetoLivroConsignado.setEnabled(false);
         this.txtCodigoAuxiliarLivroConsignado.setEnabled(false);
    }

    private void habilitarComponentes() {
        this.txtMateriaPrimaLivroConsignado.setEnabled(true);
        this.jDateEmprestimoLivroConsignado.setEnabled(true);
        this.jDateChooserDevolucaoLivroConsignado.setEnabled(true);
        this.jDateDeUtilizacaoInicialLivroConsignado.setEnabled(true);
        this.jDateDeUtilizacaoFinalLivroConsignado.setEnabled(true);
        this.txtResponsavelDaFamiliaLivroConsignado.setEnabled(true);
        this.txtEstiloLivroConsignado.setEnabled(true);
        this.txtGrupoLingLivroConsignado.setEnabled(true);
        this.txtRegiaoLivroConsignado.setEnabled(true);
        this.jComboPaisLivroConsignado.setEnabled(true);
        this.txtProcedenciaLivroConsignado.setEnabled(true);
        this.txtFuncaoEspecificaLivroConsignado.setEnabled(true);
        this.txtCulturaLivroConsignado.setEnabled(true);
        this.txtSitioLivroConsignado.setEnabled(true);
        this.txtTecmanufaturaLivroConsignado1.setEnabled(true);
        this.txtTipoDeObjetoLivroConsignado.setEnabled(true);
        this.txtCodigoAuxiliarLivroConsignado.setEnabled(true);
    }

    private void preencherCampos() {
        this.txtMateriaPrimaLivroConsignado.setText(itemConsignado.getMateriaPrima());
//        this.jDateEmprestimoLivroConsignado.setDate(new Date(itemConsignado.getDataDeDevolucao()));
//        this.jDateChooserDevolucaoLivroConsignado.setDate(new Date(itemConsignado.getDataDeDevolucao()));
//        this.jDateDeUtilizacaoInicialLivroConsignado.setDate(new Date(itemConsignado.getDataUtilizacaoInicial()));
//        this.jDateDeUtilizacaoFinalLivroConsignado.setDate(new Date(itemConsignado.getDataUtilizacaoFinal()));
        this.txtResponsavelDaFamiliaLivroConsignado.setText(itemConsignado.getResponsavelDaFamilia());
        this.txtEstiloLivroConsignado.setText(itemConsignado.getEstilo());
        this.txtGrupoLingLivroConsignado.setText(itemConsignado.getGrupoLinguistico());
        this.txtRegiaoLivroConsignado.setText(itemConsignado.getRegiao());
        this.jComboPaisLivroConsignado.setSelectedItem(itemConsignado.getPais());
        this.txtProcedenciaLivroConsignado.setText(itemConsignado.getProcedencia());
        this.txtFuncaoEspecificaLivroConsignado.setText(itemConsignado.getFuncaoEspecifica());
        this.txtCulturaLivroConsignado.setText(itemConsignado.getCultura());
        this.txtSitioLivroConsignado.setText(itemConsignado.getSitio());
        this.txtTecmanufaturaLivroConsignado1.setText(itemConsignado.getTecnicaManufatura());
        this.txtTipoDeObjetoLivroConsignado.setText(itemConsignado.getTipoObjeto());
        this.txtCodigoAuxiliarLivroConsignado.setText(String.valueOf(itemConsignado.getOutroCodigo()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateEmprestimoLivroConsignado = new com.toedter.calendar.JDateChooser();
        txtCodigoAuxiliarLivroConsignado = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMateriaPrimaLivroConsignado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtResponsavelDaFamiliaLivroConsignado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jDateDeUtilizacaoInicialLivroConsignado = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txtTipoDeObjetoLivroConsignado = new javax.swing.JTextField();
        jDateDeUtilizacaoFinalLivroConsignado = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jDateChooserDevolucaoLivroConsignado = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtRegiaoLivroConsignado = new javax.swing.JTextField();
        txtTecmanufaturaLivroConsignado1 = new javax.swing.JTextField();
        txtEstiloLivroConsignado = new javax.swing.JTextField();
        txtFuncaoEspecificaLivroConsignado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtGrupoLingLivroConsignado = new javax.swing.JTextField();
        txtCulturaLivroConsignado = new javax.swing.JTextField();
        txtProcedenciaLivroConsignado = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtSitioLivroConsignado = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jComboPaisLivroConsignado = new javax.swing.JComboBox();
        btnAtualizarDados = new javax.swing.JButton();
        btnEditarLivroConsignado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Informaçoes Item Livro Consignado");

        jLabel1.setText("*Codigo Auxiliar:");

        jLabel3.setText("Data do Emprestimo:");

        txtCodigoAuxiliarLivroConsignado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        jLabel2.setText("*Materia Prima:");

        jLabel4.setText("*Data de Devoluçao:");

        jLabel5.setText("*Responsavel da Familia:");

        jLabel6.setText("Data de Utilizaçao Inicial:");

        jLabel8.setText("*Tipo de Objeto:");

        jLabel7.setText("Data de Utilizaçao Final:");

        jLabel9.setText("Funçao Especifica:");

        jLabel11.setText("Estilo:");

        jLabel13.setText("Tecnica de Manufatura:");

        jLabel15.setText("Regiao:");

        jLabel10.setText("Cultura:");

        jLabel12.setText("Grupo Linguistico:");

        txtGrupoLingLivroConsignado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGrupoLingLivroConsignadoActionPerformed(evt);
            }
        });

        txtCulturaLivroConsignado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCulturaLivroConsignadoActionPerformed(evt);
            }
        });

        jLabel14.setText("Procedencia:");

        jLabel16.setText("Sitio:");

        jLabel17.setText("Pais:");

        jComboPaisLivroConsignado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-------------------", "África do Sul", "Albânia", "Alemanha", " Andorra", "Angola", "Anguilla", "Antigua", "Arábia Saudita", "Argentina", "Armênia", "Aruba", "Austrália", "Áustria", "Azerbaijão", "Bahamas", "Bahrein", "Bangladesh", "Barbados", "Bélgica", "Benin", "Bermudas", "Botsuana", "Brasil", "Brunei", "Bulgária", "Burkina Fasso", "Botão", "Cabo Verde", "Camarões", "Camboja", "Canadá", "Cazaquistão", "Chade", "Chile", "China", "Cidade do Vaticano", "Colômbia", "Congo", "Coréia do Sul", "Costa do Marfim", "Costa Rica", "Croácia", "Dinamarca", "Djibuti", "Dominica", "EUA", "Egito", "El Salvador", "Emirados Árabe", "Equador", "Eritréia", "Escócia", "Eslováquia", "Eslovênia", "Espanha", "Estônia", "Etiópia", "Fiji", "Filipinas", "Finlândia", "França", "Gabão", "Gâmbia", "Gana", "Geórgia", "Gibraltar", "Granada", "Grécia", "Guadalupe", "Guam", "Guatemala", "Guiana", "Guiana Francesa", "Guiné-bissau", "Haiti", "Holanda", "Honduras", "Hong Kong", "Hungria", "Iêmen", "Ilhas Cayman", "Ilhas Cook", "Ilhas Curaçao", "Ilhas Marshall", "Ilhas Turks & Caicos", "Ilhas Virgens (brit.)", "lhas Virgens(amer.)", "Ilhas Wallis e Futuna", "Índia", "Indonésia", "Inglaterra", "Irlanda", "Islândia", "Israel", "Itália", "Jamaica", "Japão", "Jordânia", "Kuwait", "Latvia", "Líbano", "Liechtenstein", "Lituânia", "Luxemburgo", "Macau", "Macedônia", "Madagascar", "Malásia", "Malaui", "Mali", "Malta", "Marrocos", "Martinica", "Mauritânia", "Mauritius", "México", "Moldova", "Mônaco", "Montserrat", "Nepal", "Nicarágua", "Niger", "Nigéria", "Noruega", "Nova Caledônia", "Nova Zelândia", "Omã", "Palau", "Panamá", "Papua-nova Guiné", "Paquistão", "Peru", "Polinésia Francesa", "Polônia", "Porto Rico", "Portugal", "Qatar", "Quênia", "Rep. Dominicana", "Rep. Tcheca", "Reunion", "Romênia", "Ruanda", "Rússia", "Saipan", "Samoa Americana", "Senegal", "Serra Leone", "Seychelles", "Singapura", "Síria", "Sri Lanka", "St. Kitts & Nevis", "St. Lúcia", "St. Vincent", "Sudão", "Suécia", "Suiça", "Suriname", "Tailândia", "Taiwan", "Tanzânia", "Togo", "Trinidad & Tobago", "Tunísia", "Turquia", "Ucrânia", "Uganda", "Uruguai", "Venezuela", "Vietnã", "Zaire", "Zâmbia", "Zimbábue" }));
        jComboPaisLivroConsignado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboPaisLivroConsignadoActionPerformed(evt);
            }
        });

        btnAtualizarDados.setText("Atualizar Dados");

        btnEditarLivroConsignado.setText("Editar");
        btnEditarLivroConsignado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarLivroConsignadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigoAuxiliarLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtMateriaPrimaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFuncaoEspecificaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCulturaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateDeUtilizacaoInicialLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateDeUtilizacaoFinalLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateEmprestimoLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooserDevolucaoLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEstiloLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGrupoLingLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTecmanufaturaLivroConsignado1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProcedenciaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtRegiaoLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(137, 137, 137)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSitioLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jComboPaisLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(258, 258, 258))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtResponsavelDaFamiliaLivroConsignado))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTipoDeObjetoLivroConsignado))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEditarLivroConsignado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAtualizarDados)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoAuxiliarLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMateriaPrimaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jDateEmprestimoLivroConsignado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooserDevolucaoLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResponsavelDaFamiliaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateDeUtilizacaoInicialLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateDeUtilizacaoFinalLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoDeObjetoLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFuncaoEspecificaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCulturaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstiloLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGrupoLingLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTecmanufaturaLivroConsignado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProcedenciaLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegiaoLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSitioLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jComboPaisLivroConsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizarDados)
                    .addComponent(btnEditarLivroConsignado))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGrupoLingLivroConsignadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGrupoLingLivroConsignadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGrupoLingLivroConsignadoActionPerformed

    private void txtCulturaLivroConsignadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCulturaLivroConsignadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCulturaLivroConsignadoActionPerformed

    private void jComboPaisLivroConsignadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboPaisLivroConsignadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboPaisLivroConsignadoActionPerformed

    private void btnEditarLivroConsignadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarLivroConsignadoActionPerformed
        habilitarComponentes();
        btnAtualizarDados.setEnabled(true);
    }//GEN-LAST:event_btnEditarLivroConsignadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarDados;
    private javax.swing.JButton btnEditarLivroConsignado;
    private javax.swing.JComboBox jComboPaisLivroConsignado;
    private com.toedter.calendar.JDateChooser jDateChooserDevolucaoLivroConsignado;
    private com.toedter.calendar.JDateChooser jDateDeUtilizacaoFinalLivroConsignado;
    private com.toedter.calendar.JDateChooser jDateDeUtilizacaoInicialLivroConsignado;
    private com.toedter.calendar.JDateChooser jDateEmprestimoLivroConsignado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField txtCodigoAuxiliarLivroConsignado;
    private javax.swing.JTextField txtCulturaLivroConsignado;
    private javax.swing.JTextField txtEstiloLivroConsignado;
    private javax.swing.JTextField txtFuncaoEspecificaLivroConsignado;
    private javax.swing.JTextField txtGrupoLingLivroConsignado;
    private javax.swing.JTextField txtMateriaPrimaLivroConsignado;
    private javax.swing.JTextField txtProcedenciaLivroConsignado;
    private javax.swing.JTextField txtRegiaoLivroConsignado;
    private javax.swing.JTextField txtResponsavelDaFamiliaLivroConsignado;
    private javax.swing.JTextField txtSitioLivroConsignado;
    private javax.swing.JTextField txtTecmanufaturaLivroConsignado1;
    private javax.swing.JTextField txtTipoDeObjetoLivroConsignado;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
}
