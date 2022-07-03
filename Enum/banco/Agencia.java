import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agencia {
    private String nome;
    private List<Cliente> clientes;

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscarCliente(String clientName) {
        Iterator<Cliente> clienteIterator = clientes.iterator();
        while (clienteIterator.hasNext()) {
            Cliente cliente = clienteIterator.next();
            if (cliente.getNome().equals(clientName))
                return cliente;
        }
        return null;
    }

    public boolean novoCliente(String clientName, double initialTransaction) {
        if (buscarCliente(clientName) == null)
            return this.clientes.add(new Cliente(clientName, initialTransaction));
        return false;
    }

    public boolean adicionarTransacaoCliente(String clientName, double newTransaction) {
        if (buscarCliente(clientName) == null)
            return false;

        Cliente cliente = buscarCliente(clientName);
        cliente.adicionarTransacao(newTransaction);
        return true;
    }
}
