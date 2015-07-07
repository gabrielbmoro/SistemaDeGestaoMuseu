/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipampa.controller;

import br.com.unipampa.model.ItemConsignado;
import br.com.unipampa.model.ItemTombo;
import br.com.unipampa.model.LivroDaBiblioteca;
import java.util.List;

/**
 *
 * @author Gabriel B Moro
 */
public class RestauraItens {
    private ItemTombo itemTombo;
    private ItemConsignado itemConsig;
    private LivroDaBiblioteca livroBiblioteca;
    
    public List<ItemTombo> restauraItensDoAcervo(){
        this.itemTombo = new ItemTombo();
      return this.itemTombo.buscarTodos();
    }
    
     public List<ItemConsignado> restauraItemConsignado() {
         itemConsig = new ItemConsignado();
        List<ItemConsignado> listaItemCon = itemConsig.buscarTodu();
        return listaItemCon;
    }
     public List<LivroDaBiblioteca> restauraLivroDABiblioteca() {
         this.livroBiblioteca = new LivroDaBiblioteca();
      return this.livroBiblioteca.buscarTodos();
    }

    
}
