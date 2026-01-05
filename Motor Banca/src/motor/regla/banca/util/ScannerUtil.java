package motor.regla.banca.util;

import java.util.Scanner;

public class ScannerUtil {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static String capturarTexto(String mensaje){
        System.out.println(mensaje +": ");
        return SCANNER.nextLine();
    }

    public static int capturarNumero(String mensaje){
        System.out.println(mensaje + ": ");
        while (!SCANNER.hasNextInt()){
            System.out.println("Es un numero animal. \n" + mensaje + ": ");
            SCANNER.next();
        }
        int dato = SCANNER.nextInt();
        SCANNER.nextLine();
        return dato;
    }
}
