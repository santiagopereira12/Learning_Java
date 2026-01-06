package motor.regla.banca;

import motor.regla.banca.repository.UserRepository;
import motor.regla.banca.domain.user.User;
import motor.regla.banca.util.ScannerUtil;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo Regla Función Banca");
        UserRepository userRepository = new UserRepository();

        String name = ScannerUtil.capturarTexto("Enter Username");
        int age = ScannerUtil.capturarNumero("Enter age");

        User user = new User(name, age);
        userRepository.save(user);
    }
}
