/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.service;

/**
 *
 * @author gabrielbmoro
 */
public class RefatoraString {
    
    public static Long retornaCpf(String cpf){
        cpf = cpf.replace(".","");
        cpf = cpf.replace("-", "");
        Long cpflong=null;
        
        try{
             cpflong = Long.parseLong(cpf);
        }catch(NumberFormatException erro){
            return null;
        }
        return cpflong;
    }
}
