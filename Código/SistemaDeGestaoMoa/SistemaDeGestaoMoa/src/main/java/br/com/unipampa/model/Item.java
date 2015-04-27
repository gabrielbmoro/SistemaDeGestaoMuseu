package br.com.unipampa.model;

import java.util.Date;

public class Item  {

	private int codigo;

	private int outrosCodigos;

	private String tipoObjeto;

	private String materiaPrima;

	private String funcaoEspecifica;

	private String cultura;

	private String estilo;

	private String grupoLinguistico;

	private Date dataUtilizacaoInicial;

	private Date dataUtilizacaoFinal;

	private String tecnicaManufatura;

	private String procedencia;

	private String regiao;

	private String sitio;

	private String pais;

	public void cadastrarItem() {

	}

	public void alterarItem() {

	}

	public void excluirItem() {

	}

	public void buscarItem() {

	}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getOutrosCodigos() {
        return outrosCodigos;
    }

    public void setOutrosCodigos(int outrosCodigos) {
        this.outrosCodigos = outrosCodigos;
    }

    public String getTipoObjeto() {
        return tipoObjeto;
    }

    public void setTipoObjeto(String tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }

    public String getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(String materiaPrima) {
        this.materiaPrima = materiaPrima;
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

    public Date getDataUtilizacaoInicial() {
        return dataUtilizacaoInicial;
    }

    public void setDataUtilizacaoInicial(Date dataUtilizacaoInicial) {
        this.dataUtilizacaoInicial = dataUtilizacaoInicial;
    }

    public Date getDataUtilizacaoFinal() {
        return dataUtilizacaoFinal;
    }

    public void setDataUtilizacaoFinal(Date dataUtilizacaoFinal) {
        this.dataUtilizacaoFinal = dataUtilizacaoFinal;
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

}
