public class PersonagemGame {
    private int saudeAtual;
    private String nome;

    private String status;

    public PersonagemGame() {
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
            status = "vivo";
        else
            status = "morto";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }
}
