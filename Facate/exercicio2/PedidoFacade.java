package Facate.exercicio2;

import java.util.List;

public class PedidoFacade {
    // elementos importados de fora

    private ValidadorDados validarPedido;
    private VerificadorEstoque verificaEstoque;
    private CalculadorTotal calculadorTotal;
    private SalvadorPedido salvarPedido;
    private NotificadorEmail notificaEmail;

    // construtor para importar tudo de fora
    public PedidoFacade(ValidadorDados validadorDados, VerificadorEstoque verificadorEstoque, CalculadorTotal calculadorTotal, SalvadorPedido salvadorPedido, NotificadorEmail notificadorEmail) {
        this.validarPedido = validarPedido;
        this.verificaEstoque = verificaEstoque;
        this.calculadorTotal = calculadorTotal;
        this.salvarPedido = salvarPedido;
        this.notificaEmail = notificaEmail;

    }

    // Função para validar o processamento de pedidos
    public void processarPedido( String nomeCliente, String email, List<Item> itens) { 
        validarPedido.validar(nomeCliente, email, itens); 
        verificaEstoque.verificarEstoque(itens); 
        double total = calculadorTotal.calcularTotal(itens); 
        Pedido pedido = new Pedido(nomeCliente, email, itens, total);
        salvarPedido.salvarPedido(pedido); 
        notificaEmail.enviarEmail(pedido); 
    }
}
