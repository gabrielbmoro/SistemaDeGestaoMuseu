/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *<b>Responsabilidade: Codificar usando Criptografia MD5</b>
 *Instruções de uso: Após chamar o método <b>codificar</b> e passar uma string como parametro, 
 * o mesmo retornara a estring codificada
 *
 *@author gabrielbmoro
 */
public class CriptografiaMD5 {

    public static String codificar(String input) {
        String md5 = null;

        if (input==null) {
            return null;
        }
        try {

            //Create MessageDigest object for MD5  
            MessageDigest digest = MessageDigest.getInstance("MD5");

            //Update input string in message digest  
            digest.update(input.getBytes(), 0, input.length());

            //Converts message digest value in base 16 (hex)   
            md5 = new BigInteger(1, digest.digest()).toString(16);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return md5;
    }
}
