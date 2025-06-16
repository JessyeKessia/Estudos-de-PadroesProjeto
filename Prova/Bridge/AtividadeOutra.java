package Prova.Bridge;

public class AtividadeOutra extends Atividade {
    public AtividadeOutra (Corretor corretorImplCorretor) {
        super(corretorImplCorretor);
    }
    public void atividadeCorrigida() {
        System.out.println("Atividade Outra sendo corrigida!");
        corretorImplCorretor.corrigir();
    }
}
