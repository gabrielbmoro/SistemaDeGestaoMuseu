/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipampa.dao;

import java.util.List;

/**
 *
 * @author Gabriel B Moro
 */
public interface DAO {
        
    public abstract boolean salvar(Object objeto);
    public abstract boolean alterar(Object objeto, Long ID);
    public abstract List<Object> recuperarRegistros(Object parametro);
    public abstract Object recuperarPorID(Long ID);
    public abstract boolean deletar(Object objeto);
}
