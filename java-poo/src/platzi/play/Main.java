package platzi.play;
import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Usuario;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pelicula pelicula = new Pelicula();
        pelicula.titulo = "Narnia";
        pelicula.fechaEstreno = LocalDate.of(2007,10,6);
        pelicula.genero = "Aventura";
        pelicula.calificar(4.5);
        pelicula.duracion = 120;

        long duracionLong = pelicula.duracion;
        int calificacionInt = (int) pelicula.calificacion;
        int numeroPremios = (int) Long.parseLong(String.valueOf(25));

        Usuario usuario = new Usuario();
        usuario.nombre = "Santiago";
        usuario.fechaRegistro = LocalDateTime.of(2025,8,11,11,42,50);

        System.out.println(pelicula.obtenerFichaTecnica());
        System.out.println("Duración: "+duracionLong);
        System.out.println("Calificación: "+calificacionInt);
        System.out.println("Premios: "+numeroPremios);
        System.out.println("\n/------------/USUARIO/-------------/");
        usuario.ver(pelicula);
        System.out.println(usuario.fechaRegistro);

        /*
        System.out.println("¡Platzi Play!");
        System.out.println("¡Bienvenido!\nDinos como te llamas:");
        String nombre = sc.nextLine();

        System.out.println(nombre +" ¿Qué edad tienes? ");
        int edad = sc.nextInt();

        System.out.println("Bienvenido "+nombre+" con tu edad: "+edad+". Puedes ver contenido.");*/
    }
}
