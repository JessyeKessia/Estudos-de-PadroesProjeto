package Prova.Bridge;

public class AtividadeDissertacao extends Atividade {
    public AtividadeDissertacao (Corretor corretorImplCorretor) {
        super(corretorImplCorretor);
    }

    public void atividadeCorrigida() {
        System.out.println("Atividade de dissertação sendo corrigida!");
        corretorImplCorretor.corrigir();
    }

}
