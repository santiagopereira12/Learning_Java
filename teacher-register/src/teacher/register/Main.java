package teacher.register;

import teacher.register.util.ScannerUtils;

public class Main {
    public static final int AGREGAR_PROFESOR = 1;
    public static final int CONSULTAR_PROFESOR = 2;
    public static final int CONSULTAR_LISTA_PROFESORES = 3;
    public static final int ELIMINAR = 9;
    public static final int SALIR = 0;

    public static void main(String[] args) {
        int opcion;

        String nombre = ScannerUtils.capturarTexto("Nombre del creador");
        System.out.println("NUEVO PROYECTO DE REGISTRO DE PROFESORES!");
        System.out.println("¡Bienvenido " +nombre+ " nuestro creador!");

        do {
            opcion = ScannerUtils.capturarNumero("""
                    Escoja la opción que desea realizar.
                    1. Agregar Profesor.
                    2. Consultar profesor.
                    3. Consultar lista de profesores
                    9. Eliminar.
                    0. Salir.
                    """);

            switch (opcion){
                case AGREGAR_PROFESOR -> {
                    System.out.println("Se agrego profesor");
                }
                case CONSULTAR_PROFESOR -> {
                    System.out.println("Profesor");
                }
                case CONSULTAR_LISTA_PROFESORES -> {
                    System.out.println("Profesores");
                }
                case ELIMINAR -> {
                    System.out.println("Profesor eliminado");
                }
            }
        }while (opcion != SALIR);
    }
}
