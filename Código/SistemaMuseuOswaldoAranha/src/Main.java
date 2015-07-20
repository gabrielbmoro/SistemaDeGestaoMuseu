
import br.unipampa.model.Funcionario;
import br.unipampa.model.ItemConsignado;
import br.unipampa.service.VerificacaoDeInicializacao;
import br.unipampa.view.FrameInicial;
import br.unipampa.view.FrameLogin;
import br.unipampa.view.FrameNovoLivroConsignado;
import br.unipampa.view.FramePrincipal;
import br.unipampa.view.GeradorDeMensagem;

/**
 *
 * @author gabrielbmoro
 */
public class Main {
    
    public static void main(String[] args)
    {
//        Funcionario func = new Funcionario();
//        func.setCpf(378913);
//        func.setDataNAsc(null);
//        func.setEndereco("Peru");
//        func.setLogin("netoiung ");
//        func.setNome("Neto");
//        func.setSenha("190");
//        func.salvar(func);
        /*Teste que alguem fez*/
//        ItemConsignado item = new ItemConsignado();
//        item.setCultura("oi");
//        item.salvar(item);
        /*Para executar a aplicaçao*/
//        new FrameLogin();
       FrameInicial frameInicial= new FrameInicial();
        boolean teste = VerificacaoDeInicializacao.realizarVerificacaoDeSistema(frameInicial.getjListDeTarefasExecutadas());
        if(teste){
            frameInicial.dispose();
            new FrameLogin();
        }else{
            GeradorDeMensagem.exibirMensagemDeErro("Ocorreu alguns problemas, por favor verifique os detalhes de inicializaçao!");
        }
    }
}
