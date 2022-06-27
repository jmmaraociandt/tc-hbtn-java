public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;

    public Pedido(double percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double somaPedido = 0.0;
        for (ItemPedido pedido : itens) {
             somaPedido += (1.0 - percentualDesconto/100.0)*
                     (pedido.getQuantidade()*pedido.getProduto().obterPrecoLiquido());
        }
        return somaPedido;
    }

    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");

        double descontoPedido = 0.0;
        double totalPedido = 0.0;
        for (ItemPedido pedido : itens) {
            System.out.println("Tipo: " + pedido.getProduto().getClass().getSimpleName() +
                    "  Titulo: " + pedido.getProduto().getTitulo() +
                    "  Preco: " + String.format("%.2f", pedido.getProduto().obterPrecoLiquido()) +
                    "  Quant: " + pedido.getQuantidade() +
                    "  Total: " + String.format("%.2f", pedido.getQuantidade()*pedido.getProduto().obterPrecoLiquido()));

            descontoPedido += (percentualDesconto/100)*(pedido.getQuantidade()*pedido.getProduto().obterPrecoLiquido());
            totalPedido += pedido.getQuantidade()*pedido.getProduto().obterPrecoLiquido();
        }

        System.out.println("----------------------------");
        System.out.println("DESCONTO: " + String.format("%.2f", descontoPedido));
        System.out.println("TOTAL PRODUTOS: " + String.format("%.2f", totalPedido));
        System.out.println("----------------------------");
        System.out.println("TOTAL PEDIDO: " + String.format("%.2f", calcularTotal()));
        System.out.println("----------------------------");
    }
}
