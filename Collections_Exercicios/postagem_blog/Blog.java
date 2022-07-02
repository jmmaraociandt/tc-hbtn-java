import java.util.*;

public class Blog {
    List<Post> posts;

    public Blog() {
        this.posts = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post newPost) {
        Iterator<Post> postIterator = this.posts.iterator();
        boolean flag = false;

        while (postIterator.hasNext() && !flag) {
            Post post = postIterator.next();

            if (post.getAutor() == newPost.getAutor() && post.getTitulo() == newPost.getTitulo())
                throw new IllegalArgumentException("Postagem jah existente");
        }
        this.posts.add(newPost);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> authors = new TreeSet<>();
        Iterator<Post> postIterator = this.posts.iterator();

        while (postIterator.hasNext()) {
            Post post = postIterator.next();
            authors.add(post.getAutor());
        }
        return authors;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> subjects = new TreeMap<>();
        Iterator<Post> postIterator = this.posts.iterator();

        while (postIterator.hasNext()) {
            int count = 1;
            Post post = postIterator.next();

            if (subjects.containsKey(post.getCategoria())) {
                count = subjects.get(post.getCategoria());
                count++;
            }

            subjects.put(post.getCategoria(), count);
        }
        return subjects;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> posts = new TreeSet<>();
        Iterator<Post> postIterator = this.posts.iterator();

        while (postIterator.hasNext()) {
            Post post = postIterator.next();

            if (post.getAutor().compareTo(autor) == 0)
                posts.add(post);
        }
        return posts;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> postTreeSet = new TreeSet<>();
        Iterator<Post> postIterator = this.posts.iterator();

        while (postIterator.hasNext()) {
            Post post = postIterator.next();

            if (post.getCategoria().compareTo(categoria) == 0)
                postTreeSet.add(post);
        }
        return postTreeSet;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> subjectPosts = new TreeMap<>();
        Set<Post> postTreeSet;
        Iterator<Post> postIterator = this.posts.iterator();

        while (postIterator.hasNext()) {
            Post post = postIterator.next();

            if (!subjectPosts.containsKey(post.getCategoria()))
                postTreeSet = new TreeSet<>();
            else
                postTreeSet = subjectPosts.get(post.getCategoria());
            postTreeSet.add(post);

            subjectPosts.put(post.getCategoria(), postTreeSet);
        }
        return subjectPosts;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutores() {
        Map<Autor, Set<Post>> authorPosts = new TreeMap<>();
        Set<Post> postTreeSet;
        Iterator<Post> postIterator = this.posts.iterator();

        while (postIterator.hasNext()) {
            Post post = postIterator.next();

            if (!authorPosts.containsKey(post.getAutor()))
                postTreeSet = new TreeSet<>();
            else
                postTreeSet = authorPosts.get(post.getAutor());
            postTreeSet.add(post);

            authorPosts.put(post.getAutor(), postTreeSet);
        }
        return authorPosts;
    }
}
