import java.util.ArrayList;
import java.util.List;

public class Celular {
    private List<Contato> contacts;

    public Celular() {
        this.contacts = new ArrayList<Contato>();
    }

    public int obterPosicaoContato(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name))
                return i;
        }
        return -1;
    }

    public void adicionarContato(Contato contactToAdd) {
        if (obterPosicaoContato(contactToAdd.getName()) != -1)
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        this.contacts.add(contactToAdd);
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) {
        if (obterPosicaoContato(contatoAntigo.getName()) == -1)
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
        if (obterPosicaoContato(novoContato.getName()) != -1 &&
                !contatoAntigo.getName().equals(novoContato.getName()))
            throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
        this.contacts.set(obterPosicaoContato(contatoAntigo.getName()), novoContato);
    }

    public void removerContato (Contato contactToRemove) {
        if (obterPosicaoContato(contactToRemove.getName()) == -1)
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        this.contacts.remove(obterPosicaoContato(contactToRemove.getName()));
    }

    public void listarContatos() {
        for (Contato contact : contacts) {
            System.out.printf("%s -> %s (%s)%n", contact.getName(), contact.getPhone(), contact.getNumberType());
        }
    }
}
