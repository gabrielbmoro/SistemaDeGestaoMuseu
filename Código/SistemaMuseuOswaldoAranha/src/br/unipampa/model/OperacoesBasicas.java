/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.model;

import java.util.List;

/**
*<b>Responsabilidade: Interface que define métodos que devem ser implementados nas classes estendidas por ela</b>
*Instruções de uso: Usada para garantir que as classes que estendem implementem todos os métodos 
*@author Gabriel B Moro
*@since 06/08/2015
*
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
