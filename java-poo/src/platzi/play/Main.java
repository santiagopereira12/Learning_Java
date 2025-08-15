package platzi.play;
import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pelicula pelicula = new Pelicula();
        pelicula.titulo = "Narnia";
        pelicula.anioEstreno = 2002;
        pelicula.genero = "Aventura";
        pelicula.calificar(4.5);

        Usuario usuario = new Usuario();
        usuario.nombre = "Santiago";

        //System.out.println(pelicula.obtenerFichaTecnica());
        usuario.ver(pelicula);

        /*
        System.out.println("¡Platzi Play!");
        System.out.println("¡Bienvenido!\nDinos como te llamas:");
        String nombre = sc.nextLine();

        System.out.println(nombre +" ¿Qué edad tienes? ");
        int edad = sc.nextInt();

        System.out.println("Bienvenido "+nombre+" con tu edad: "+edad+". Puedes ver contenido.");*/
    }
}
