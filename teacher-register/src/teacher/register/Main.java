package teacher.register;

import teacher.register.util.ScannerUtils;

public class Main {
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
                    9. Eliminar.
                    0. Salir.
                    """);
        }while (opcion != SALIR);
    }
}
