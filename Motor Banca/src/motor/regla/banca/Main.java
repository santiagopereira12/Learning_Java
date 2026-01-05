package motor.regla.banca;

import motor.regla.banca.user.User;
import motor.regla.banca.util.ScannerUtil;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo Regla Función Banca");
        //System.out.println("Ingreso el dato: "+dato);

        String name = ScannerUtil.capturarTexto("Enter Username");
        int age = ScannerUtil.capturarNumero("Enter age");
        User.addUser(name,age);
    }
}
