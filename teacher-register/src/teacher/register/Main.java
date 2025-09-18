package teacher.register;

import teacher.register.profesor.Profesor;
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
                    String name = ScannerUtils.capturarTexto("Digite el nombre del profesor");
                    int age = ScannerUtils.capturarNumero("Digite la edad del profesor");
                    String career = ScannerUtils.capturarTexto("Digete el titulo profesional del profesor");
                    Profesor.agregarProfesor(name,age,career);
                }
                case CONSULTAR_PROFESOR -> {
                    String consultaProfesor = ScannerUtils.capturarTexto("Digite el numero del profesor");
                    System.out.println("El nombre ingresado: "+consultaProfesor);

                    if (consultaProfesor == consultaProfesor){
                        System.out.println("Profesor:");
                    }else {
                        System.out.println("profesor no existente");
                    }
                }
                case CONSULTAR_LISTA_PROFESORES -> {
                    System.out.println("profesores");
                }
                case ELIMINAR -> {
                    System.out.println("Profesor eliminado");
                }
            }
        }while (opcion != SALIR);
    }
}
