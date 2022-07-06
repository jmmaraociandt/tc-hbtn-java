import java.util.Map;
import java.util.TreeMap;

public abstract class Armazem<T> implements Armazenavel<T> {
    private Map<String, T> products;

    public Armazem() {
        this.products = new TreeMap<>();
    }

    @Override
    public void adicionarAoInventario(String productName, T product) {
        this.products.put(productName, product);
    }

    @Override
    public T obterDoInventario(String productName) {
        return this.products.get(productName);
    }
}
