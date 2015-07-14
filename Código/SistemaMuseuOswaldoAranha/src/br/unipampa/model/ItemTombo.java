package br.unipampa.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "ItemDeAcervo")
public class ItemTombo implements Serializable {

    @Id
    @GeneratedValue
    protected Long ID;
    protected int outroCodigo;
    protected String materiaPrima;
    protected String dataUtilizacaoInicial;
    protected String dataUtilizacaoFinal;
    protected String tipoObjeto;
    protected String funcaoEspecifica;
    protected String cultura;
    protected String estilo;
    protected String grupoLinguistico;
    protected String tecnicaManufatura;
    protected String procedencia;
    protected String regiao;
    protected String sitio;
    protected String pais;
    protected boolean imagemEnviada;


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

    public String getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(String materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    public String getDataUtilizacaoInicial() {
        return dataUtilizacaoInicial;
    }

    public void setDataUtilizacaoInicial(String dataUtilizacaoInicial) {
        this.dataUtilizacaoInicial = dataUtilizacaoInicial;
    }

    public String getDataUtilizacaoFinal() {
        return dataUtilizacaoFinal;
    }

    public void setDataUtilizacaoFinal(String dataUtilizacaoFinal) {
        this.dataUtilizacaoFinal = dataUtilizacaoFinal;
    }

    public String getTipoObjeto() {
        return tipoObjeto;
    }

    public void setTipoObjeto(String tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }

    public String getFuncaoEspecifica() {
        return funcaoEspecifica;
    }

    public void setFuncaoEspecifica(String funcaoEspecifica) {
        this.funcaoEspecifica = funcaoEspecifica;
    }

    public String getCultura() {
        return cultura;
    }

    public void setCultura(String cultura) {
        this.cultura = cultura;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getGrupoLinguistico() {
        return grupoLinguistico;
    }

    public void setGrupoLinguistico(String grupoLinguistico) {
        this.grupoLinguistico = grupoLinguistico;
    }

    public String getTecnicaManufatura() {
        return tecnicaManufatura;
    }

    public void setTecnicaManufatura(String tecnicaManufatura) {
        this.tecnicaManufatura = tecnicaManufatura;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getSitio() {
        return sitio;
    }

    public void setSitio(String sitio) {
        this.sitio = sitio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isImagemEnviada() {
        return imagemEnviada;
    }

    public void setImagemEnviada(boolean imagemEnviada) {
        this.imagemEnviada = imagemEnviada;
    }

}
