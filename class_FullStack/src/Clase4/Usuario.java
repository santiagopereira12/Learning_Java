package Clase4;

public class Usuario {
    private Long id;
    private String nombre;
    private String email;
    private boolean activo;

    public Usuario(Long id, String nombre, String email, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.activo = activo;
    }

    public boolean activar(){
        return this.activo = true;
    }
    public boolean desactivar(){
        return this.activo = false;
    }
    public String mostrarInfo(){
        return "Id: "+id+"\nNombre: "+nombre+"\nEmail: "+email+"\nEstado: "+activo;
    }
}
