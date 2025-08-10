package StateXChain.Problema1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        HandlerPSS processaDesempenho = new ProvaDesempenho();
        HandlerPSS processaTitulo = new ProvaTitulos();
        HandlerPSS processaExperiencia = new ProvaExperiencia();
        HandlerPSS processaExperienciaAcademica = new ProvaExperienciaAcademica();

        // Encadeia os handlers
        processaDesempenho.setNext(processaTitulo);
        processaTitulo.setNext(processaExperiencia);
        processaExperiencia.setNext(processaExperienciaAcademica);

         // Lista de candidatos
        List<Candidato> candidatos = Arrays.asList(
                new Candidato("Ana", "123", 85, "Doutor", 10, 5, 3, 8, 5),
                new Candidato("Bruno", "456", 65, "Mestre", 6, 4, 2, 0, 0),
                new Candidato("Carlos", "789", 75, "Especialista", 12, 7, 6, 15, 10)
        );

        // Processa todos
        for (Candidato c : candidatos) {
            processaDesempenho.handle(c);
        }

        // Ordena e exibe classificados
        candidatos.stream()
                .filter(c -> c.getPontuacaoFinal() > 0)
                .sorted((a, b) -> Double.compare(b.getPontuacaoFinal(), a.getPontuacaoFinal()))
                .forEach(c -> System.out.println(c.getNome() + " - Pontuação final: " + c.getPontuacaoFinal()));
    }
}
