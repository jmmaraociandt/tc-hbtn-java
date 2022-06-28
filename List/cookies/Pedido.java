import java.util.ArrayList;
import java.util.List;

public class Pedido {
    List<PedidoCookie> cookies;

    public Pedido() {
        cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie orderedCookie) {
        cookies.add(orderedCookie);
    }

    public int obterTotalCaixas() {
        return cookies.stream().mapToInt(PedidoCookie::getQuantidadeCaixas).sum();
    }

    public int removerSabor(String flavorToRemove) {
        int totalBoxRemoved = 0;

        for (int i = 0; i < cookies.size(); i++) {
            if (cookies.get(i).getSabor().equals(flavorToRemove)) {
                totalBoxRemoved += cookies.get(i).getQuantidadeCaixas();
                cookies.remove(i);
            }
        }
        return totalBoxRemoved;
    }
}
