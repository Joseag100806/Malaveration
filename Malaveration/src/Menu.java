import java.util.Scanner;
public class Menu {
	Scanner si = new Scanner(System.in);
    void menu() {
    int option = 0;
    while(option != 6) {
    	mostrarMenu();
    	System.out.println("Elija una opción: ");
    	option = si.nextInt();
    	switch (option) {
            case 1:
                System.out.println("Usted ha elegido la opción: 1");
                System.out.print("\n");
                information.agregarEmpleado();
                break;
            case 2:
                System.out.print("Usted ha elegido la opción: 2");
                System.out.print("\n");
                if(information.normalempleado.isEmpty() && information.elpropioarrei.isEmpty()){
                    System.out.println("Aún no hay empleados :(");
                } else if(information.jefesotes.isEmpty()){
                    System.out.println("No ha asignado Jefes.");
                } else {
                    information.makeDept();
                }
                break;
            case 3:
                if (information.elpropioarrei.isEmpty() && information.normalempleado.isEmpty()){
                    System.out.println("Aún no hay empleados :(");
                } else {
                    System.out.println("Usted ha elegido la opción: 3");
                    System.out.print("\n");
                    Menu2 a = new Menu2();
                    a.men2();
                }
                break;
            case 4:
                System.out.println("Usted ha elegido la opción: 4");
                if (information.arreidept.isEmpty()){
                    System.out.println("No hay Departamentos.");
                } else {
                    information.seeStdept();
                }
                break;
            case 5:
                System.out.print("Usted ha elegido la opción: 5.");
                if(information.normalempleado.isEmpty()){
                    System.out.print("\n");
                   System.out.println("No hay registros.");
                } else {
                    information.seeNormalEmpleados();
                }
                break;
            case 6:
            	System.out.println("Saliendo...");
                break;
            default:
            	System.out.println("La opcion ingresada no es válda");
        }
    }
	si.close();
    }
    void mostrarMenu() {
    	System.out.println("Menú Principal");
    	System.out.println("1. Contratar empleado.");
        System.out.println("2. Crear Departamento.");
    	System.out.println("3. Asignar empleados");
    	System.out.println("4. Calcular salario del departamento");
    	System.out.println("5. Consultar empleados");
       	System.out.println("6. Salir");
    }
}
