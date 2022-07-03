import java.util.ArrayList;
import java.util.Iterator;

public class Banco {
    private String nome;
    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public Agencia buscarAgencia(String name) {
        Iterator<Agencia> agenciaIterator = agencias.iterator();
        while (agenciaIterator.hasNext()) {
            Agencia agencia = agenciaIterator.next();
            if (agencia.getNome().equals(name))
                return agencia;
        }
        return null;
    }

    public boolean adicionarAgencia(String name) {
        if (buscarAgencia(name) == null)
            return this.agencias.add(new Agencia(name));
        return false;
    }

    public boolean adicionarCliente(String agencyName, String clientName, double transaction) {
        if (buscarAgencia(agencyName) != null) {
            for (Agencia agency : agencias) {
                if (agency.buscarCliente(clientName) == null)
                    return agency.novoCliente(clientName, transaction);
            }
        }
        return false;
    }

    public boolean adicionarTransacaoCliente(String agencyName, String clientName, double transactionToAdd) {
        if (buscarAgencia(agencyName) != null) {
            for (Agencia agency : agencias) {
                if (agency.buscarCliente(clientName) != null)
                    return agency.adicionarTransacaoCliente(agency.buscarCliente(clientName).getNome(), transactionToAdd);
            }
        }
        return false;
    }

    public boolean listarClientes(String agencyName, boolean printTransaction) {
        if (buscarAgencia(agencyName) == null)
            return false;
        else {
            Agencia agency = buscarAgencia(agencyName);

            if (!printTransaction) {
                for (int i = 0; i < agency.getClientes().size(); i++) {
                    System.out.printf("Cliente: %s [%d]\n", agency.getClientes().get(i).getNome(), i + 1);
                }
            } else {
                for (int i = 0; i < agency.getClientes().size(); i++) {
                    System.out.printf("Cliente: %s [%d]\n", agency.getClientes().get(i).getNome(), i + 1);

                    for (int j = 0; j < agency.getClientes().get(i).getTransacoes().size(); j++) {
                        System.out.printf("  [%d] valor %.2f\n", j + 1, agency.getClientes().get(i).getTransacoes().get(j));
                    }
                }
            }
            return true;
        }
    }
}
