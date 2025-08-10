package StateXChain.Problema1;

public class ProvaExperiencia extends BaseHandlerPSS {
    public void hadle(Candidato candidato) {
        // retorna o menor valor entre os dois, sem precisar comparar, pois já faz isso!
        candidato.addPontuacao(Math.min(candidato.getSemestresMagisterioFederal(), 12));
        // retorna o menor valor entre os dois, sem precisar comparar, pois já faz isso!
        candidato.addPontuacao(Math.min(candidato.getSemestresMagisterioSuperior(), 7));
        // retorna o menor valor entre os dois, sem precisar comparar, pois já faz isso!
        candidato.addPontuacao(Math.min(candidato.getSemestresMagisterioMedio(), 6));
        // passa para o próximo handle!
        super.handle(candidato);
    }
}
