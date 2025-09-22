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

    @Override
    public String toString(){
        return "\nMateria: " +nombre;
    }
}
