package StateXChain.Problema2;

public class Main {
    public static void main(String[] args) {
        Contexto quiosque = new Contexto();

        quiosque.identificarAluno("12345");
        quiosque.selecionarCurso("GPT");
        quiosque.processarPagamento("1111-2222-3333-4444");
        quiosque.imprimirTicket();
    }
}
