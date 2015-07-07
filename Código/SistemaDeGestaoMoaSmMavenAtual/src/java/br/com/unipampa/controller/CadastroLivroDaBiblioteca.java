/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipampa.controller;

import br.com.unipampa.model.LivroDaBiblioteca;
import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItemIterator;

/**
 *
 * @author Rodrigo
 */
@WebServlet(name = "CadastroLivroDaBiblioteca", urlPatterns = {"/CadastroLivroDaBiblioteca"})
public class CadastroLivroDaBiblioteca extends HttpServlet{
    
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
LivroDaBiblioteca itemTemp=null;

      if(request.getParameter("codigoAuxiliar")!=null){
        int outroCodigo = Integer.parseInt(request.getParameter("codigoAuxiliar"));
        String tituloLivro = request.getParameter("tituloLivro");
        String autorLivro = request.getParameter("autorLivro");
        String grafica = request.getParameter("grafica");
        String ano = request.getParameter("ano");
        String estado = request.getParameter("estado");
        String pais = request.getParameter("pais");
        
        LivroDaBiblioteca livroDaBiblioteca = new LivroDaBiblioteca();
        livroDaBiblioteca.setOutroCodigo(outroCodigo);
        livroDaBiblioteca.setNomeLivro(tituloLivro);
        livroDaBiblioteca.setNomeAutor(autorLivro);       
        livroDaBiblioteca.setGrafica(grafica);
        livroDaBiblioteca.setAnoLacamento(ano);
        livroDaBiblioteca.setRegiao(estado);
        livroDaBiblioteca.setPais(pais);
        
         if (livroDaBiblioteca.cadastrarLivro(livroDaBiblioteca)) {
            itemTemp = livroDaBiblioteca.buscarLivro(livroDaBiblioteca);
        }
     }
        request.getSession().setAttribute("livroRecemCadastrado", itemTemp);
        response.sendRedirect("./cadastroLivroDaBiblioteca2etapa.jsp");
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
