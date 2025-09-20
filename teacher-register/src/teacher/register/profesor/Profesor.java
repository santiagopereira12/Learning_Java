package teacher.register.profesor;

import java.text.Normalizer;
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

    public static void listaProfesores(){
        if (listaProfesores.isEmpty()){
            System.out.println("No hay registro de docentes.");
        }else {
            System.out.println("Lista de Profesores.");
            for (int i = 0; i < listaProfesores.size(); i++){
                System.out.println((i+1)+ ". " +listaProfesores.get(i));
            }
        }
    }

    public static boolean buscarProfesor(String nombreBuscado){
        boolean encontrado = false;
        String nombreNormalizado = normalizar(nombreBuscado);
        for (Profesor profesor : listaProfesores){
            String nombreProfesorNormalizado = normalizar(profesor.Nombre);
            if (nombreProfesorNormalizado.equals(nombreNormalizado)){
                System.out.println("Profesor encontrado: "+profesor);
                encontrado = true;
            }
        }

        if (!encontrado){
            System.out.println("No se encontro ningun profesor con ese nombre: " +nombreBuscado+ ".\nIntente nuevamente.");
        }
        return encontrado;
    }

    private static String normalizar(String texto){
        if (texto == null) return "";
        String normalizado = Normalizer.normalize(texto, Normalizer.Form.NFD);
        normalizado = normalizado.replaceAll("\\p{M}", "");
        return normalizado.toLowerCase().trim();
    }

    @Override
    public String toString (){
        return "Nombre: " +Nombre+
                ". | Edad: " +edad+
                ". | Titulo: " +carrera+".";
    }
}
