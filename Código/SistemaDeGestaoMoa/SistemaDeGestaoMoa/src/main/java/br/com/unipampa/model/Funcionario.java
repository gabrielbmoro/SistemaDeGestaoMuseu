/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipampa.model;

import java.util.ArrayList;
import javax.persistence.Entity;

/**
 *
 * @author Gabriel B Moro
 */
@Entity
public class Funcionario extends Usuario{
    
   public ArrayList<ItemTombo> recuperarAcervo(){
       return null;
   }
   
   public boolean cadastrarItem(ItemTombo item){
       return false;
   }
   
   public boolean alterarItem(Long id, ItemTombo item){
       return false;
   }
   
  
}
