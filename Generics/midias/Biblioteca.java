import java.util.ArrayList;
import java.util.List;

public class Biblioteca <E> {
    private List<E> list;

    public Biblioteca() {
        this.list = new ArrayList<>();
    }

    public void adicionarMidia(E element) {
        this.list.add(element);
    }

    public List<E> obterListaMidias() {
          return this.list;
    }
}
