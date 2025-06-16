// ✅ Usar a fábrica abstrata para criar os componentes da interface gráfica (botão, checkbox e campo de texto), sem saber qual sistema operacional está sendo usado.
// ✅ Centralizar a lógica de uso dos componentes, mantendo o código desacoplado das implementações específicas de Windows ou Mac.
package AbstractFactory.Exercicio1;

public class Application {
    // injeta os objetos
    private Botao botao;
    private CaixasSelecao caixaselecao;
    private CamposTexto campotexto;
    
    //construtor
    public Application(InterfaceFactory factory) {
        // Cria os componentes usando a fábrica passada (Windows ou Mac)
        botao = factory.createBotao();
        caixaselecao = factory.createCaixa();
        campotexto = factory.createCamposTexto();
    }

    public void rederizacao() {
        // Usa os componentes sem se preocupar com o estilo visual
        botao.rederizar();
        caixaselecao.selecionar();
        campotexto.escrever();
    }
}
