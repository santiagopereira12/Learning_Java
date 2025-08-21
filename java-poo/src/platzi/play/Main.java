package platzi.play;
import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Plataforma;
import platzi.play.plataforma.Usuario;
import platzi.play.util.ScannerUtils;

public class Main {
    public static final String NOMBRE_PLATAFORMA = "PLATZI PLAY";
    public static final String VERSION = "1.0.0";
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma(NOMBRE_PLATAFORMA);
        System.out.println(NOMBRE_PLATAFORMA + " v"+VERSION);

        String nombre = ScannerUtils.capturarTexto("Nombre del contenido");
        String genero = ScannerUtils.capturarTexto("Genero del contenido");
        int duracion = ScannerUtils.capturarNumero("duración del contenido");
        double calificacion = ScannerUtils.capturarDecimal("calificacion del contenido");

        Pelicula pelicula = new Pelicula(nombre, duracion,genero,calificacion);
        Pelicula pelicula1 = new Pelicula("Narnia",220,"Aventura");
        System.out.println("\n/--------------//CONTENIDO//------------/");
        plataforma.agregar(pelicula);
        plataforma.agregar(pelicula1);
        System.out.println("Numero de elementos en la plataforma: "+plataforma.getContenido().size());
        plataforma.mostrarTitulo();

        Usuario usuario = new Usuario("Santiago","santiago@prueba.com");

        System.out.println("\n/------------/USUARIO/-------------/");
        usuario.ver(pelicula);
        System.out.println(usuario.fechaRegistro);

        System.out.println("\n/---------//ELIMINAR//---------/");
        plataforma.eliminar(pelicula1);
        plataforma.mostrarTitulo();

    }
}
