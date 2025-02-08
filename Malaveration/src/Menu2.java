import java.util.Scanner;
public class Menu2 {
    Scanner si = new Scanner(System.in);
    int option = 0;
    public void men2() {
        while(option != 4){
            mostrarMenu2();
            System.out.println("Elija una opción:");
            option = si.nextInt();
            switch(option){
                case 1:
                    System.out.println("Usted ha eledigo la opción 1");
                    asignares.asignarJefe();
                    break;
                case 2:
                    System.out.println("Usted ha eledigo la opción 2");
                    asignares.asignarempleado();
                    break;
                case 3:
                    System.out.println("Usted ha elegido la opción 3");
                    if (information.arreidept.isEmpty()){
                        System.out.println("No ha creado Departamento");
                    } else if(information.normalempleado.isEmpty()){
                        System.out.println("No hay empleados registrados.");
                    } else {
                        asignares.asignarEtoDept();
                    }
                    break;
                case 4:
                    System.out.println("Regresando...");
                    Menu men = new Menu();
                    men.menu();
                default:
                    System.out.print("Ingrese una opcion valida.\n");
            }
        }
    }
    void mostrarMenu2() {
        System.out.println("1. Ascender a Jefe.");
        System.out.println("2. Asignar puesto a empleado.");
        System.out.println("3. Asignar empleado a un Departamento");
        System.out.println("4. Regresar");
    }
}
