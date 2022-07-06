public interface Armazenavel<T> {
    void adicionarAoInventario(String productName, T product);

    T obterDoInventario(String productName);
}
