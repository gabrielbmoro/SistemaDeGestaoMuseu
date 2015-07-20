/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.service;

import br.unipampa.view.GeradorDeMensagem;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author gabrielbmoro
 */
public class UtilitariaDeUploadDeImagem {

    public static String PATH = System.getProperty("user.home") + File.separator + "fotosDeAcervo" + File.separator;
    public static String EXTENSAO = ".jpg";

    public static boolean verificarArquivo(File file) {
        if (file.exists() && file.getAbsolutePath().contains(".jpg")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean enviarArquivo(File fileOrigem, Long ID) {
        try {
            File pasta = new File(PATH);
            if (!pasta.exists()) {
                pasta.mkdir();
            }
            File fileDestino = new File(PATH + ID.toString() + EXTENSAO);

            BufferedImage imagem = ImageIO.read(fileOrigem);
            if (imagem.getWidth() <= 956 && imagem.getHeight() <= 600) {
// fazer algo com a imagem...
               
                ImageIO.write(imagem, "jpg", fileDestino);
                return true;
            } else {
                GeradorDeMensagem.exibirMensagemDeInformacao("Por favor, a imagem deve ter menos de 957 de largura e menos de 601 de altura.", "Alerta ao Usuario");
                return false;
            }
        } catch (FileNotFoundException erro) {
            return false;
        } catch (IOException erro1) {
            return false;
        }
    }
    
    public static boolean criarDiretorio(){
        File pasta = new File(PATH);
            if (!pasta.exists()) {
                pasta.mkdir();
            }
            return pasta.exists();
    }

}
