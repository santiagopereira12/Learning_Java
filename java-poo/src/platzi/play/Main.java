package platzi.play;
import platzi.play.contenido.*;
import platzi.play.excepcion.PeliculaExistenteException;
import platzi.play.plataforma.Plataforma;
import platzi.play.util.FileUtils;
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
    public static final int BUSCAR_POR_TIPO = 7;
    public static final int ELIMINAR = 8;
    public static final int SALIR = 9;


    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma(NOMBRE_PLATAFORMA);
        System.out.println(NOMBRE_PLATAFORMA + " v"+VERSION);

        cargarPelicula(plataforma);

        System.out.println("Más de " +plataforma.getDuracionTotal() +" Minutos de contenido.\n");
        plataforma.getContenidoPromocionable().forEach(promocionable -> System.out.println(promocionable.promocionar()));

        while (true){
            int opcion = ScannerUtils.capturarNumero("""
                    Escoger opcion.
                    1. Agregar.
                    2. Mostrar Todo.
                    3. Buscar por titulo.
                    4. Buscar por genero.
                    5. Ver Populares.
                    6. Reproducir.
                    7. Buscar por tipo de contenido.
                    8. Eliminar.
                    9. Salir.
                    """);

            switch (opcion){
                case AGREGAR -> {
                    int tipoContenido = ScannerUtils.capturarNumero("Tipo de contenido que desea agrerar.\n1. Pelicula\n2. Documental ");
                    String nombre = ScannerUtils.capturarTexto("Nombre del contenido");
                    Genero genero = ScannerUtils.capturarGenero("Genero del contenido");
                    int duracion = ScannerUtils.capturarNumero("duración del contenido");
                    double calificacion = ScannerUtils.capturarDecimal("calificacion del contenido");

                    try {
                        if (tipoContenido == 1){
                            plataforma.agregar(new Pelicula(nombre, duracion,genero,calificacion));
                        }else {
                            String narrador = ScannerUtils.capturarTexto("Narrador del Documental. ");
                            plataforma.agregar(new Documental(nombre, duracion,genero,calificacion,narrador));
                        }

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
                    Contenido contenido = plataforma.buscarPorTitulo(nombreBuscado);

                    if (contenido != null){
                        System.out.println(contenido.obtenerFichaTecnica());
                    }else {
                        System.out.println(nombreBuscado + ". No se encuentra en la plataforma");
                    }
                }
                case BUSCAR_POR_GENERO -> {
                    Genero generoPelicula = ScannerUtils.capturarGenero("Buscar por Genero: ");
                    List<Contenido> contenidoPorGenero = plataforma.buscarPorGenero(generoPelicula);
                    System.out.println(contenidoPorGenero.size() + " encontrados para el genero " +generoPelicula);
                    contenidoPorGenero.forEach(contenido -> System.out.println(contenido.obtenerFichaTecnica() +"\n"));
                }
                case VER_POPULARES ->{
                    int cantidad = ScannerUtils.capturarNumero("Ingrese la cantidad de resultados a mostrar");
                    List<Contenido> contenidoPopulares = plataforma.getPopulares(cantidad);
                    contenidoPopulares.forEach(contenido -> System.out.println(contenido.obtenerFichaTecnica()+"\n"));
                }
                case REPRODUCIR -> {
                    String nombre = ScannerUtils.capturarTexto("Digite el nombre de la pelicula");
                    Contenido contenido = plataforma.buscarPorTitulo(nombre);

                    if (contenido != null){
                        plataforma.reproducir(contenido);
                    }else {
                        System.out.println(nombre +" No existe.");
                    }
                }
                case BUSCAR_POR_TIPO -> {
                    int tipoContenido = ScannerUtils.capturarNumero("Tipo de contenido que desea buscar.\n1. Pelicula\n2. Documental ");

                    if (tipoContenido == 1){
                        List<Pelicula> peliculas = plataforma.getPelicula();
                        peliculas.forEach(pelicula -> System.out.println(pelicula.obtenerFichaTecnica()));
                    }else {
                        List<Documental> documentales = plataforma.getDocumental();
                        documentales.forEach(documental -> System.out.println(documental.obtenerFichaTecnica()));
                    }
                }
                case ELIMINAR -> {
                    String tituloEliminar = ScannerUtils.capturarTexto("titulo del contenico: ");
                    Contenido contenido = plataforma.buscarPorTitulo(tituloEliminar);

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
        plataforma.getContenido().addAll(FileUtils.leerContenido());
    }
}
