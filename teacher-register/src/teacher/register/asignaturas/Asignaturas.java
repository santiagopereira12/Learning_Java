package teacher.register.asignaturas;

import java.util.ArrayList;
import java.util.List;

public class Asignaturas {
    private String nombre;
    private static List<Asignaturas> listaAsignaturas = new ArrayList<>();

    public Asignaturas(String nombre){
        this.nombre = nombre;
    }

    public static void agregarAsignatura(String nombre){
        Asignaturas nuevo = new Asignaturas(nombre);
        listaAsignaturas.add(nuevo);
        System.out.println("Asugnatura almacenada: "+nuevo);
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

    @Override
    public String toString(){
        return "Materia: " +nombre;
    }
}
