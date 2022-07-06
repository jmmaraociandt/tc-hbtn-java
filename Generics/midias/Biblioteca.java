import java.util.ArrayList;
import java.util.List;

public class Biblioteca <T extends Midia> {
    private List<T> mediaList;

    public Biblioteca() {
        this.mediaList = new ArrayList<>();
    }

    public void adicionarMidia(T element) {
        this.mediaList.add(element);
    }

    public List<T> obterListaMidias() {
        return this.mediaList;
    }
}
