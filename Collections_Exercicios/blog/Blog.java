import java.util.*;

public class Blog {
    private List<Post> posts;

    public Blog() {
        this.posts = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post) {
        this.posts.add(post);
    }

    public Set<String> obterTodosAutores() {
        Set<String> authors = new TreeSet<>();
        Iterator<Post> postIterator = this.posts.iterator();

        while (postIterator.hasNext()) {
            Post post = postIterator.next();
            authors.add(post.getAutor());
        }
        return authors;
    }

    public Map<String, Integer> obterContagemPorCategoria() {
        int count = 1;
        Map<String, Integer> subjects = new TreeMap<>();
        Iterator<Post> postIterator = this.posts.iterator();

        while (postIterator.hasNext()) {
            Post post = postIterator.next();

            if (subjects.containsKey(post.getCategoria())) {
                count = subjects.get(post.getCategoria());
                count++;
            }

            subjects.put(post.getCategoria(), count);
        }
        return subjects;
    }
}
