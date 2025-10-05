package teacher.register.asignacion;

import teacher.register.asignaturas.Asignaturas;
import teacher.register.profesor.Profesor;

import java.util.ArrayList;
import java.util.List;

public class Asignacion {
    private Profesor profesor;
    private Asignaturas asignaturas;

    private static List<Asignacion> listaAsignacion = new ArrayList<>();

    public Asignacion(Profesor profesor, Asignaturas asignaturas){
        this.profesor = profesor;
        this.asignaturas = asignaturas;
    }

    public static void asignar(Profesor profesor, Asignaturas asignatura){
        Asignacion nueva = new Asignacion(profesor, asignatura);
        listaAsignacion.add(nueva);
        System.out.println("Se realizo la asignación del profesor: "+profesor+ ", a la materia: " +asignatura.getNombre());
    }

    public static void asignacionAutomatica(List<Profesor> profesores, List<Asignaturas> asignaturas){
        for (Profesor profesor : profesores){
            String carrera = profesor.getCarrera().toLowerCase();

            for (Asignaturas asignatura: asignaturas){
                String nombreMateria = asignatura.getNombre().toLowerCase();

                if (carrera.contains("matematic") && nombreMateria.contains("matem")){
                    asignar(profesor, asignatura);
                } else if (carrera.contains("física") && nombreMateria.contains("física")) {
                    asignar(profesor, asignatura);
                } else if (carrera.contains("sistema") && nombreMateria.contains("informática") || nombreMateria.contains("tecnología")) {
                    asignar(profesor, asignatura);
                } else if (carrera.contains("lengua") && nombreMateria.contains("lengua")) {
                    asignar(profesor, asignatura);
                } else if (carrera.contains("psicó") && nombreMateria.contains("filosofía")) {
                    asignar(profesor, asignatura);
                }
            }
        }
    }
}
