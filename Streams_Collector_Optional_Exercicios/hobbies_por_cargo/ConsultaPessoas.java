import java.util.*;
import java.util.stream.Collectors;

public class ConsultaPessoas {
    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> people) {
        return people.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo,
                            () -> new TreeMap<>(Comparator.reverseOrder()),
                            Collectors.toCollection(TreeSet::new)));
    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> people) {
        return people.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo,
                            Collectors.counting()));
    }

    public static Map<String, Map<Integer, Long>> obterContagemPessoasPorCargoEIdade(List<Pessoa> people) {
        return people.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo,
                            Collectors.groupingBy(Pessoa::getIdade,
                                    Collectors.counting())));
    }

    public static Map<String, Double> obterMediaSalarioPorCargo(List<Pessoa> people) {
        return people.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo,
                        Collectors.averagingDouble(Pessoa::getSalario)));
    }

    public static Map<String, TreeSet<String>> obterHobbiesPorCargo(List<Pessoa> people) {
        return people.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo,
                        Collectors.flatMapping(
                                person -> person.getHobbies().stream(),
                                Collectors.toCollection(TreeSet::new))));
    }
}
