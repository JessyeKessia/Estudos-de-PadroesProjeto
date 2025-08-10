package StateXChain.Problema2;

public class Curso {
    private String nome;
    private double preco;
    private int vagas;

    public Curso(String nome, double preco, int vagas) {
        this.nome = nome;
        this.preco = preco;
        this.vagas = vagas;
    }

    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getVagas() { return vagas; }

    public boolean reservarVaga() {
        if (vagas > 0) {
            vagas--;
            return true;
        }
        return false;
    }
}
