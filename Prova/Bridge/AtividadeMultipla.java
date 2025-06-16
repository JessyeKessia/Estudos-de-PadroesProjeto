package Prova.Bridge;

public class AtividadeMultipla extends Atividade {
    public AtividadeMultipla (Corretor corretorImplCorretor) {
        super(corretorImplCorretor);
    }

    public void atividadeCorrigida() {
        System.out.println("Atividade de multipla escolha sendo corrigida!");
        corretorImplCorretor.corrigir();
    }
    
}
