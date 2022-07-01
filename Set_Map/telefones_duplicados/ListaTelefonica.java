import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ListaTelefonica {
    Map<String, HashSet<Telefone>> phoneHashMap;

    public ListaTelefonica() {
        this.phoneHashMap = new HashMap<>();
    }

    public void adicionarTelefone(String name, Telefone phone) {
        HashSet<Telefone> hashSet;

        if(phoneExists(name, phone))
            throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");

        else {
            if (buscar(name) == null) {
                hashSet = new HashSet<>();
            } else {
                hashSet = buscar(name);

                if (hashSet.contains(phone))
                    throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
            }
        }

        hashSet.add(phone);
        this.phoneHashMap.put(name, hashSet);

    }

    public HashSet<Telefone> buscar(String name) {
        if (this.phoneHashMap.containsKey(name))
            return this.phoneHashMap.get(name);
        return null;
    }

    public boolean phoneExists(String name, Telefone phone) {
        for (String personNAme : this.phoneHashMap.keySet()) {
            if (!personNAme.equals(name)) {
                if (buscar(personNAme).contains(phone))
                    return true;
            }
        }
        return false;
    }
}
