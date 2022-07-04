import java.util.ArrayList;

public class ProcessadorVideo {
    private ArrayList<CanalNotificacao> canais;

    public ProcessadorVideo() {
        this.canais = new ArrayList<>();
    }

    public void registrarCanal(CanalNotificacao canalNotificacao) {
        this.canais.add(canalNotificacao);
    }

    public void processar(Video video) {
        for (CanalNotificacao canal : canais) {
            Mensagem msg = new Mensagem(video.getArquivo(), TipoMensagem.LOG);
            canal.notificar(msg);
            System.out.printf(" - %s\n", video.getFormato());
        }
    }
}
