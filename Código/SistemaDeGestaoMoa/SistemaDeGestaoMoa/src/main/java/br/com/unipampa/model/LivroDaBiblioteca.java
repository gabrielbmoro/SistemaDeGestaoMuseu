/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipampa.model;

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
    
}
