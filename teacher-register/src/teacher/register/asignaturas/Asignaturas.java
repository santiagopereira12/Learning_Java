package teacher.register.asignaturas;

import java.util.ArrayList;
import java.util.List;

public class Asignaturas {
    private String nombre;
    private List<Asignaturas> listaAsignaturas = new ArrayList<>();

    public Asignaturas(String nombre){
        this.nombre = nombre;
    }
}
