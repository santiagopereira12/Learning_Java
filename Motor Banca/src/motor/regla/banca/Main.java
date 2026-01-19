package motor.regla.banca;

import motor.regla.banca.domain.account.Account;
import motor.regla.banca.repository.UserRepository;
import motor.regla.banca.domain.user.User;
import motor.regla.banca.service.RegisterService;
import motor.regla.banca.util.ScannerUtil;

public class Main {
    private static final String REGISTER = "A";
    private static final String LOGIN = "B";
    private static final String LOGOUT = "C";

    public static void main(String[] args) {
        String login;
        System.out.println("Hola Mundo Regla Función Banca");
        UserRepository userRepository = new UserRepository();
        RegisterService registerService  = new RegisterService(userRepository);

        //Registro Masivo
        registerService.registreMassUsers();
        userRepository.getUsers();

        do {
            login = ScannerUtil.capturarTexto("""
                    Enter the option you wish to perfom.
                    A) Register.
                    B) Login.
                    C) Logout.
                    """).trim().toUpperCase();

            switch (login) {
                case REGISTER -> {
                    String name = ScannerUtil.capturarTexto("Enter Username");
                    int age = ScannerUtil.capturarNumero("Enter age");
                    int doc = ScannerUtil.capturarNumero("Enter document number");
                    User user = new User(name, age, doc);
                    User register = registerService.createUser(user);
                    System.out.println("Succesfully registered user." + register);
                }
                case LOGIN -> {
                    int numDoc = ScannerUtil.capturarNumero("Enter your Number Document");
                    System.out.println("User Login");
                }
                case LOGOUT -> {
                    System.out.println("Leaving the system");
                }
                default -> {
                    System.out.println("Wrong option");
                }
            }
        }while (!login.equals(LOGOUT));

/*
        //Crear la cuenta.
        int number = ScannerUtil.capturarNumero("Enter the account number");
        int balance = ScannerUtil.capturarNumero("Enter the balance amount");
        String type = ScannerUtil.capturarTexto("Enter the type account");
        Account.addAccount(number,balance,type);*/
    }
}
