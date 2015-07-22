
import br.unipampa.model.Funcionario;
import br.unipampa.model.ItemConsignado;
import br.unipampa.service.VerificacaoDeInicializacao;
import br.unipampa.view.FrameCadastroUsuario;
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
//       new FrameCadastroUsuario();

        FrameInicial frameInicial= new FrameInicial();
        boolean teste = VerificacaoDeInicializacao.realizarVerificacaoDeSistema(frameInicial.getjListDeTarefasExecutadas());
        if(teste){
            frameInicial.dispose();
            new FramePrincipal();
        }
    }
}
