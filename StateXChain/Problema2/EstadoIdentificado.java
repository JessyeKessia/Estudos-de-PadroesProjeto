package StateXChain.Problema2;

// Segundo estagio
public class EstadoIdentificado implements Estado {
    // pega o contexto
    private Contexto contexto;
    // herda o contexto
    public EstadoIdentificado(Contexto contexto) {
        this.contexto = contexto;
    }
    // Já foi feito
    public void identificarAluno(String matricula) {
        System.out.println("Aluno já identificado.");
    }
    public void selecionarCurso(String curso) {
        Curso c = contexto.getCursos().get(curso.toUpperCase());
        if (c != null && c.getVagas() > 0) {
            contexto.setCursoSelecionado(c);
            System.out.println("Curso selecionado: " + c.getNome() + " - R$ " + c.getPreco());
            contexto.mudarEstado(contexto.getProcessando());
        } else {
            System.out.println("Curso inválido ou sem vagas.");
        }
    }

    public void processarPagamento(String numero) {
        System.out.println("Você precisa selecionar o curso primeiro.");
    }

    public void imprimirTicket() {
        System.out.println("Você precisa selecionar o curso primeiro.");
    }
}