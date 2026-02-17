package Clase4;

public class Usuario {
    private int id;
    private String nombre;
    private String email;
    private boolean activo;

    public Usuario(int id, String nombre, String email, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.activo = activo;
    }

    public void activar(){
        this.activo = true;
    }
    public void desactivar(){
        this.activo = false;
    }
    public String mostrarInfo(){
        return "Id: "+id+"\nNombre: "+nombre+"\nEmail: "+email+"\nEstado: "+activo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
