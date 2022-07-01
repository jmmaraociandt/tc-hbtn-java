import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NumerosDuplicados {
    public static TreeSet<Integer> buscar(int[] array) {
        Set<Integer> set = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (Integer number : array) {
            if (!set.add(number))
                treeSet.add(number);
        }
        return treeSet;
    }
}
