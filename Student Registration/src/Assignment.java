import java.util.ArrayList;

public class Assignment {
    private ArrayList<String> asignacion  = new ArrayList<>();

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
}
