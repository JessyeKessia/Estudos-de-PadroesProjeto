package StateXChain.Problema1;


public class ProvaDesempenho extends BaseHandlerPSS{
    
    public void handle(Candidato candidato){
        // pega a nota de desempenho
        double nota = candidato.getNotaProvaDesempenho();
        if (nota >= 70 ) {
            candidato.addPontuacao(nota);
            super.handle(candidato); // passou para a etapa de títulos que tbm tem etapas para acumular pontos
        } else {
            // eliminado de uma vez
            System.out.println("Candidato " + candidato.getNome() + " eliminado na prova de desempenho.");
        }
    }

}
