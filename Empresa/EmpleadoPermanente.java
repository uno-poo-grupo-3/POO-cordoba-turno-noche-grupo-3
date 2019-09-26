package clase5;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {
	
	private LocalDate antiguedad;
	private double precioPorAntiguedad;

	public EmpleadoPermanente(int horasTrabajadas, LocalDate antiguedad, int hijos, boolean casado, Integer dni) {
		super(300, horasTrabajadas, hijos, casado,dni);
		this.setAntiguedad(antiguedad);
		this.setPrecioPorAntiguedad(100);
	}	

	protected EmpleadoPermanente(double precioHora, int horasTrabajadas, LocalDate antiguedad, double precioAntiguedad, int hijos, boolean casado, int dni) {
		super(precioHora, horasTrabajadas, hijos, casado, dni);
		this.setAntiguedad(antiguedad);
		this.setPrecioPorAntiguedad(precioAntiguedad);
	}
	
	public EmpleadoPermanente() {
		super();
	}
	
	public LocalDate getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(LocalDate antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public void setPrecioPorAntiguedad(double precioPorAntiguedad) {
		this.precioPorAntiguedad = precioPorAntiguedad;
	}
	
	public double getPrecioPorAntiguedad() {
		return this.precioPorAntiguedad;
	}
	
	
	@Override
	public double calcularSalario() {
		return 	(this.getHorasTrabajadas() * this.getPrecioPorHora()) + 
				this.getValorPorAntiguedad() +
				(this.getSalarioFamiliar().calcularSalario());
	}
	
	private double getValorPorAntiguedad() {
		LocalDate now = LocalDate.now();
		int año = this.getAntiguedad().getYear();
		int antiguedadEnAños = now.minusYears(año).getYear();
		return antiguedadEnAños * this.getPrecioPorAntiguedad();
	}

	@Override
	public String toString() {
		return "EmpleadoPermanente [antiguedad=" + antiguedad + ", precioPorAntiguedad=" + precioPorAntiguedad + "]";
	}
	
	
}
