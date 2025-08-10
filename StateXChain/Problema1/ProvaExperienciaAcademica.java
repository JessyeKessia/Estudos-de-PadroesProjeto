package StateXChain.Problema1;

public class ProvaExperienciaAcademica extends BaseHandlerPSS {
    public void handle(Candidato candidato) {
        // retorna dnv o mínimo
        candidato.addPontuacao(Math.min(candidato.getSemestresGestaoDirecao(), 15));
        candidato.addPontuacao(Math.min(candidato.getSemestresGestaoCoordenacao(), 10));
        super.handle(candidato);   
    }
}
