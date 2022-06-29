public class Tarefa {
    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String description, int id) {
        if (description == null || description.equals(""))
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        else {
            this.descricao = description;
            this.identificador = id;
        }
    }

    public void modificarDescricao(String descriptionToUpdate) {
        if (descriptionToUpdate == null || descriptionToUpdate.equals(""))
            throw new IllegalArgumentException("Descricao de tarefa invalida");
        else
            this.descricao = descriptionToUpdate;
    }

    public boolean isEstahFeita() {
        return estahFeita;
    }

    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getIdentificador() {
        return identificador;
    }
}
