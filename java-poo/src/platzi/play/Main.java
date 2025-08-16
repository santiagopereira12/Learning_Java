package platzi.play;
import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Usuario;
import platzi.play.util.ScannerUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre = ScannerUtils.capturarTexto("Nombre del contenido");
        String genero = ScannerUtils.capturarTexto("Genero del contenido");
        int duracion = ScannerUtils.capturarNumero("duración del contenido");
        double calificacion = ScannerUtils.capturarDecimal("calificacion del contenido");

        Pelicula pelicula = new Pelicula();
        pelicula.titulo = nombre;
        pelicula.fechaEstreno = LocalDate.of(2007,10,6);
        pelicula.genero = genero;
        pelicula.calificar(calificacion);
        pelicula.duracion = duracion;

        System.out.println(pelicula.obtenerFichaTecnica());

        Usuario usuario = new Usuario();
        usuario.nombre = "Santiago";
        usuario.fechaRegistro = LocalDateTime.of(2025,8,11,11,42,50);

        System.out.println("\n/------------/USUARIO/-------------/");
        usuario.ver(pelicula);
        System.out.println(usuario.fechaRegistro);

    }
}
