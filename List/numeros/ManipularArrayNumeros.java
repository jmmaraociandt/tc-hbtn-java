import java.util.List;

public class ManipularArrayNumeros {
    public static int buscarPosicaoNumero(List<Integer> list, Integer numberToFetch) {
        if (!list.contains(numberToFetch))
            return -1;
        return list.indexOf(numberToFetch);
    }

    public static void adicionarNumero(List<Integer> list, Integer numberToAdd) throws Exception {
        if (buscarPosicaoNumero(list, numberToAdd) != -1)
            throw new Exception("Numero jah contido na lista");
        list.add(numberToAdd);
    }

    public static void removerNumero(List<Integer> list, Integer numberToRemove) throws Exception {
        if (buscarPosicaoNumero(list, numberToRemove) == -1)
            throw new Exception("Numero nao encontrado na lista");
        list.remove(numberToRemove);
    }

    public static void substituirNumero(List<Integer> list, Integer oldNumber, Integer newNumber) {
        if (buscarPosicaoNumero(list, oldNumber) != -1)
            list.set(buscarPosicaoNumero(list, oldNumber), newNumber);
        else
            list.add(newNumber);
    }
}
