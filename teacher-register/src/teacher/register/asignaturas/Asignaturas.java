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

    @Override
    public String toString(){
        return "\nMateria: " +nombre;
    }
}
