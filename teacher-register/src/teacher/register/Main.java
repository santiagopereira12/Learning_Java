package teacher.register;

import teacher.register.asignaturas.Asignaturas;
import teacher.register.profesor.Profesor;
import teacher.register.util.ScannerUtils;

public class Main {
    public static final int AGREGAR_PROFESOR = 1;
    public static final int CONSULTAR_PROFESOR = 2;
    public static final int CONSULTAR_LISTA_PROFESORES = 3;
    public static final int CONSULTAR_MATERIAS = 4;
    public static final int AGREGAR_MATERIAS = 5;
    public static final int BUSCAR_MATERIA = 6;
    public static final int ELIMINAR = 8;
    public static final int SALIR = 0;

    public static void main(String[] args) {
        int opcion;

        registroMasivo();
        registroAsignaturas();

        String nombre = ScannerUtils.capturarTexto("Nombre del creador");
        System.out.println("NUEVO PROYECTO DE REGISTRO DE PROFESORES!");
        System.out.println("¡Bienvenido " +nombre+ " nuestro creador!");

        do {
            opcion = ScannerUtils.capturarNumero("""
                    Escoja la opción que desea realizar.
                    1. Agregar Profesor.
                    2. Consultar profesor.
                    3. Consultar lista de profesores.
                    4. Consultar Lista de Materias.
                    5. Agregar nuevas Materias.
                    6. Buscar Materia.
                    8. Eliminar Profesor.
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
                    boolean encontrado = false;
                    while(!encontrado){
                        String consultaProfesor = ScannerUtils.capturarTexto("Digite el nombre del profesor");
                        System.out.println("El nombre ingresado: "+consultaProfesor);
                        encontrado = Profesor.buscarProfesor(consultaProfesor);
                    }
                }
                case CONSULTAR_LISTA_PROFESORES -> {
                    Profesor.listaProfesores();
                }
                case CONSULTAR_MATERIAS -> {
                    Asignaturas.listaAsignaturas();
                }
                case AGREGAR_MATERIAS -> {
                    String materia = ScannerUtils.capturarTexto("Ingrese la materia que desea agregar");
                    Asignaturas.agregarAsignatura(materia);
                }
                case BUSCAR_MATERIA -> {
                    boolean encontrado = false;
                    while(!encontrado){
                        String consultarAsignatura = ScannerUtils.capturarTexto("Digite el nombre de la asignatura que desea eliminar");
                        System.out.println("La asignatura buscada fue: "+consultarAsignatura);
                        encontrado = Asignaturas.buscarAsignatura(consultarAsignatura);
                    }
                }
                case ELIMINAR -> {
                    String name = ScannerUtils.capturarTexto("Digite el nombre del profesor que desea eliminar");
                    boolean eliminado = Profesor.eliminarProfesor(name);
                    if (!eliminado){
                        System.out.println("Vuelva intentarlo, no se elimino ningun profesor");
                    }
                }
                case SALIR -> {
                    System.out.println("Saliendo del sistema...");
                }
                default -> {
                    System.out.println("La opción seleccionada no es valida.");
                }
            }
        }while (opcion != SALIR);
    }

    private static void registroMasivo(){
        Profesor.registroMasivo("Camilo Martinez",25,"Licenciado Matematicas");
        Profesor.registroMasivo("Andrés Gómez", 30, "Licenciado en Física");
        Profesor.registroMasivo("Mateo Rodríguez", 28, "Ingeniero de Sistemas");
        Profesor.registroMasivo("Laura Sánchez", 27, "Licenciada en Lenguas");
        Profesor.registroMasivo("Paola Fernández", 29, "Psicóloga Educativa");
    }

    private static void registroAsignaturas(){
        Asignaturas.registroMasivo("Filosofia");
        Asignaturas.registroMasivo("Matemáticas");
        Asignaturas.registroMasivo("Lengua Castellana");
        Asignaturas.registroMasivo("Historia");
        Asignaturas.registroMasivo("Biología");
        Asignaturas.registroMasivo("Química");
        Asignaturas.registroMasivo("Física");
        Asignaturas.registroMasivo("Inglés");
        Asignaturas.registroMasivo("Educación Física");
        Asignaturas.registroMasivo("Artes");
    }
}
