import java.util.ArrayList;

public class Student {
    private ArrayList<String> estudiantes = new ArrayList<>();

    public Student(){
        estudiantes.add("Santiago Pereira");
        estudiantes.add("Carlos Cuesta");
        estudiantes.add("Cristian Prieto");
        estudiantes.add("Sebastian Sanchez");
        estudiantes.add("Juan Ariza");
    }

    public String list(){
        if (estudiantes.isEmpty()){
            return "No hay estudiantes agregados.";
        }
        StringBuilder lista = new StringBuilder("Lista de Estudiantes:\n");
        for (int i = 0; i< estudiantes.size(); i++){
            lista.append((i+1)).append(". ").append(estudiantes.get(i)).append("\n");
        }
        return lista.toString();
    }

    public String register(String name){
        estudiantes.add(name);
        return "El estudiante "+name+", fue registrado correctamente.";
    }

    public boolean existsStudent(String nombre){
        return estudiantes.contains(nombre);
    }

    public ArrayList<String> getEstudiantes(){
        return estudiantes;
    }
}
