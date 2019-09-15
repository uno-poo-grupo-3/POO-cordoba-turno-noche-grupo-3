package clase5;

import java.util.ArrayList;

public class Empresa {
	
	private int cuit;
	private String razonSocial;
	private ArrayList<Empleado> empleados;
	
	public static void main(String args[]) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(new EmpleadoTemporario(80, 0, true));
		empleados.add(new EmpleadoPermanente(80, 6, 2, true));
		empleados.add(new EmpleadoPermanente(160, 4, 0, false));
		empleados.add(new Gerente(160, 10, 1, true));
		Empresa miEmpresa = new Empresa(1234567, "empresa falsa 123", empleados);
		System.out.println(miEmpresa.montoTotal());

	}
	
	public Empresa(int cuit, String razonSocial, ArrayList<Empleado> empleados) {
		this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.empleados = empleados;
	}
	
	public int getCuit() {
		return this.cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	
	
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public double montoTotal() {
		double total = 0;
		for(int i = 0; i < this.getEmpleados().size(); i++) {
			total += this.getEmpleados().get(i).calcularSalario();
		}
		return total;
	}
	
	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}
	
}
