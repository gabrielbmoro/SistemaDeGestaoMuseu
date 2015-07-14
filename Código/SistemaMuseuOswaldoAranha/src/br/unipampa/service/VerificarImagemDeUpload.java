/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.apache.commons.fileupload.FileItemStream;

/**
 *
 * @author gabrielbmoro
 */
public class VerificarImagemDeUpload {

     public static boolean enviarImagem(File file, int id) {
//        if (file.getName().contains(".jpg") || file.getName().contains(".png") 
//                || file.getName().contains(".pdf")) {
//            processarArquivo(System.getProperty("user.dir"),file.,"id");
//                return true;
//        } else {
//            return false;
//        }
        return false;
    }
     private static boolean processarArquivo(String caminho, FileItemStream item, String nomeArquivo) {
        try {
            File f = new File(caminho + File.separator + "fotosDeAcervo");
            if (!f.exists()) {
                f.mkdir();
            }
            
            File savedFile = new File(f.getAbsolutePath() + File.separator+ nomeArquivo);
            FileOutputStream fos = new FileOutputStream(savedFile);
            InputStream is = item.openStream();
            int x = 0;
            byte[] b = new byte[3024];
            while ((x = is.read(b)) != -1) {
                fos.write(b, 0, x);
            }
            fos.flush();
            fos.close();
            return true;
        } catch (Exception erro) {

        } finally {
        }
        return false;
    }
}
