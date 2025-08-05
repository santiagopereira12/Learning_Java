import java.util.ArrayList;
import java.util.Random;

public class Assignment {
    private ArrayList<String> asignacion  = new ArrayList<>();
    private Random rand = new Random();

    public String asignarEstudiante(String nombreEstudiante, String nombreMateria){
        String registro = nombreEstudiante +" -> "+ nombreMateria;
        asignacion.add(registro);
        return "Asignación registrada: "+registro;
    }

    public String listarAsignacion(){
        if (asignacion.isEmpty()){
            return "No hay Asignaciones disponibles.";
        }

        StringBuilder sb = new StringBuilder("Estudiantes Asignados a materias:\n");
        for (int i = 0; i < asignacion.size(); i++){
            sb.append((i+1)).append(". ").append(asignacion.get(i)).append("\n");
        }
        return sb.toString();
    }

    public String asignarRandom(ArrayList<String> estudiantes, ArrayList<String> materias){
        if (estudiantes.isEmpty() || materias.isEmpty()){
            return "No hay estudiantes asignados a materias";
        }

        for (String estudiante : estudiantes){
            int index = rand.nextInt(materias.size());
            String materiaAsignada = materias.get(index);
            asignacion.add(estudiante +" -> "+materiaAsignada);
        }
        return "Asignación.";
    }
}
