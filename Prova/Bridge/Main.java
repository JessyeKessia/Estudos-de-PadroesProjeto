package Prova.Bridge;

public class Main {
    public static void main(String[] args) {
        // interface implementa
        Corretor ai = new CorrigirAI();
        Corretor api = new CorrigirAPI();
        Corretor local = new CorrigirLocal();
        
        // Abstração recebe as interfaces
        Atividade atividade1 = new AtividadeDissertacao(ai);
        Atividade atividade2 = new AtividadeMultipla(local);
        Atividade atividade3 = new AtividadeOutra(api);

        // Atividades usando o método da abstração
        atividade1.atividadeCorrigida();
        atividade2.atividadeCorrigida();
        atividade3.atividadeCorrigida();

    }
    
}
