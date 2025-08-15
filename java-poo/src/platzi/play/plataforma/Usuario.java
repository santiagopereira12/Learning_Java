package platzi.play.plataforma;

import platzi.play.contenido.Pelicula;

public class Usuario {
    public String nombre;
    public int edad;

    public void ver(Pelicula pelicula){
        System.out.println(nombre +" Esta viendo...");
        pelicula.reproducir();
    }
}
