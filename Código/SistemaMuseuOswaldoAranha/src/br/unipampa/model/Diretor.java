/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.model;

import javax.persistence.Entity;

/**
 *
 * @author Gabriel B Moro
 */
@Entity
public class Diretor extends Usuario{
    
    
     public boolean cadastrarUsuarios(Usuario usuario){
        return false;
    }
    public boolean alterarUsuarios(Long Id, Usuario usuario){
        return false;
    }
    public boolean ativarOuDesativarAcessoDeUsuarios(boolean statusDeAtivacao, Usuario usuario){
        return false;
    }

}
