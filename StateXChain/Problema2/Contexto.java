package StateXChain.Problema2;

import java.util.HashMap;
import java.util.Map;

public class Contexto {
    // Estado Atual SEMPRE VAI SER IMPORTADO no contexto
    private Estado estadoAtual;

    // Estados importados como obrigatórios no contexto
    private Estado emEspera;
    private Estado identificado;
    private Estado processando;
    private Estado inscrito;
    private Estado finalizado;

    // Cursos que estão no array do quiosque, nosso contexto
    private Map<String, Curso> cursos;
    // Curso que vai ser selecionado no estado identificado
    private Curso cursoSelecionado;

    // seta o estágio inicio de todo o processo e inicia tudoo
    public Contexto(){

        // Estados que o contexto, o quiosque, vai ter. SÃO SEMPRE MUITO FIXOSS. TUDO É FIXO COM STATE.
        emEspera = new EstadoEmEspera(this);
        identificado = new EstadoIdentificado(this);
        processando = new EstadoProcessando(this);
        inscrito = new EstadoInscrito(this);
        finalizado = new EstadoFinalizado(this);

        estadoAtual = emEspera; // Estado inicial
        carregarCursos(); // carrega os cursos dentro do dicionário assim que inicializa
    }

    private void carregarCursos() {
        cursos = new HashMap<>();
        cursos.put("GPT", new Curso("GPT", 150.0, 10));
        cursos.put("BLOCKCHAIN", new Curso("BLOCKCHAIN", 200.0, 5));
        cursos.put("IOT", new Curso("IOT", 180.0, 8));
        cursos.put("VR", new Curso("VR", 250.0, 3));
    }

    // recursão que serve para trocar de estágio
    public void mudarEstado(Estado estado){
        this.estadoAtual = estado;
    }

    // pega os cursos
    public Map<String, Curso> getCursos() { return cursos; }
    // retorna um curso
    public Curso getCursoSelecionado() { return cursoSelecionado; }
    // seta o curso selecionado
    public void setCursoSelecionado(Curso curso) { this.cursoSelecionado = curso; }

    // Metodos para pegar os estados dentro de cada estado
    public Estado getEmEspera() { return emEspera; }
    public Estado getIdentificado() { return identificado; }
    public Estado getProcessando() { return processando; }
    public Estado getInscrito() { return inscrito; }
    public Estado getFinalizado() { return finalizado; }

    // metodos que vão ser repassados para cada estado
    public void identificarAluno(String matricula) { estadoAtual.identificarAluno(matricula); }
    public void selecionarCurso(String curso) { estadoAtual.selecionarCurso(curso); }
    public void processarPagamento(String numeroCartao) { estadoAtual.processarPagamento(numeroCartao); }
    public void imprimirTicket() { estadoAtual.imprimirTicket(); }
}
