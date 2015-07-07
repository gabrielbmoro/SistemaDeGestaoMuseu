/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipampa.model;

import br.com.unipampa.dao.DAOLivroDaBiblioteca;
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
    
    public boolean cadastrarLivro(LivroDaBiblioteca item) {
        try {
            DAOLivroDaBiblioteca daoLivroDaBiblioteca = new DAOLivroDaBiblioteca();
            return daoLivroDaBiblioteca.salvar(item);
        } catch (Exception erro) {
            return false;
        }
    }

    public void registrarEnvioDeTrabalho(LivroDaBiblioteca livroDaBiblioteca) {
    }

    public boolean alterarItem() {
        return false;
    }

    public boolean excluirItem() {
        return false;
    }

    public ArrayList<LivroDaBiblioteca> buscarItem(Long id) {
        return null;
    }
    
    public LivroDaBiblioteca buscarLivro(LivroDaBiblioteca livroBibliotecaSemId){
        ArrayList<LivroDaBiblioteca> livroBibloteca = this.buscarTodos();
        if(livroBibloteca!=null && !livroBibloteca.isEmpty()){
            for(LivroDaBiblioteca itemLivroBiblioteca : livroBibloteca){
                if(itemLivroBiblioteca.getOutroCodigo()==livroBibliotecaSemId.getOutroCodigo()
                        && itemLivroBiblioteca.getNomeLivro().equalsIgnoreCase(livroBibliotecaSemId.getNomeAutor())
                        && itemLivroBiblioteca.getNomeAutor().equalsIgnoreCase(livroBibliotecaSemId.getNomeAutor())
                        && itemLivroBiblioteca.getGrafica().equalsIgnoreCase(livroBibliotecaSemId.getGrafica())
                        && itemLivroBiblioteca.getAnoLacamento().equalsIgnoreCase(livroBibliotecaSemId.getAnoLacamento())
                        && itemLivroBiblioteca.getRegiao().equalsIgnoreCase(livroBibliotecaSemId.getRegiao())
                        && itemLivroBiblioteca.getPais().equalsIgnoreCase(livroBibliotecaSemId.getPais())
                        
                   ){
                    return livroBibliotecaSemId;
                }
            }
        }else{
      return null;
        }
        return null;
    }

    public ArrayList<LivroDaBiblioteca> buscarTodos() {
        ArrayList<LivroDaBiblioteca> listaDeRetorno = new ArrayList<>();

        DAOLivroDaBiblioteca daoLivroDaBiblioteca = new DAOLivroDaBiblioteca();
        List<Object> dados = daoLivroDaBiblioteca.recuperarRegistros();
        for (Object objetoTemp : dados) {
            if (objetoTemp instanceof LivroDaBiblioteca) {
                listaDeRetorno.add((LivroDaBiblioteca) objetoTemp);
            }
        }
        return listaDeRetorno;
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
