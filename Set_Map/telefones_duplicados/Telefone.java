import java.util.Objects;

public class Telefone {
    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefone telefone = (Telefone) o;
        return Objects.equals(codigoArea, telefone.codigoArea) && Objects.equals(numero, telefone.numero);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.codigoArea);
        hash = 31 * hash + Objects.hashCode(this.numero);
        return hash;
    }

    @Override
    public String toString() {
        return "(" + codigoArea + ") " + numero;
    }
}
