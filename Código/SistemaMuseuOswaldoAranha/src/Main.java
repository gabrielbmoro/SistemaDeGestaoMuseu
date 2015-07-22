
import br.unipampa.service.VerificacaoDeInicializacao;
import br.unipampa.view.FrameCadastroUsuario;
import br.unipampa.view.FrameInicial;
import br.unipampa.view.FramePrincipal;

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
