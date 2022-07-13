import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Consulta {
    public static List<Produto> obterLivrosDoPedido(Pedido pedido) {
        return pedido.getProdutos().stream()
                .filter(bookOnly -> bookOnly.getCategoria() == CategoriaProduto.LIVRO)
                .collect(Collectors.toList());
    }

    public static Produto obterProdutoMaiorPreco(List<Produto> products) {
        return products.stream()
                .sorted(Comparator.comparing(Produto::getPreco).reversed())
                .findFirst().get();
    }

    public static List<Produto> obterProdutosPorPrecoMinimo(List<Produto> products, double minValuePrice) {
        return products.stream()
                .filter(product -> product.getPreco() >= minValuePrice)
                .collect(Collectors.toList());
    }

    public static List<Pedido> obterPedidosComEletronicos(List<Pedido> orders) {
        return orders.stream()
                .filter(product -> product.getProdutos().stream().anyMatch(eletronicsOnly -> eletronicsOnly.getCategoria() == CategoriaProduto.ELETRONICO))
                .collect(Collectors.toList());
    }
}
