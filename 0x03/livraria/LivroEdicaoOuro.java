import livraria.exceptions.AutorInvalidoException;
import livraria.exceptions.LivroInvalidoException;

public class LivroEdicaoOuro extends Livro {
    public LivroEdicaoOuro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoException {
        super(titulo, autor, preco);
    }

    @Override
    public double getPreco() {
        return 1.3*super.getPreco();
    }
}
