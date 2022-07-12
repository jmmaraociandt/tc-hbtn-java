import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> products, CriterioFiltro criterion) {
        List<Produto> productList = new ArrayList<>();

        for (Produto product : products) {
            if (criterion.testar(product))
                productList.add(product);
        }
        return productList;
    }
}
