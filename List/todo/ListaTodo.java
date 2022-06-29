import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaTodo {
    private List<Tarefa> tarefas;

    public ListaTodo() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa task) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == task.getIdentificador())
                throw new IllegalArgumentException("Tarefa com identificador " + task.getIdentificador() + " ja existente na lista");
        }
        tarefas.add(task);
    }

    public boolean marcarTarefaFeita(Integer id) {
        for (Tarefa task : tarefas) {
            if (task.getIdentificador() == id) {
                task.setEstahFeita(true);
                return true;
            }
        }
        return false;
    }

    public boolean desfazerTarefa(Integer id) {
        for (Tarefa task : tarefas) {
            if (task.getIdentificador() == id) {
                task.setEstahFeita(false);
                return true;
            }
        }
        return false;
    }

    public void desfazerTodas() {
        for (Tarefa task : tarefas) {
            task.setEstahFeita(false);
        }
    }

    public void fazerTodas() {
        for (Tarefa task : tarefas) {
            task.setEstahFeita(true);
        }
    }

    public void listarTarefas() {
        Iterator<Tarefa> taskIterator = tarefas.iterator();
        while (taskIterator.hasNext()) {
            Tarefa task = taskIterator.next();
            System.out.print("[");
            String marker = task.isEstahFeita() ? "X" : " ";
            System.out.println(marker + "]  Id: " + task.getIdentificador() + " - Descricao: " + task.getDescricao());
        }
    }
}
