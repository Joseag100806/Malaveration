import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class information {

	public static List<clases.Empleado> elpropioarrei = new ArrayList<>();
	public static List<clases.Departamento> arreidept = new ArrayList<>();
	public static List<clases.EmpleadoRegular> normalempleado = new ArrayList<>();
	public static List<clases.Gerente> jefesotes = new ArrayList<>();
	public static List<clases.salariesDept> salaries = new ArrayList<>();

	public static void agregarEmpleado() {
		Scanner si = new Scanner(System.in);
		System.out.println("Cuántos empleados desea contratar.");
		int nume = si.nextInt();
		for(int i = 0; i < nume; i++) {
			System.out.println("Ingrese la información del empleado: " + (i + 1));
			System.out.println("Ingrese un ID para el empleado.");
			int id = si.nextInt();
			for (clases.Empleado value : jefesotes) {
				while (id == value.id) {
					System.out.println("EL ID ingresado está repetido.\nPorfavor introduzca un ID válido.");
					System.out.println("Ingrese un ID para el empleado.");
					id = si.nextInt();
				}
			}
			for (clases.Empleado value : normalempleado) {
				while (id == value.id) {
					System.out.println("EL ID ingresado está repetido.\nPorfavor introduzca un ID válido.");
					System.out.println("Ingrese un ID para el empleado.");
					id = si.nextInt();
				}
			}
            for (clases.Empleado value : elpropioarrei) {
                while (id == value.id) {
                    System.out.println("EL ID ingresado está repetido.\nPorfavor introduzca un ID válido.");
                    System.out.println("Ingrese un ID para el empleado.");
                    id = si.nextInt();
                }
            }
			while (id > 100000) {
					System.out.println("EL ID ingresado supera los límites.\nPorfavor introduzca un ID válido.");
					System.out.println("Ingrese un ID para el empleado.");
					id = si.nextInt();
			}
			si.nextLine();
			System.out.println("Ingrese el nombre del empleado.");
			String nombre = si.nextLine();
			System.out.println("Ingrese el salario que recibirá el empleado.");
			int salario = si.nextInt();
				if (salario < 1300000) {
					System.out.println("Salario muy bajo");
					System.out.println("Ingrese un salario adecuado");
					System.out.println("Ingrese el salario que recibirá el empleado.");
					salario = si.nextInt();
				} else if(salario > 5000000) {
					System.out.println("Salario muy alto");
					System.out.println("Ingrese un salario adecuado");
					System.out.println("Ingrese el salario que recibirá el empleado.");
					salario = si.nextInt();
				}
			clases.Empleado empleado = new clases.Empleado(id, nombre, salario);
			elpropioarrei.add(empleado);
		}
		System.out.println("Empleado registrado con éxito.");
	}
	public static void seeEmpleados() {
		int num = 1;
		for (int i = 0; i < elpropioarrei.size(); i++) {
			System.out.print("\n");
			System.out.println("Empleado número: " + num  + "\nIndice del empleado: " + i);
			System.out.println("Nombre: " + elpropioarrei.get(i).getame() );
			System.out.println("ID: " + elpropioarrei.get(i).getid());
			System.out.println("Salario: " + elpropioarrei.get(i).getsalario());
			System.out.print("\n");
			num++;
		}
	}
	public static void seeJefe() {
		int num = 1;
		for (int i = 0; i < jefesotes.size(); i++) {
			System.out.print("\n");
			System.out.println("Jefe: " + num + "\nIndice del Jefe: " + i);
			System.out.println("Nombre: " + jefesotes.get(i).getame());
			System.out.println("ID: " + jefesotes.get(i).getid());
			System.out.println("Salario: " + jefesotes.get(i).getsalario());
			System.out.println("Bonificación mensual: " + jefesotes.get(i).getbono());
			System.out.print("\n");
			num++;
		}
	}
	public static void makeDept() {
		Scanner si = new Scanner(System.in);
		System.out.println("Cuantos departamentos va a registrar.");
		int ndept = si.nextInt();
		si.nextLine();
		for (int i = 0; i < ndept; i++){
			System.out.println("Nombre del Departamento.");
			String namedept = si.nextLine();
			si.nextLine();
			seeJefe();
			System.out.println("Ingrese el índice del Jefe que desea asignar al nuevo Departamento.");
			int indboss = si.nextInt();
			String bossdept = jefesotes.get(indboss).nombre;
			clases.Departamento departamento = new clases.Departamento(namedept, bossdept);
			arreidept.add(departamento);
			clases.salariesDept salariot = new clases.salariesDept(namedept, jefesotes.get(indboss).salario);
			salaries.add(salariot);
			System.out.println("Ha creado un nuevo Departamento con éxito.");
			System.out.print("\n");
		}
	}
	public static void seeNormalEmpleados(){
		int num = 1;
		for (int i = 0; i < normalempleado.size(); i++) {
			System.out.print("\n");
			System.out.println("Empleado número: " + num + "\nIndice del empleado: " + i);
			System.out.println("ID: " + normalempleado.get(i).getid());
			System.out.println("Nombre: " + normalempleado.get(i).getame());
			System.out.println("Salario: " + normalempleado.get(i).getsalario());
			System.out.println("Puesto: " + normalempleado.get(i).getpuesto());
			System.out.print("\n");
			num++;

		}
		int si  = 1;
		for (int i = 0; i < elpropioarrei.size(); i++) {
			System.out.print("\n");
			System.out.println("Empleados sin puesto asignado")
			System.out.println("Empleado número: " + si + "\nIndice del empleado: " + i);
			System.out.println("ID: " + elpropioarrei.get(i).getid());
			System.out.println("Nombre: " + elpropioarrei.get(i).getame());
			System.out.println("Salario: " + elpropioarrei.get(i).getsalario());
			System.out.print("\n");
			num++;

		}
	}
	public static void seeDeptS(){
		int num = 1;
		for (int i = 0; i < salaries.size(); i++) {
			System.out.print("\n");
			System.out.println("Departamento número: " + num + "\nIndice del Departamento: " + i);
			System.out.println("Nombre: " + salaries.get(i).namet);
			System.out.print("\n");
			num++;
		}
	}
	public static void seeStdept (){
		Scanner si = new Scanner(System.in);
		System.out.println("Cuál Departamento desea consultar.");
		seeDeptS();
		System.out.println("Ingrese el indice el Departamento que desea consultar");
		int search = si.nextInt();
		for (int i = 0; i < salaries.size(); i++){
			if(i == search){
				System.out.println("Nombre del Departamento: " + salaries.get(i).getnamet());
				System.out.println("Salario total: " + salaries.get(i).getsalary());
				System.out.print("\n");
			}
		}
	}
}


