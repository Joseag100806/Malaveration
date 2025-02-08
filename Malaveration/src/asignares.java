import java.util.Scanner;
public class asignares {
            public static void asignarJefe() {
                Scanner si = new Scanner(System.in);
                System.out.println("Qué empleado desea ascender a Jefe");
                information.seeEmpleados();
                System.out.println("Ingrese el índice del empleado:");
                int empj = si.nextInt();
                if (empj >= 0 && empj <= information.elpropioarrei.size()) {
                    clases.Empleado empleadoboss = information.elpropioarrei.get(empj);
                    System.out.println("Ingrese el bono para el nuevo Jefe:");
                    int bono = si.nextInt();
                    if(bono > 2000000) {
                        System.out.println("Bono muy alto.");
                        System.out.println("Ingrese el bono para el nuevo Jefe:");
                        bono = si.nextInt();
                    }
                    information.elpropioarrei.get(empj).salario += bono;
                    clases.Gerente newjefe = new clases.Gerente(
                            empleadoboss.id,
                            empleadoboss.nombre,
                            empleadoboss.salario,
                            bono);
                    information.elpropioarrei.remove(empj);
                    information.jefesotes.add(newjefe);

                    System.out.println("Ha ascendido a " + newjefe.nombre + " a Jefe con éxito.");
                } else {
                    System.out.println("Índice inválido.");
                }
                Menu men = new Menu();
                men.menu();
            }
    public static void asignarempleado() {
        Scanner si = new Scanner(System.in);
        System.out.println("Qué empleado desea asignar.");
        information.seeEmpleados();
        System.out.println("Ingrese índice del empleado");
        int empe = si.nextInt();
        si.nextLine();
        if (empe >= 0 && empe < information.elpropioarrei.size()) {
            clases.Empleado emplearegular = information.elpropioarrei.get(empe);
            System.out.print("Qué puesto desea asignarle a: "  + information.elpropioarrei.get(empe).nombre + "\n");
            String puesto = si.nextLine();
                   clases.EmpleadoRegular newregular = new clases.EmpleadoRegular(
                    emplearegular.id,
                    emplearegular.nombre,
                    emplearegular.salario,
                    puesto);
            information.elpropioarrei.remove(empe);
            information.normalempleado.add(newregular);

            System.out.println("Le ha asignado el cargo " + puesto + " a " + newregular.nombre);
            Menu men = new Menu();
            men.menu();
        }
    }
    public static void asignarEtoDept(){
        Scanner si = new Scanner(System.in);
        System.out.println("Qué empleado desea asignar");
        information.seeNormalEmpleados();
        System.out.println("Elija el índice del empleado");
        int indemp = si.nextInt();
        System.out.println("A qué Departamento desea asignarlo");
        information.seeDeptS();
        System.out.println("Elija el índice del Departamento");
        int inddep = si.nextInt();
        int salarydept = information.salaries.get(inddep).getsalary();
        int empsalary = information.normalempleado.get(indemp).salario;
        information.salaries.get(indemp).setsalary(empsalary + salarydept);
        System.out.println("Empleado asignado con éxito");
        Menu men = new Menu();
        men.menu();
    }
}




