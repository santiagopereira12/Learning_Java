import java.text.Normalizer;
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

    public String buscarMaterias(String entrada){
        try{
            int index = Integer.parseInt(entrada);
            if (index >= 1 && index <= materias.size()){
                return materias.get(index - 1);
            }
        }catch (NumberFormatException e){}

        for (String materia : materias){
            if (normalize(materia).equalsIgnoreCase(normalize(entrada))){
                return materia;
            }
        }

        return null;
    }

    private String normalize(String texto){
        return java.text.Normalizer.normalize(texto, Normalizer.Form.NFD).replaceAll("\\p{InCOMBINING_DIACRITICAL_MARKS}+","").toLowerCase();
    }
}
