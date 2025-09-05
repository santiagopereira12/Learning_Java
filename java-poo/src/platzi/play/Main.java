package platzi.play;
import platzi.play.contenido.Genero;
import platzi.play.contenido.Pelicula;
import platzi.play.contenido.ResumenContenido;
import platzi.play.excepcion.PeliculaExistenteException;
import platzi.play.plataforma.Plataforma;
import platzi.play.plataforma.Usuario;
import platzi.play.util.ScannerUtils;

import java.util.List;

public class Main {
    public static final String NOMBRE_PLATAFORMA = "PLATZI PLAY";
    public static final String VERSION = "1.0.0";
    public static final int AGREGAR = 1;
    public static final int MOSTRAR_TODO = 2;
    public static final int BUSCAR_POR_TITULO = 3;
    public static final int BUSCAR_POR_GENERO = 4;
    public static final int VER_POPULARES = 5;
    public static final int REPRODUCIR = 6;
    public static final int ELIMINAR = 8;
    public static final int SALIR = 9;


    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma(NOMBRE_PLATAFORMA);
        System.out.println(NOMBRE_PLATAFORMA + " v"+VERSION);

        cargarPelicula(plataforma);

        System.out.println("Más de " +plataforma.getDuracionTotal() +" Minutos de contenido.\n");

        while (true){
            int opcion = ScannerUtils.capturarNumero("""
                    Escoger opcion.
                    1. Agregar.
                    2. Mostrar Todo.
                    3. Buscar por titulo.
                    4. Buscar por genero.
                    5. Ver Populares.
                    6. Reproducir.
                    8. Eliminar.
                    9. Salir.
                    """);

            switch (opcion){
                case AGREGAR -> {
                    String nombre = ScannerUtils.capturarTexto("Nombre del contenido: ");
                    Genero genero = ScannerUtils.capturarGenero("Genero del contenido");
                    int duracion = ScannerUtils.capturarNumero("duración del contenido: ");
                    double calificacion = ScannerUtils.capturarDecimal("calificacion del contenido: ");

                    try {
                        plataforma.agregar(new Pelicula(nombre, duracion,genero,calificacion));
                    } catch (PeliculaExistenteException e){
                        System.out.println(e.getMessage());
                    }

                }
                case MOSTRAR_TODO ->{
                    List<ResumenContenido> contenidosResumidos = plataforma.getResumenes();
                    contenidosResumidos.forEach(resumen -> System.out.println(resumen.toString()));
                }
                case BUSCAR_POR_TITULO -> {
                    String nombreBuscado = ScannerUtils.capturarTexto("titulo del contenico: ");
                    Pelicula pelicula = plataforma.buscarPorTitulo(nombreBuscado);

                    if (pelicula != null){
                        System.out.println(pelicula.obtenerFichaTecnica());
                    }else {
                        System.out.println(nombreBuscado + ". No se encuentra en la plataforma");
                    }
                }
                case BUSCAR_POR_GENERO -> {
                    Genero generoPelicula = ScannerUtils.capturarGenero("Buscar por Genero: ");
                    List<Pelicula> contenidoPorGenero = plataforma.buscarPorGenero(generoPelicula);
                    System.out.println(contenidoPorGenero.size() + " encontrados para el genero " +generoPelicula);
                    contenidoPorGenero.forEach(contenido -> System.out.println(contenido.obtenerFichaTecnica() +"\n"));
                }
                case VER_POPULARES ->{
                    int cantidad = ScannerUtils.capturarNumero("Ingrese la cantidad de resultados a mostrar");
                    List<Pelicula> contenidoPopulares = plataforma.getPopulares(cantidad);
                    contenidoPopulares.forEach(contenido -> System.out.println(contenido.obtenerFichaTecnica()+"\n"));
                }
                case REPRODUCIR -> {
                    String nombre = ScannerUtils.capturarTexto("Digite el nombre de la pelicula");
                    Pelicula contenido = plataforma.buscarPorTitulo(nombre);

                    if (contenido != null){
                        plataforma.reproducir(contenido);
                    }else {
                        System.out.println(nombre +" No existe.");
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
        plataforma.agregar(new Pelicula("Shrek",90,Genero.ANIMADA));
        plataforma.agregar(new Pelicula("El Rey León", 88, Genero.ANIMADA, 4.5));
        plataforma.agregar(new Pelicula("Jurassic Park", 127, Genero.CIENCIA_FICCION));
        plataforma.agregar(new Pelicula("Titanic", 195, Genero.ROMANCE,3.8));
        plataforma.agregar(new Pelicula("Matrix", 136, Genero.ACCION));
        plataforma.agregar(new Pelicula("Gladiador", 155, Genero.HISTORICA,4.2));
        plataforma.agregar(new Pelicula("Coco", 105, Genero.ANIMADA));
        plataforma.agregar(new Pelicula("Avengers: Endgame", 181, Genero.CIENCIA_FICCION,4.8));
        plataforma.agregar(new Pelicula("Avatar", 162, Genero.CIENCIA_FICCION));
        plataforma.agregar(new Pelicula("Interestelar", 169, Genero.CIENCIA_FICCION,4));
        plataforma.agregar(new Pelicula("Frozen", 102, Genero.ANIMADA));
    }
}
