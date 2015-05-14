package br.com.unipampa.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Pessoa")
public class Usuario implements Serializable {

    @Id
    private int cpf;
    
    private String login;
    
    private String senha;
    
    private String nome;
    
    private String dataNAsc;
    
    private String endereco;

    public boolean realizarLogin() {
        return false;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNAsc() {
        return dataNAsc;
    }

    public void setDataNAsc(String dataNAsc) {
        this.dataNAsc = dataNAsc;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
