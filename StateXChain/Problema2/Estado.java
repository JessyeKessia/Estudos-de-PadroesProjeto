package StateXChain.Problema2;

public interface Estado {
    void identificarAluno(String matricula);
    void selecionarCurso(String curso);
    void processarPagamento(String numeroCartao);
    void imprimirTicket();
}
