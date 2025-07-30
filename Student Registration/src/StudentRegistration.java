import java.util.Scanner;

public class StudentRegistration {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println("Sistema de gestion de Estudiantes");
        do {
            System.out.println("-----------//MENU//-----------");
            System.out.println("Bienvenido al sistema de gestion de usuarios\nescoja la opción que desea realizar.");
            System.out.println("1. Listar Estudiantes\n2. Registro de estudiante\n3. Listar Materias\n4.Asignar Estudiantes a materias\n5.Listar Estudiantes con sus Materias.\n6. Salir.");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("---//Lista de Esutiantes//---");
                    System.out.println(student.list()+"\n");
                    break;
                case 2:
                    System.out.println("---//Registro de Estudinates//---");
                    break;
                case 3:
                    System.out.println("---//Lista de Materias//---");
                    break;
                case 4:
                    System.out.println("---//Asignación de estudiantes//---");
                    break;
                case 5:
                    System.out.println("---//Listado de Estudiantes asignados//---");
                    break;
                case 6:
                    System.out.println("---//Saliendo del sistemas//---");
                    break;
                default:
                    System.out.println("Opción no valida.");
                    break;
            }
        }while (opc != 6);
    }
}
