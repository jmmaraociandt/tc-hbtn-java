import atividades.Atividade;

import java.util.Iterator;

public class MaquinaWorkflow {
    public void executar(Workflow workflow) {
        Iterator<Atividade> atividadeIterator = workflow.iteratorAtividade();

        while (atividadeIterator.hasNext()) {
            atividadeIterator.next().executar();
        }
    }
}
