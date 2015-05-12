/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipampa.controller;

import br.com.unipampa.model.ItemTombo;
import java.util.List;

/**
 *
 * @author Gabriel B Moro
 */
public class RestauraItens {
    private ItemTombo itemTombo;
    
    public List<ItemTombo> restauraItensDoAcervo(){
        this.itemTombo = new ItemTombo();
      return this.itemTombo.buscarTodos();
    }
}
