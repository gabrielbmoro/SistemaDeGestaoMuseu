package br.com.unipampa.dao;

import java.util.List;


/**
 *
 * @author Neto
 */
public abstract class DAO{
        
    public abstract boolean salvar(Object objeto);
    public abstract boolean alterar(Object objeto, Long ID);
    public abstract List<Object> recuperarRegistros(Object parametro);
    public abstract List<Object> recuperarRegistros();
    public abstract Object recuperarPorID(Long ID);
    public abstract boolean deletar(Object objeto);
}
