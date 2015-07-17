/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipampa.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.Query;

/**
 *
 * @author Gabriel B Moro
 */
@Entity
public class LivroDaBiblioteca implements OperacoesBasicas{
    
    @Id
    @GeneratedValue
    private Long ID;
    private int outroCodigo;
    private String nomeLivro;
    private String nomeAutor;
    private String grafica;
    private Date anoLacamento;
    private String regiao;
    private String pais;

    @Override
    public boolean salvar(Object objeto) {
        return false;
    }

    @Override
    public boolean alterar(Long ID, Object objetoNovo) {
        return false;
    }

    @Override
    public boolean alterar(Object objetoNovo) {
        return false;
    }

    @Override
    public List recuperarTodos() {
        Query query = null;
            query = HibernateUtil.openSession().createQuery("from LivroDaBiblioteca");
            List<Object> resultado = query.list();
            if (!resultado.isEmpty()) {
                return resultado;
            } else {
                return null;
            }
    }

    @Override
    public Long recuperarID(Object objeto) {
        return null;
    }

    @Override
    public Object recuperarPeloID(Long id) {
        return null;
    }

    @Override
    public boolean deletar(Object objeto) {
        return false;
    }
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

    public Date getAnoLacamento() {
        return anoLacamento;
    }

    public void setAnoLacamento(Date anoLacamento) {
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
