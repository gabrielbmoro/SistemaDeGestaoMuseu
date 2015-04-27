package br.com.unipampa.model;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ItemTombo {

    @Id
    @GeneratedValue
    private int codigo;
    private int outroCodigo;
    private String materiaPrima;
    private Date dataUtilizacaoInicial;
    private Date dataUtilizacaoFinal;
    private String tipoObjeto;
    private String funcaoEspecifica;
    private String cultura;
    private String estilo;
    private String grupoLinguistico;
    private String tecnicaManufatura;
    private String procedencia;
    private String regiao;
    private String sitio;
    private String pais;

    public boolean cadastrarItem() {
        return false;
    }

    public boolean alterarItem() {
        return false;
    }

    public boolean excluirItem() {
        return false;
    }

    public ArrayList<ItemTombo> buscarItem(Long id) {
        return null;
    }
}
