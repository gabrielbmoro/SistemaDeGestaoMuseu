package br.com.unipampa.model;

import br.com.unipampa.dao.DAOItemTombo;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ItemTombo {

    @Id
    @GeneratedValue
    private Long ID;
    private int outroCodigo;
    private String materiaPrima;
    private String dataUtilizacaoInicial;
    private String dataUtilizacaoFinal;
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

    public boolean cadastrarItem(ItemTombo item) {
        try {
            DAOItemTombo daoItemTombo = new DAOItemTombo();
            daoItemTombo.salvar(item);
            return true;
        } catch (Exception erro) {
            return false;
        }
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

}
