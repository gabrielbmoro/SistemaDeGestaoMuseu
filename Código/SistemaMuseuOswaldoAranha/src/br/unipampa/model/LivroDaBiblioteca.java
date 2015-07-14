/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Gabriel B Moro
 */
@Entity
public class LivroDaBiblioteca {
    @Id
    @GeneratedValue
    private Long ID;
    private int outroCodigo;
    private String nomeLivro;
    private String nomeAutor;
    private String grafica;
    private String anoLacamento;
    private String regiao;
    private String pais;
    

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public int getOutroCodigo() {
        return outroCodigo;
    }

    public void setOutroCodigo(int outroCodigo) {
        this.outroCodigo = outroCodigo;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getGrafica() {
        return grafica;
    }

    public void setGrafica(String grafica) {
        this.grafica = grafica;
    }

    public String getAnoLacamento() {
        return anoLacamento;
    }

    public void setAnoLacamento(String anoLacamento) {
        this.anoLacamento = anoLacamento;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    
}
