/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipampa.controller;

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
@WebServlet(name = "TrataUploadDeImagem", urlPatterns = {"/TrataUploadDeImagem"})
public class TrataUploadDeImagem extends HttpServlet {

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
       
        Object idDoObjeto = request.getSession().getAttribute("idDaFoto");
        if(idDoObjeto!=null){
            String idDeObjeto = String.valueOf(idDoObjeto);
//            request.getSession().setAttribute("idDaFoto",null);
      isMultipart = ServletFileUpload.isMultipartContent(request);
//        response.setContentType("text/html");
        if (isMultipart) {
            ServletFileUpload upload = new ServletFileUpload();
            try {
                FileItemIterator iterador = upload.getItemIterator(request);
                while (iterador.hasNext()) {
                    FileItemStream item = iterador.next();
                    String path = getServletContext().getRealPath("/");
                    if (item.getName().contains(".jpeg") == true || item.getName().contains(".jpg")) {
                        if (UploadDeArquivo.processarArquivo(path, item, idDeObjeto+".jpg")) {
//                            request.getSession().setAttribute("envioArquivo", true);
//                            itemTombo.registrarEnvioDeTrabalho(itemTombo);
                        } else {
//                            request.getSession().setAttribute("envioArquivo", false);
                        }
                    } else {
//                        request.getSession().setAttribute("envioArquivo", false);
                    }
                }
            } catch (FileUploadException erroDeArquivo) {

            }
        } else {
//            request.getSession().setAttribute("envioArquivo", false);
        }
    }
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
//        processRequest(request, response);
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
