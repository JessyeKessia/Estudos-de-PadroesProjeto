class WindowsFactory implements InterfaceFactory {
    public Botao createBotao() {
        return new BotaoWindows();
    }
    public CaixasSelecao createCaixa() {
        return new CaixaSelecaoWindows();
    }
    public CamposTexto createCamposTexto() {
        return new CamposTextoWindows();
    }
    
}
