public class clases {
	public static class Empleado {
		public int id;
		public String nombre;
		public int salario;

	public Empleado(int id, String nombre, int salario) {
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
	}
	public int getid() { return id; }
	public String getame() {
		return nombre;
	}
	public int getsalario() {
		return salario;
	}
	}
	public static class Departamento {
		String nombred;
		String jefe;
		
	public Departamento(String nombred, String jefe) {
		this.nombred = nombred;
		this.jefe = jefe;
	}
	public String getnombred(){
		return nombred;
	}
	public String getjefe(){
		return jefe;
	}
	}
	
	public static class Gerente extends Empleado {
		int bono;
		
	public Gerente(int id, String nombre, int salario, int bono) {
		super(id, nombre, salario);
		this.bono = bono;
	}
	public int getbono() {
		return bono;
	}
	}
	
	public static class EmpleadoRegular extends Empleado {
		String puesto;
	public EmpleadoRegular(int id, String nombre,  int salario, String puesto) {
		super(id, nombre, salario);
		this.puesto = puesto;
	}
	public String getpuesto() {
		return puesto;
	}
	}
	public static class salariesDept {
		String namet;
		int salary;
		public salariesDept(String namet, int salary){
			this.namet = namet;
			this.salary = salary;
		}
		public String getnamet(){
			return namet;
		}
		public int getsalary(){
			return salary;
		}
		public void setsalary(int salary) {
			this.salary = salary;
		}
	}
}


