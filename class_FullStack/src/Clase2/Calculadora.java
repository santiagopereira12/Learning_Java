package Clase2;

public class Calculadora {
    public static int sumar(int a, int b){
        return a+b;
    }

    public static int resta(int a, int b){
        if (a > b){
            System.out.println("La resta no se puede realizar, el primer numero es mayor al segundo");
            return 0;
        }else {
            return a-b;
        }
    }

    public static int multiplicar(int a, int b){
        int c = a*b;
        return c;
    }

    public static double dividir(int a, int b){
        if (b != 0){
            double c = (double) a/b;
            return c;
        }else {
            System.out.println("No se puede realizar la operación");
            return 0;
        }
    }
}
