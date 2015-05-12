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
        Usuario usuario = new Usuario();
        usuario.setCpf(6172316);
        usuario.setDataNAsc(null);
        usuario.setEndereco("kdjosaihadsoj");
        usuario.setLogin("126289");
        usuario.setNome("NEtoo");
        usuario.setSenha("jidhsausjd");
        DAOUsuario dao = new DAOUsuario();
        dao.salvar(usuario);
    }
}
