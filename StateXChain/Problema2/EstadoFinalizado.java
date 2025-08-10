package StateXChain.Problema2;

public class EstadoFinalizado implements Estado {
    private Contexto contexto;

    public EstadoFinalizado(Contexto contexto) {
        this.contexto = contexto;
    }
    public void identificarAluno(String matricula){
        System.out.println("Aluno já identificado!");
    }
    public void selecionarCurso(String curso) {
        System.out.println("Curso Já selecionado!");
    }
    public void processarPagamento(String numeroCartao){ 
        System.out.println("Pagamento já realizado");
    }
    public void imprimirTicket() {
        System.out.println("Ticket impresso");
    }

}