public class Post implements Comparable<Post> {
    private Autor autor;
    private String titulo;
    private String corpo;
    private Categorias categoria;

    public Post(Autor autor, String titulo, String corpo, Categorias categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    @Override
    public int compareTo(Post post) {
        return this.titulo.compareTo(post.getTitulo());
    }

    @Override
    public String toString() {
        return titulo;
    }
}
