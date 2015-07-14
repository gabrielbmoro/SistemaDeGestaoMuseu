package br.unipampa.model;

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

}
