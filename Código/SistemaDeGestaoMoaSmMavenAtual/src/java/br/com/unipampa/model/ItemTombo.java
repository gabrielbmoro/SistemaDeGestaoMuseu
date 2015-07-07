package br.com.unipampa.model;

import br.com.unipampa.dao.DAOItemTombo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

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

    public boolean cadastrarItem(ItemTombo item) {
        try {
            DAOItemTombo daoItemTombo = new DAOItemTombo();
            return daoItemTombo.salvar(item);
        } catch (Exception erro) {
            return false;
        }
    }

    public void registrarEnvioDeTrabalho(ItemTombo itemTombo) {
    }

    public boolean alterarItem(ItemTombo item) {
        try {
            DAOItemTombo daoItemTombo = new DAOItemTombo();
            return daoItemTombo.alterar(item);
        } catch (Exception erro) {
            return false;
        }

    }

    public boolean excluirItem(ItemTombo item) {
        try {
            DAOItemTombo daoItemTombo = new DAOItemTombo();
            return daoItemTombo.deletar(item);
        } catch (Exception erro) {
            return false;
        }
    }

    public ArrayList<ItemTombo> buscarItem(Long id) {
        return null;
    }

    public ItemTombo buscarItem(ItemTombo itemTomboSemId) {
        ArrayList<ItemTombo> itensTombo = this.buscarTodos();
        if (itensTombo != null && !itensTombo.isEmpty()) {
            for (ItemTombo itemTomboTemp : itensTombo) {
                if (itemTomboTemp.getOutroCodigo() == itemTomboSemId.getOutroCodigo()
                        && itemTomboTemp.getMateriaPrima().equalsIgnoreCase(itemTomboSemId.getMateriaPrima())
                        && itemTomboTemp.getDataUtilizacaoInicial().equalsIgnoreCase(itemTomboSemId.getDataUtilizacaoInicial())
                        && itemTomboTemp.getDataUtilizacaoFinal().equalsIgnoreCase(itemTomboSemId.getDataUtilizacaoFinal())
                        && itemTomboTemp.getTipoObjeto().equalsIgnoreCase(itemTomboSemId.getTipoObjeto())
                        && itemTomboTemp.getFuncaoEspecifica().equalsIgnoreCase(itemTomboSemId.getFuncaoEspecifica())
                        && itemTomboTemp.getCultura().equalsIgnoreCase(itemTomboSemId.getCultura())
                        && itemTomboTemp.getEstilo().equalsIgnoreCase(itemTomboSemId.getEstilo())
                        && itemTomboTemp.getGrupoLinguistico().equalsIgnoreCase(itemTomboSemId.getGrupoLinguistico())
                        && itemTomboTemp.getTecnicaManufatura().equalsIgnoreCase(itemTomboSemId.getTecnicaManufatura())
                        && itemTomboTemp.getProcedencia().equalsIgnoreCase(itemTomboSemId.getProcedencia())
                        && itemTomboTemp.getSitio().equalsIgnoreCase(itemTomboSemId.getSitio())
                        && itemTomboTemp.getRegiao().equalsIgnoreCase(itemTomboSemId.getRegiao())
                        && itemTomboTemp.getPais().equalsIgnoreCase(itemTomboSemId.getPais())) {
                    return itemTomboSemId;
                }
            }
        } else {
            return null;
        }
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemTombo other = (ItemTombo) obj;
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        if (this.outroCodigo != other.outroCodigo) {
            return false;
        }
        if (!Objects.equals(this.materiaPrima, other.materiaPrima)) {
            return false;
        }
        if (!Objects.equals(this.dataUtilizacaoInicial, other.dataUtilizacaoInicial)) {
            return false;
        }
        if (!Objects.equals(this.dataUtilizacaoFinal, other.dataUtilizacaoFinal)) {
            return false;
        }
        if (!Objects.equals(this.tipoObjeto, other.tipoObjeto)) {
            return false;
        }
        if (!Objects.equals(this.funcaoEspecifica, other.funcaoEspecifica)) {
            return false;
        }
        if (!Objects.equals(this.cultura, other.cultura)) {
            return false;
        }
        if (!Objects.equals(this.estilo, other.estilo)) {
            return false;
        }
        if (!Objects.equals(this.grupoLinguistico, other.grupoLinguistico)) {
            return false;
        }
        if (!Objects.equals(this.tecnicaManufatura, other.tecnicaManufatura)) {
            return false;
        }
        if (!Objects.equals(this.procedencia, other.procedencia)) {
            return false;
        }
        if (!Objects.equals(this.regiao, other.regiao)) {
            return false;
        }
        if (!Objects.equals(this.sitio, other.sitio)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        if (this.imagemEnviada != other.imagemEnviada) {
            return false;
        }
        return true;
    }

    public ArrayList<ItemTombo> buscarTodos() {
        ArrayList<ItemTombo> listaDeRetorno = new ArrayList<>();

        DAOItemTombo daoItemTombo = new DAOItemTombo();
        List<Object> dados = daoItemTombo.recuperarRegistros();
        for (Object objetoTemp : dados) {
            if (objetoTemp instanceof ItemTombo) {
                listaDeRetorno.add((ItemTombo) objetoTemp);
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
