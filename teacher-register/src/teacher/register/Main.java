package teacher.register;

import teacher.register.util.ScannerUtils;

public class Main {
    public static void main(String[] args) {

        String nombre = ScannerUtils.capturarTexto("Nombre del creador");
        System.out.println("NUEVO PROYECTO DE REGISTRO DE PROFESORES!");
        System.out.println("¡Bienvenido " +nombre+ " nuestro creador!");
    }
}
