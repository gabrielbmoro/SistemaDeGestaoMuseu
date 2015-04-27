/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipampa.model;

import java.util.Date;

/**
 *
 * @author Gabriel B Moro
 */
public class ItemConsignado extends ItemTombo{
    
    private Date dataDoEmprestimo;
    private Date dataDeDevolucao;
    private ResponsavelDaFamilia responsavelDaFamilia;

    public Date getDataDoEmprestimo() {
        return dataDoEmprestimo;
    }

    public void setDataDoEmprestimo(Date dataDoEmprestimo) {
        this.dataDoEmprestimo = dataDoEmprestimo;
    }

    public Date getDataDeDevolucao() {
        return dataDeDevolucao;
    }

    public void setDataDeDevolucao(Date dataDeDevolucao) {
        this.dataDeDevolucao = dataDeDevolucao;
    }

    public ResponsavelDaFamilia getResponsavelDaFamilia() {
        return responsavelDaFamilia;
    }

    public void setResponsavelDaFamilia(ResponsavelDaFamilia responsavelDaFamilia) {
        this.responsavelDaFamilia = responsavelDaFamilia;
    }
    
    
}
