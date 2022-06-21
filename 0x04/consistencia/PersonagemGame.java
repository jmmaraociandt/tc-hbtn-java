public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    private String status;

    public PersonagemGame() {
    }

    public PersonagemGame(int saudeAtual, String nome) {
        this.setSaudeAtual(saudeAtual);
        this.nome = nome;
    }

    public void tomarDano(int quantidadeDeDano) {
        setSaudeAtual(Math.max(saudeAtual - quantidadeDeDano, 0));
    }

    public void receberCura(int quantidadeDeCura) {
        setSaudeAtual(Math.min(saudeAtual + quantidadeDeCura, 100));
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;

        if (this.saudeAtual > 0)
            this.status = "vivo";
        else
            this.status = "morto";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public String getStatus() {
        return status;
    }
}
