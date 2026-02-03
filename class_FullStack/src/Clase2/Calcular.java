package Clase2;

import java.util.Scanner;

public class Calcular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opc;

        do {
            System.out.println("""
                    Escoja la operación que desea realizar.
                    1. SUMA.
                    2. RESTA.
                    3. MULTIPLICACION.
                    4. DIVISION.
                    5. Salir.
                    """);
            opc = sc.nextLine().trim().toUpperCase();

            switch (opc){
                case "SUMA"->{
                    System.out.println("Digite los numero para la operación");
                    int num1 = sc.nextInt();
                    sc.nextLine();
                    int num2 = sc.nextInt();
                    sc.nextLine();
                    System.out.println(Calculadora.sumar(num1,num2));
                }
                case "RESTA"->{
                    System.out.println("Digite los numero para la operación");
                    int num1 = sc.nextInt();
                    sc.nextLine();
                    int num2 = sc.nextInt();;
                    sc.nextLine();
                    System.out.println(Calculadora.resta(num1,num2));
                }
                case "MULTIPLICACION"->{
                    System.out.println("Digite los numero para la operación");
                    int num1 = sc.nextInt();
                    sc.nextLine();
                    int num2 = sc.nextInt();;
                    sc.nextLine();
                    System.out.println(Calculadora.multiplicar(num1,num2));
                }
                case "DIVISION"->{
                    System.out.println("Digite los numero para la operación");
                    int num1 = sc.nextInt();
                    sc.nextLine();
                    int num2 = sc.nextInt();;
                    sc.nextLine();
                    System.out.println(Calculadora.dividir(num1,num2));
                }
                case "SALIR" ->{
                    System.out.println("Saliendo del sistema.");
                }
            }
        }while (!opc.equals("SALIR"));
    }
}
