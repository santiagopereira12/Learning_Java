package Clase3;

import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opc;

        System.out.println("Nombre del Titular");
        String nombre = sc.nextLine();
        AccinesCuentaBancaria acciones = new AccinesCuentaBancaria(nombre,2500.00);

        do {
            System.out.println("""
                Bienvenido al Banco Robo Seguro.
                Escoja Opción a realizar...
                1. DEPOSITAR.
                2. RETIRAR.
                3. MOSTRAR SALDO.
                4. SALIR.
                """);
            opc = sc.nextLine().trim().toUpperCase();

            switch (opc){
                case "DEPOSITAR":
                    System.out.println("Digite el monto que va depositar: ");
                    double deposito = sc.nextDouble();
                    sc.nextLine();
                    acciones.depositar(deposito);
                    acciones.mostrarSaldo();
                    break;
                case "RETIRAR":
                    System.out.println("Digite el valor a retirar: ");
                    double retiro = sc.nextDouble();
                    sc.nextLine();
                    if (retiro >= acciones.getSaldo()){
                        System.out.println("No se puede realizar el retiro.");
                    }else {
                        acciones.retirar(retiro);
                        acciones.mostrarSaldo();
                    }
                    break;
                case "SALDO":
                    acciones.mostrarSaldo();
                    break;
                case "SALIR":
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción invalida.");
                    break;
            }
        }while (!opc.equals("SALIR"));
        sc.close();
    }
}
