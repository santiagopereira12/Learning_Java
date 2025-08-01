import java.util.Scanner;

public class StudentRegistration {
    public static void main(String[] args) {
        Student student = new Student();
        Subjects subject = new Subjects();
        Scanner sc = new Scanner(System.in);
        int opc;
        System.out.println("Sistema de gestion de Estudiantes");
        do {
            System.out.println("-----------//MENU//-----------");
            System.out.println("Bienvenido al sistema de gestion de usuarios\nescoja la opción que desea realizar.");
            System.out.println("1. Listar Estudiantes\n2. Registro de estudiante\n3. Listar Materias\n4. Asignar Estudiantes a materias\n5. Listar Estudiantes con sus Materias.\n6. Salir.");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("---//Lista de Esutiantes//---");
                    System.out.println(student.list());
                    break;
                case 2:
                    System.out.println("---//Registro de Estudinates//---");
                    sc.nextLine();
                    System.out.print("Digite el Nombre y apellido del estudiante: ");
                    String name = sc.nextLine();
                    System.out.println(student.register(name));
                    break;
                case 3:
                    System.out.println("---//Lista de Materias//---");
                    System.out.println(subject.list());
                    break;
                case 4:
                    System.out.println("---//Asignación de estudiantes//---");
                    sc.nextLine();
                    System.out.println(subject.list());
                    System.out.print("Digite la materia al que quiere asignar un estudiante: ");
                    String assign = sc.nextLine();
                    System.out.println(student.list());
                    System.out.print("Digite el nombre del estudiante a registrar: ");
                    String studentRegister = sc.nextLine();
                    System.out.println("Nombre del estudiante registrado: "+studentRegister+ ", asignado a: "+assign);
                    break;
                case 5:
                    System.out.println("---//Listado de Estudiantes asignados//---");
                    System.out.println("Los estudiantes registrados son: " + "Las materias asignadas son: ");
                    break;
                case 6:
                    System.out.println("---//Saliendo del sistemas//---\n");
                    break;
                default:
                    System.out.println("Opción no valida.");
                    break;
            }
        }while (opc != 6);
    }
}
