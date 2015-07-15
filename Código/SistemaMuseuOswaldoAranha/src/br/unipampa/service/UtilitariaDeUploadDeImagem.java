/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.service;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

/**
 *
 * @author gabrielbmoro
 */
public class UtilitariaDeUploadDeImagem {

    private static String PATH = System.getProperty("user.home") + File.separator + "fotosDeAcervo" + File.separator;
    private static String EXTENSAO = ".jpg";

    public static boolean verificarArquivo(File file) {
        if (file.exists() && file.getAbsolutePath().contains(".jpg")) {
            return true;
        } else {
            return false;
        }
    }

    public static void copyFile(File source, File destination) throws IOException {
        if (destination.exists()) {
            destination.delete();
        }

        FileChannel sourceChannel = null;
        FileChannel destinationChannel = null;

        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destinationChannel = new FileOutputStream(destination).getChannel();
            sourceChannel.transferTo(0, sourceChannel.size(),
                    destinationChannel);
        } finally {
            if (sourceChannel != null && sourceChannel.isOpen()) {
                sourceChannel.close();
            }
            if (destinationChannel != null && destinationChannel.isOpen()) {
                destinationChannel.close();
            }
        }

    }

    public static boolean enviarArquivo(File fileOrigem, Long ID) {
        try {
            File pasta = new File(PATH);
            if(!pasta.exists()){
                pasta.mkdir();
            }
            File fileDestino = new File(PATH + ID.toString() + EXTENSAO);
            copyFile(fileOrigem, fileDestino);
            return true;
        } catch (FileNotFoundException erro) {
            return false;
        } catch (IOException erro1) {
            return false;
        }
    }

}
