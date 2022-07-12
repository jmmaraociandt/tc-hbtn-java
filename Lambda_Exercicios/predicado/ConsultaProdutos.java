import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ConsultaProdutos {
    public static List<Produto> filtrar(List<Produto> products, Predicate<Produto> productPredicate) {
        List<Produto> productList = new ArrayList<>();

        for (Produto product : products) {
            if (productPredicate.test(product))
                productList.add(product);
        }
        return productList;
    }
}
