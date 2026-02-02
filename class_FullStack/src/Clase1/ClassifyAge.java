package Clase1;

import java.util.Scanner;

public class ClassifyAge {
    public static String clasificarEdad(int edad){
        if (edad < 18){
            return "MENOR DE EDAD";
        }else if (edad >= 18 && edad <= 65){
            return "ADULTO";
        }else {
            return "ADULTO MAYOR";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite su edad: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println(clasificarEdad(age));

        sc.close();
    }
}
