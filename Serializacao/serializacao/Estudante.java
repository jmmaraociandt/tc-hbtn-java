import java.io.Serializable;

public class Estudante implements Serializable {
    private static final long serialVersionUID = 7339185795277210845L;
    private int idade;
    private String nome;
    transient String senha;



    public Estudante(int idade, String nome, String senha) {
        this.idade = idade;
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return String.format("Estudante { nome='%s', idade='%d', senha='%s' }", nome, idade, senha);
    }
}
