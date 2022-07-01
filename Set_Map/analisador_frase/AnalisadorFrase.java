import java.util.TreeMap;

public class AnalisadorFrase {
    public static TreeMap<String, Integer> contagemPalavras(String sentence) {
        String[] words = sentence.replaceAll("[?.!]","").trim().toLowerCase().split(" ");
        TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();

        for (String word : words) {
            Integer count = 0;
            if (treeMap.containsKey(word)) {
                count = treeMap.get(word);
            }
            count++;
            treeMap.put(word, count);
        }
        return treeMap;
    }
}
