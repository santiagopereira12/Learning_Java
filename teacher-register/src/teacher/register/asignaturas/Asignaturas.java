package teacher.register.asignaturas;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

public class Asignaturas {
    private String nombre;
    private static List<Asignaturas> listaAsignaturas = new ArrayList<>();

    public Asignaturas(String nombre){
        this.nombre = nombre;
    }

    public static void agregarAsignatura(String nombre){
        boolean exist = listaAsignaturas.stream()
                .anyMatch(a -> a.nombre.equalsIgnoreCase(nombre));
        if (exist){
            System.out.println("La asignatura. " +nombre+ " ya se encuentra registrada");
        }else {
            Asignaturas nuevo = new Asignaturas(nombre);
            listaAsignaturas.add(nuevo);
            System.out.println("Asugnatura almacenada: "+nuevo);
        }
    }

    public static void registroMasivo(String materia){
        Asignaturas registro = new Asignaturas(materia);
        listaAsignaturas.add(registro);
    }

    public static void listaAsignaturas(){
        if (listaAsignaturas.isEmpty()){
            System.out.println("No existen registros.");
        }else {
            System.out.println("Lista de Asignaturas.");
            for (int i = 0; i < listaAsignaturas.size(); i++){
                System.out.println((i+1) +". " +listaAsignaturas.get(i));
            }
        }
    }

    public static boolean buscarAsignatura(String nombre){
        boolean encontrado = false;
        String asignaturaNormalizada = normalizar(nombre);
        for (Asignaturas asignatura : listaAsignaturas){
            String nombreAsignaturaNormalizada = normalizar(asignatura.nombre);
            if (nombreAsignaturaNormalizada.equals(asignaturaNormalizada)){
                System.out.println("Asignatura encontrada: "+asignatura);
                encontrado = true;
            }
        }

        if (!encontrado){
            System.out.println("No se encontro ninguna Asignatura por este nombre: "+nombre+ "\nIntente nuevamente.");
        }
        return encontrado;
    }

    public static boolean eliminarMateria(String materia){
        String materiaNormalizada = normalizar(materia);
        boolean eliminado = listaAsignaturas.removeIf(
                asignaturas -> normalizar(asignaturas.nombre).equals(materiaNormalizada)
        );
        if (eliminado){
            System.out.println("Asignatura eliminada correctamente: " +materia);
        }else {
            System.out.println("No se encontro ninguna asignatura con el nombre: " +materia);
        }
        return eliminado;
    }

    private static String normalizar(String texto){
        if (texto == null) return "";
        String normalizado = Normalizer.normalize(texto, Normalizer.Form.NFD);
        normalizado = normalizado.replaceAll("\\p{M}", "");
        return normalizado.toLowerCase().trim();
    }

    @Override
    public String toString(){
        return "Materia: " +nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Asignaturas> getListaAsignaturas(){
        return  listaAsignaturas;
    }
}
