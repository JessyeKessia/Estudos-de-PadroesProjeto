package StateXChain.Problema1;

public class ProvaTitulos extends BaseHandlerPSS {
    // caso o condidato seja, doutor, aumenta em 25, caso seja mestre, aumenta em 18, caso seja especialista, aumenta em 10.
    public void handle(Candidato candidato) {
        switch (candidato.getTitulacao()) {
            case "Doutor": candidato.addPontuacao(25); break;
            case "Mestre": candidato.addPontuacao(18); break;
            case "Especialista": candidato.addPontuacao(10); break;
        }
        super.handle(candidato);
    }
}
