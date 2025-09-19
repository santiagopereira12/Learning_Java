package teacher.register.profesor;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String Nombre;
    private int edad;
    private String carrera;

    private static List<Profesor> listaProfesores = new ArrayList<>();

    public Profesor(String nombre, int edad, String carrera){
        this.Nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    public static void agregarProfesor(String nombre, int edad,String carrera){
        Profesor nuevo = new Profesor(nombre,edad,carrera);
        listaProfesores.add(nuevo);
        System.out.println("Profesor agregado correctamente: "+nuevo);
    }

    public static void registroMasivo(String nombre, int edad, String carrera){
        Profesor registro = new Profesor(nombre, edad, carrera);
        listaProfesores.add(registro);
    }


    @Override
    public String toString (){
        return "\nNombre: " +Nombre+
                ".\nEdad: " +edad+
                ".\nTitulo: " +carrera+".";
    }
}
