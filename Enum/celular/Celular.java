import java.util.ArrayList;

public class Celular {
    private ArrayList<Contato> contatos;

    public Celular() {
        this.contatos = new ArrayList<>();
    }

    public int obterPosicaoContato(String name) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getName().equals(name))
                return i;
        }
        return -1;
    }

    public void adicionarContato(Contato contactToAdd) {
        if (obterPosicaoContato(contactToAdd.getName()) != -1)
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        this.contatos.add(contactToAdd);
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) {
        if (obterPosicaoContato(contatoAntigo.getName()) == -1)
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        if (obterPosicaoContato(novoContato.getName()) != -1 &&
                !contatoAntigo.getName().equals(novoContato.getName()))
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        this.contatos.set(obterPosicaoContato(contatoAntigo.getName()), novoContato);
    }

    public void removerContato (Contato contactToRemove) {
        if (obterPosicaoContato(contactToRemove.getName()) == -1)
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        this.contatos.remove(obterPosicaoContato(contactToRemove.getName()));
    }

    public void listarContatos() {
        for (Contato contact : contatos) {
            System.out.printf("%s -> %s (%s)%n", contact.getName(), contact.getPhone(), contact.getNumberType());
        }
    }
}
