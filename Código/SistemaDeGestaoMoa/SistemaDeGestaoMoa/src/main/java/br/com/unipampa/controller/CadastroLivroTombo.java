/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipampa.controller;

import br.com.unipampa.model.ItemTombo;
import br.com.unipampa.servico.UploadDeArquivo;
import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Gabriel B Moro
 */
@WebServlet(name = "CadastroLivroTombo", urlPatterns = {"/CadastroLivroTombo"})
public class CadastroLivroTombo extends HttpServlet {

     private boolean isMultipart;
    private String filePath;
    private int maxFileSize = 5 * 1024;
    private int maxMemSize = 4 * 1024;
    private File file;
  
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
ItemTombo itemTemp=null;

        if(request.getParameter("codigoAuxiliar")!=null){
        int outroCodigo = Integer.parseInt(request.getParameter("codigoAuxiliar"));
        String materiaPrima = request.getParameter("materiaPrima");
        String dataDeUtilizacaoInicial = request.getParameter("dataDeUtilizacaoInicial");
        String dataDeUtilizacaoFinal = request.getParameter("dataDeUtilizacaoFinal");
        String tipoDeObjeto = request.getParameter("tipoDeObjeto");
        String funcaoEspecifica = request.getParameter("funcaoEspecifica");
        String cultura = request.getParameter("cultura");
        String estilo = request.getParameter("estilo");
        String procedencia = request.getParameter("procedencia");
        String grupoLinguistico = request.getParameter("grupoLinguistico");
        String tecnicaManufatura = request.getParameter("tecnicaManufatura");
        String regiao = request.getParameter("regiao");
        String sitio = request.getParameter("sitio");
        String pais = request.getParameter("pais");

         ItemTombo itemTombo = new ItemTombo();
        itemTombo.setOutroCodigo(outroCodigo);
        itemTombo.setMateriaPrima(materiaPrima);
        itemTombo.setDataUtilizacaoInicial(dataDeUtilizacaoInicial);
        itemTombo.setDataUtilizacaoFinal(dataDeUtilizacaoFinal);
        itemTombo.setTipoObjeto(tipoDeObjeto);
        itemTombo.setFuncaoEspecifica(funcaoEspecifica);
        itemTombo.setCultura(cultura);
        itemTombo.setProcedencia(procedencia);
        itemTombo.setEstilo(estilo);
        itemTombo.setTecnicaManufatura(tecnicaManufatura);
        itemTombo.setRegiao(regiao);
        itemTombo.setSitio(sitio);
        itemTombo.setPais(pais);
        itemTombo.setGrupoLinguistico(grupoLinguistico);
        itemTombo.setImagemEnviada(false);
        if (itemTombo.cadastrarItem(itemTombo)) {
            itemTemp = itemTombo.buscarItem(itemTombo);
        } 
     }
        request.getSession().setAttribute("itemRecemCadastrado", itemTemp);
        response.sendRedirect("./cadastroDeItemLivroTombo2etapa.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
