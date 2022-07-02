public class Autor implements Comparable<Autor> {
    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }

    @Override
    public int compareTo(Autor autor) {
        if (this.nome.compareTo(autor.nome) != 0)
            return this.nome.compareTo(autor.nome);
        return this.sobrenome.compareTo(autor.sobrenome);
    }
}
