package platzi.play;

import platzi.play.contenido.Pelicula;

public class MainStackHeap {
    public static void main(String[] args) {
        Pelicula reyLeon = new Pelicula("Rey Leon",120,"Animada");
        Pelicula harryPotter = new Pelicula("Harry Potter", 200, "Fantasia");

        reyLeon = harryPotter;
        reyLeon.titulo = "El Hobbit";

        System.out.println("Rey Leon: " + reyLeon.titulo);
        System.out.println("Harry Potter: " + harryPotter.titulo);
    }
}
