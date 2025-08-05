import java.util.ArrayList;

public class Subjects {
    private ArrayList<String> materias = new ArrayList<>();

    public Subjects(){
        materias.add("Programación");
        materias.add("Diseño");
        materias.add("Matematicas");
        materias.add("Ingles");
        materias.add("Analitica");
    }
    public String list(){
        if (materias.isEmpty()){
            return "No hay materias para asignar.";
        }

        StringBuilder lista = new StringBuilder("Lista de materias:\n");
        for (int i = 0; i < materias.size(); i++){
            lista.append((i+1)).append(". ").append(materias.get(i)).append("\n");
        }
        return lista.toString();
    }

    public boolean existsSubject(String materia){
        return materias.contains(materia);
    }

    public ArrayList<String> getMaterias(){
        return materias;
    }
}
