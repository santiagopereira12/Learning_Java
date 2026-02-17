package Clase4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario(101,"Santiago","santiago@prueba.com",true));
        usuarios.add(new Usuario(102,"Cristian","cristian@prueba.com",true));
        usuarios.add(new Usuario(103,"Emmanuel","emmanuel@prueba.com",true));
        usuarios.add(new Usuario(104,"Sebastian","sebastian@prueba.com",true));
        usuarios.add(new Usuario(105,"Camilo","camilo@prueba.com",true));

        int opc = 0;
        String activate;

        do {
            System.out.println("""
                    Escoger Opción a realizar.
                    1. Activar usuario.
                    2. Desactivar Usuario.
                    3. Mostrar info del usuario.
                    4. Buscar ultimo Id.
                    5. Salir.
                    """);

            try {
                opc = sc.nextInt();
                sc.nextLine();
            }catch (Exception e){
                System.out.println("Entrada invalida");
                sc.nextLine();
                continue;
            }

            switch (opc){
                case 1:
                    System.out.println("Digite el ID del usuario que desea activar");
                    try {
                        int idActivar = sc.nextInt();
                        sc.nextLine();
                        Usuario user = buscarUsuarioId(usuarios, idActivar);
                        if (user != null){
                            user.activar();
                            System.out.println("Usuario Activado.");
                            System.out.println(user.mostrarInfo());
                        }else {
                            System.out.print("Usuario invalido.");
                        }
                    }catch (Exception e){
                        System.out.println("ID invalido");
                        sc.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("Digitar el ID del Usario que desea desactivar");
                    try {
                        int idDesactivar = sc.nextInt();
                        sc.nextLine();
                        Usuario user = buscarUsuarioId(usuarios, idDesactivar);
                        if (user != null){
                            user.desactivar();
                            System.out.println("USUARIO DESACTIVATO");
                            System.out.println(user.mostrarInfo());
                        }
                    }catch (Exception e){
                        System.out.println("ID invalido: "+e);
                        sc.nextLine();
                    }
                    break;
                case 3:
                    System.out.println("Digite el ID del usuario que desea revisar la información");
                    try{
                        int idBuscar = sc.nextInt();
                        sc.nextLine();

                        Usuario user = buscarUsuarioId(usuarios, idBuscar);
                        if (user != null){
                            System.out.println("------//- INFORMACIÓN DE USUARIO "+user.getNombre().toUpperCase()+" -//--------");
                            System.out.println(user.mostrarInfo());
                        }else {
                            System.out.println("Id no corresponde.");
                        }
                    }catch (Exception e){
                        System.out.println("ID INVALIDO "+e);
                        sc.nextLine();
                    }
                    break;
                case 4:
                    int ultimoId = buscarUltimoId(usuarios);
                    if (ultimoId != 1){
                        System.out.println("Ultimo Id: "+ultimoId);
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("dato invalido.");
            }
        }while (opc != 5);
    }

    private static Usuario buscarUsuarioId(List<Usuario> user, int id){
        for (Usuario u : user){
            if (u.getId() == id){
                return u;
            }
        }
        return null;
    }

    private static int buscarUltimoId(List<Usuario> user){
        if (user.isEmpty()){
            return -1;
        }
        return user.get(user.size()-1).getId();
    }
}
