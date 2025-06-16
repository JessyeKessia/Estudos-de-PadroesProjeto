package Prova.Bridge;

abstract class Atividade {
    public Corretor corretorImplCorretor;

    public Atividade (Corretor corretorImplCorretor) {
        this.corretorImplCorretor = corretorImplCorretor;
    }

    abstract void atividadeCorrigida();
}
