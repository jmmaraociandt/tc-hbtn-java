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
             somaPedido += (1.0 - percentualDesconto/100.0)*(pedido.getQuantidade()*pedido.getProduto().obterPrecoLiquido());
        }
        return somaPedido;
    }
}
