package platzi.play;
import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Plataforma;
import platzi.play.plataforma.Usuario;
import platzi.play.util.ScannerUtils;

public class Main {
    public static final String NOMBRE_PLATAFORMA = "PLATZI PLAY";
    public static final String VERSION = "1.0.0";
    public static final int SALIR = 5;
    public static final int AGREGAR = 1;
    public static final int MOSTRAR_TODO = 2;
    public static final int BUSCAR_POR_TITULO = 3;
    public static final int ELIMINAR = 4;

    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma(NOMBRE_PLATAFORMA);
        System.out.println(NOMBRE_PLATAFORMA + " v"+VERSION);

        while (true){
            int opcion = ScannerUtils.capturarNumero("""
                    Escoger opcion.
                    1. Agregar.
                    2. Mostrar Todo.
                    3. Buscar por titulo.
                    4. Eliminar.
                    5. Salir.
                    """);

            switch (opcion){
                case AGREGAR -> {
                    String nombre = ScannerUtils.capturarTexto("Nombre del contenido: ");
                    String genero = ScannerUtils.capturarTexto("Genero del contenido: ");
                    int duracion = ScannerUtils.capturarNumero("duración del contenido: ");
                    double calificacion = ScannerUtils.capturarDecimal("calificacion del contenido: ");

                    plataforma.agregar(new Pelicula(nombre, duracion,genero,calificacion));
                }
                case MOSTRAR_TODO -> plataforma.mostrarTitulo();
                case BUSCAR_POR_TITULO -> {
                    String nombreBuscado = ScannerUtils.capturarTexto("titulo del contenico: ");
                    Pelicula pelicula = plataforma.buscarPorTitulo(nombreBuscado);

                    if (pelicula != null){
                        System.out.println(pelicula.obtenerFichaTecnica());
                    }else {
                        System.out.println(nombreBuscado + ". No se encuentra en la plataforma");
                    }
                }
                case ELIMINAR -> {
                    String tituloEliminar = ScannerUtils.capturarTexto("titulo del contenico: ");
                    Pelicula contenido = plataforma.buscarPorTitulo(tituloEliminar);

                    if (contenido != null){
                        plataforma.eliminar(contenido);
                        System.out.println("Elemento eliminado: " +contenido);
                    }else {
                        System.out.println(tituloEliminar + ". No se encuentra en la plataforma");
                    }
                }
                case SALIR -> System.exit(0);
            }
        }
    }

    private static void cargarPelicula(Plataforma plataforma){
        plataforma.agregar(new Pelicula("Shrek",90,"Animada"));
        plataforma.agregar(new Pelicula("El Rey León", 88, "Animada", 4.5));
        plataforma.agregar(new Pelicula("Jurassic Park", 127, "Ciencia Ficción"));
        plataforma.agregar(new Pelicula("Titanic", 195, "Romance",3.8));
        plataforma.agregar(new Pelicula("Matrix", 136, "Acción"));
        plataforma.agregar(new Pelicula("Gladiador", 155, "Histórica",4.2));
        plataforma.agregar(new Pelicula("Coco", 105, "Animada"));
        plataforma.agregar(new Pelicula("Avengers: Endgame", 181, "Superhéroes",4.8));
        plataforma.agregar(new Pelicula("Avatar", 162, "Ciencia Ficción"));
        plataforma.agregar(new Pelicula("Interestelar", 169, "Ciencia Ficción",4));
        plataforma.agregar(new Pelicula("Frozen", 102, "Animada"));
    }
}
