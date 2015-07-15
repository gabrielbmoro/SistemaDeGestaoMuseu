/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.model;

import java.util.List;

/**
 *
 * @author gabrielbmoro
 */
public interface OperacoesBasicas {

    public boolean salvar(Object objeto);

    public boolean alterar(Long ID, Object objetoNovo);

    public boolean alterar(Object objetoNovo);

    public List recuperarTodos();

    public Long recuperarID(Object objeto);

    public Object recuperarPeloID(Long id);

    public boolean deletar(Object objeto);
}
