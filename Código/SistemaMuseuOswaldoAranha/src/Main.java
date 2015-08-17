
import br.unipampa.service.VerificacaoDeInicializacao;
import br.unipampa.view.FrameInicial;
import br.unipampa.view.FrameLogin;


/**
 *<b>Responsabilidade: Classe MAIN, as demais classes são executadas apartir desta</b>
 * @author gabrielbmoro
 */

public class Main {
    /**
     * Por favor criem um usuario pela classe MainParaCriarUmUserAdm
     * @param args 
     */
    public static void main(String[] args)
    {
      FrameInicial frameInicial= new FrameInicial();
        boolean teste = VerificacaoDeInicializacao.realizarVerificacaoDeSistema(frameInicial.getjListDeTarefasExecutadas());
        if(teste){
            frameInicial.dispose();
            new FrameLogin();
        }
        
    }
}
