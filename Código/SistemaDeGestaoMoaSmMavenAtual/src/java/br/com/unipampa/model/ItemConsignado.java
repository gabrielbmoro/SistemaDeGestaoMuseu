/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipampa.model;

import br.com.unipampa.dao.DAOItemConsignado;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;

/**
 *
 * @author Gabriel B Moro
 */
@Entity
public class ItemConsignado extends ItemTombo implements Serializable {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.dataDoEmprestimo);
        hash = 37 * hash + Objects.hashCode(this.dataDeDevolucao);
        hash = 37 * hash + Objects.hashCode(this.responsavelDaFamilia);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemConsignado other = (ItemConsignado) obj;
        if (!Objects.equals(this.dataDoEmprestimo, other.dataDoEmprestimo)) {
            return false;
        }
        if (!Objects.equals(this.dataDeDevolucao, other.dataDeDevolucao)) {
            return false;
        }
        return true;
    }

    private String dataDoEmprestimo;
    private String dataDeDevolucao;
    private String responsavelDaFamilia;

    public boolean cadastrarItem(ItemConsignado item) {
        if (item instanceof ItemConsignado) {
            try {
                DAOItemConsignado dAOItemConsignado = new DAOItemConsignado();
                return dAOItemConsignado.salvar(item);
            } catch (Exception erro) {
                return false;
            }
        } else {
            return false;
        }
    }

    public String getDataDoEmprestimo() {
        return dataDoEmprestimo;
    }

    public void setDataDoEmprestimo(String dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;
    }

    public String getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    public void setDataDeDevolucao(String dataDeDevolucao) {
        this.dataDeDevolucao = dataDeDevolucao;
    }

    public String getResponsavelDaFamilia() {
        return responsavelDaFamilia;
    }

    public void setResponsavelDaFamilia(String responsavelDaFamilia) {
        this.responsavelDaFamilia = responsavelDaFamilia;
    }

   
 public List<ItemConsignado> buscarTodu(){
         
     List<ItemConsignado> listaDeRetorno = new ArrayList<>();

        DAOItemConsignado daoItemConsignado = new DAOItemConsignado();
        List<Object> dados = daoItemConsignado.recuperarRegistros();
        for (Object objetoTemp : dados) {
            if (objetoTemp instanceof ItemConsignado) {
                listaDeRetorno.add((ItemConsignado) objetoTemp);
            }
        }
        return listaDeRetorno;
    }









}
