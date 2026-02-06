package Clase4;

public class Usuario {
    private Long id;
    private String nombre;
    private String email;
    private boolean activo;

    public Usuario(Long id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public boolean activar(){}
    public boolean desactivar(){}
    public String mostrarInfo(){}
}
