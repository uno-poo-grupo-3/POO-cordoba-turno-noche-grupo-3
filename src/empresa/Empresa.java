package empresa;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Empresa {
	
	private int cuit;
	private String razonSocial;
	private ArrayList<Empleado> empleados;
	
	public static void main(String args[]) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(new EmpleadoTemporario(80, 0, true,213432));
		empleados.add(new EmpleadoPermanente(80, LocalDate.of(2005, Month.MAY, 15), 2, true,1231465));
		empleados.add(new EmpleadoPermanente(160, LocalDate.of(2002, Month.JANUARY, 26), 0, false,543561));
		empleados.add(new Gerente(160, LocalDate.of(1995, Month.NOVEMBER, 04), 1, true,564654));
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
		 for( Empleado empleado:  this.getEmpleados() ) {
			 total += empleado.calcularSalario();
		    } 
		return total;
	}
	
	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}
	
}
