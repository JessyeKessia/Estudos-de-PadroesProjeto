package StateXChain.Problema1;

public class Candidato {
    private String nome;
    private String rg;
    private double notaProvaDesempenho;
    private int semestresMagisterioFederal;
    private int semestresMagisterioSuperior;
    private int semestresMagisterioMedio;
    private int semestresGestaoDirecao;
    private int semestresGestaoCoordenacao;
    private String titulacao; 
    private double pontuacaoFinal;

    public Candidato(String nome, String rg, double notaProvaDesempenho,
                     String titulacao, int magFederal, int magSuperior, int magMedio,
                     int gestaoDirecao, int gestaoCoordenacao) {
        this.nome = nome;
        this.rg = rg;
        this.notaProvaDesempenho = notaProvaDesempenho;
        this.titulacao = titulacao;
        this.semestresMagisterioFederal = magFederal;
        this.semestresMagisterioSuperior = magSuperior;
        this.semestresMagisterioMedio = magMedio;
        this.semestresGestaoDirecao = gestaoDirecao;
        this.semestresGestaoCoordenacao = gestaoCoordenacao;
    }

    // Getters e setters
    public double getNotaProvaDesempenho() { return notaProvaDesempenho; }
    public String getTitulacao() { return titulacao; }
    public int getSemestresMagisterioFederal() { return semestresMagisterioFederal; }
    public int getSemestresMagisterioSuperior() { return semestresMagisterioSuperior; }
    public int getSemestresMagisterioMedio() { return semestresMagisterioMedio; }
    public int getSemestresGestaoDirecao() { return semestresGestaoDirecao; }
    public int getSemestresGestaoCoordenacao() { return semestresGestaoCoordenacao; }

    public void addPontuacao(double pontos) { pontuacaoFinal += pontos; }
    public double getPontuacaoFinal() { return pontuacaoFinal; }
    public String getNome() { return nome; }
}
