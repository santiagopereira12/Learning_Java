package motor.regla.banca;

import motor.regla.banca.domain.account.Account;
import motor.regla.banca.repository.UserRepository;
import motor.regla.banca.domain.user.User;
import motor.regla.banca.service.RegisterService;
import motor.regla.banca.util.ScannerUtil;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo Regla Función Banca");
        UserRepository userRepository = new UserRepository();
        RegisterService registerService  = new RegisterService(userRepository);

        //Registro Masivo
        registerService.registreMassUsers();
        userRepository.getUsers();

        //Crear Usuario
        String name = ScannerUtil.capturarTexto("Enter Username");
        int age = ScannerUtil.capturarNumero("Enter age");
        int doc = ScannerUtil.capturarNumero("Enter document number");
        User user = new User(name, age, doc);
        registerService.createUser(user);
/*
        //Crear la cuenta.
        int number = ScannerUtil.capturarNumero("Enter the account number");
        int balance = ScannerUtil.capturarNumero("Enter the balance amount");
        String type = ScannerUtil.capturarTexto("Enter the type account");
        Account.addAccount(number,balance,type);*/
    }
}
