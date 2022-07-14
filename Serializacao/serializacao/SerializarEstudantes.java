import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializarEstudantes<Estudante> {
    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> students) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(nomeArquivo);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(students);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println("Nao foi possivel serializar");
        }
    }

    @SuppressWarnings("unchecked")
    public List<Estudante> desserializar() {
        List<Estudante> students = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(nomeArquivo);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
             students = (List<Estudante>) objectInputStream.readObject();
            objectInputStream.close();
            return students;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Nao foi possivel desserializar");
        }
        return students;
    }
}
