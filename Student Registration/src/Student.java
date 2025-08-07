import java.text.Normalizer;
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

    public String buscarEstudiante(String entrada){
        try{
            int index = Integer.parseInt(entrada);
            if (index >= 1 && index <= estudiantes.size()){
                return estudiantes.get(index - 1);
            }
        }catch (NumberFormatException e){}

        for (String estudiante : estudiantes){
            if (normalize(estudiante).equalsIgnoreCase(normalize(entrada.trim()))){
                return estudiante;
            }
        }

        return null;
    }

    private String normalize(String texto){
        return java.text.Normalizer.normalize(texto.trim(), Normalizer.Form.NFD).replaceAll("\\p{InCOMBINING_DIACRITICAL_MARKS}+", "").toLowerCase();
    }
}
