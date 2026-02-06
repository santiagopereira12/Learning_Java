package Clase4;

import java.util.Scanner;

public class UserData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Usuario user1 = new Usuario(1001L,"Santiago","santiago@prueba.com",true);
        Usuario user2 = new Usuario(102L,"Cristian","cristian@prueba.com",false);
        int opc;
        String activate;

        do {
            System.out.println("""
                    Escoger Opción a realizar.
                    1. Activar usuario.
                    2. Desactivar Usuario.
                    3. Mostrar info del usuario.
                    4. Salir.
                    """);
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc){
                case 1:
                    System.out.println("Digite el Nombre del usuario que desea Activar.(SANTIAGO/CRISTIAN)");
                    activate = sc.nextLine().trim().toUpperCase();
                    if (activate.equals("SANTIAGO")){
                        user1.activar();
                        System.out.println("Usuario activado");
                        user1.mostrarInfo();
                    } else if (activate.equals("CRISTIAN")) {
                        user2.activar();
                        System.out.println("Usuario activado");
                        user2.mostrarInfo();
                    }else {
                        System.out.println("Usuario Invalido");
                    }
                    break;
                case 2:
                    System.out.println("Digite el Nombre del usuario que desea Desactivar.(SANTIAGO/CRISTIAN)");
                    activate = sc.nextLine().trim().toUpperCase();
                    if (activate.equals("SANTIAGO")){
                        user1.desactivar();
                        System.out.println("Usuario desactivado");
                        System.out.println(user1.mostrarInfo());
                    } else if (activate.equals("CRISTIAN")) {
                        user2.desactivar();
                        System.out.println("Usuario desactivado");
                        System.out.println(user2.mostrarInfo());
                    }else {
                        System.out.println("Usuario Invalido");
                    }
                    break;
                case 3:
                    System.out.println("Digite el Nombre del usuario que desea validar información.(SANTIAGO/CRISTIAN)");
                    activate = sc.nextLine().trim().toUpperCase();
                    if (activate.equals("SANTIAGO")){
                        System.out.println(user1.mostrarInfo());
                    } else if (activate.equals("CRISTIAN")) {
                        System.out.println(user2.mostrarInfo());
                    }else {
                        System.out.println("Usuario invalido.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("dato invalido.");
            }
        }while (opc != 4);
    }
}
