/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipampa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Gabriel B Moro
 */
@Entity
public class ResponsavelDaFamilia {
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String telefone;
    private String email;

    public boolean cadastrarResponsavel(ResponsavelDaFamilia responsavel){
        return false;
    }
    
    public boolean alterarDadosDoResponsavel(Long id, ResponsavelDaFamilia reponsDaFamilia){
        return false;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
     
}
