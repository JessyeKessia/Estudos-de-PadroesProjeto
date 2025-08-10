package StateXChain.Problema2;

// Estado inicio
public class EstadoEmEspera implements Estado {
    private Contexto contexto;

    public EstadoEmEspera(Contexto contexto) {
        this.contexto = contexto;
    }

    public void identificarAluno(String matricula) {
        if (matricula.equals("12345")) {
            System.out.println("Aluno identificado corretamente!");
            contexto.mudarEstado(contexto.getIdentificado());
        } else {
            System.out.println("Aluno não identificado");
        }
    }
      public void selecionarCurso(String curso) {
        System.out.println("Você precisa se identificar primeiro.");
    }

    public void processarPagamento(String numero) {
        System.out.println("Você precisa se identificar primeiro.");
    }

    public void imprimirTicket() {
        System.out.println("Você precisa se identificar primeiro.");
    }
    
}
