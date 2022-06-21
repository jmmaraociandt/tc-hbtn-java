public class Numeros0a99 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i > 0)
                System.out.print(", ");
            System.out.printf("%d", i);
        }
        System.out.println();
    }
}
