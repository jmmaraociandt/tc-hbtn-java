import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListaTelefonica {
    Map<String, ArrayList<Telefone>> phoneHashMap;

    public ListaTelefonica() {
        this.phoneHashMap = new HashMap<>();
    }

    public void adicionarTelefone(String name, Telefone phone) {

        if (buscar(name) == null) {
            ArrayList<Telefone> arrayList = new ArrayList<>();
            arrayList.add(phone);
            this.phoneHashMap.put(name, arrayList);
        } else {
            ArrayList<Telefone> arrayList = buscar(name);
            arrayList.add(phone);
            this.phoneHashMap.put(name, arrayList);
        }
    }

    public ArrayList<Telefone> buscar(String name) {
        if (this.phoneHashMap.containsKey(name))
            return this.phoneHashMap.get(name);
        return null;
    }
}
