class MACFactory implements InterfaceFactory {
    // tipagem é importante
    public Botao createBotao() {
        return new BotaoMacOS();
    }
    public CaixasSelecao createCaixa() {
        return new CaixasSelecaoMacOS();
    }
    public CamposTexto createCamposTexto() {
        return new CamposTextoMacOS();
    }
}
