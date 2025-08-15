package platzi.play.plataforma;

import platzi.play.contenido.Pelicula;

import java.time.LocalDateTime;

public class Usuario {
    public String nombre;
    public int edad;
    public LocalDateTime fechaRegistro;

    public void ver(Pelicula pelicula){
        System.out.println(nombre +" Esta viendo...");
        pelicula.reproducir();
    }
}
