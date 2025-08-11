package platzi.play;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¡Platzi Play!");
        System.out.println("¡Bienvenido!\nDinos como te llamas:");
        String nombre = sc.nextLine();

        System.out.println(nombre +" ¿Qué edad tienes? ");
        int edad = sc.nextInt();

        System.out.println("Bienvenido "+nombre+" con tu edad: "+edad+". Puedes ver contenido.");
    }
}
