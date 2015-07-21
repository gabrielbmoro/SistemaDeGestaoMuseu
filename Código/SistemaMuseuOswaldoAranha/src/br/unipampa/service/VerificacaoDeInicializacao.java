/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.service;

import br.unipampa.model.HibernateUtil;
import java.io.File;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import org.hibernate.Session;

/**
 *
 * @author gabrielbmoro
 */
public class VerificacaoDeInicializacao {

    public static boolean realizarVerificacaoDeSistema(JList jListParaFeedBack) {
        jListParaFeedBack.removeAll();
        DefaultListModel modeloDaLista = new DefaultListModel();
        jListParaFeedBack.setModel(modeloDaLista);
        /*Verificando a conexao com a base de dados*/
       try{
        Session session = HibernateUtil.openSession();
        if (session != null) {
            modeloDaLista.addElement("Conexao com base de dados realizada com sucesso!");
        } else {
            modeloDaLista.addElement("Nao foi possivel realizar a conexao com a base de dados!");
            return false;
        }
       }catch(java.lang.ExceptionInInitializerError erro){
           modeloDaLista.addElement("Nao foi possivel realizar a conexao com a base de dados!");
            return false;
       }
        /*Verificando se o diretorio de imagens do acervo existe ou nao*/
        if (new File(UtilitariaDeUploadDeImagem.PATH).exists()) {
            modeloDaLista.addElement("Diretorio de imagens do acervo encontrado!");
        } else {
            modeloDaLista.addElement("Diretorio de imagens do acervo nao encontrado!");
            boolean criacaoDeDiretorio = UtilitariaDeUploadDeImagem.criarDiretorio();
            if(criacaoDeDiretorio){
                modeloDaLista.addElement("Diretorio criado com sucesso!");
            }else{
                modeloDaLista.addElement("Nao foi possivel criar o diretorio.");
                return false;
            }
        }
        return true;
    }
}
