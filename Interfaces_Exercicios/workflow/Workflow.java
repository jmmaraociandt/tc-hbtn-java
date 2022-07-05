import atividades.Atividade;

import java.util.ArrayList;
import java.util.Iterator;

public class Workflow {
    private ArrayList<Atividade> atividades;

    public Workflow() {
        this.atividades = new ArrayList<>();
    }

    public void registrarAtividade(Atividade atividade) {
        this.atividades.add(atividade);
    }

    public Iterator<Atividade> iteratorAtividade() {
        return this.atividades.iterator();
    }

    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }
}
