package StateXChain.Problema2;

// terceiro estado
public class EstadoProcessando implements Estado{
    private Contexto contexto;

    public EstadoProcessando(Contexto contexto) {
        this.contexto = contexto;
    }
    public void identificarAluno(String matricula){
        System.out.println("Aluno já identificado!");
    }
    public void selecionarCurso(String curso) {
        System.out.println("Curso Já selecionado!");
    }
    public void processarPagamento(String numeroCartao){
        if (numeroCartao.equals("1111-2222-3333-4444")){
            System.out.println("Cartão aprovado");
            contexto.getCursoSelecionado().reservarVaga();
            contexto.mudarEstado(contexto.getInscrito());
        } else {
            System.out.println("Cartão recusado!");
            contexto.mudarEstado(contexto.getIdentificado());
        }
    }

    public void imprimirTicket() {
        System.out.println("Você precisa pagar o curso para imprimir o Ticket.");
    }

}
