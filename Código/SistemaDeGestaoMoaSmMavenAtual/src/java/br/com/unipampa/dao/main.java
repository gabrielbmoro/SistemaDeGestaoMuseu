/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipampa.dao;

import br.com.unipampa.model.Usuario;

/**
 *
 * @author Neto
 */
public class main {
    public static void main(String[] args) {
       DAOItemTombo dao = new DAOItemTombo();
       dao.deletar(dao.recuperarRegistros().get(0));
    }
}
