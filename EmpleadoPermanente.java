package clase5;

public class EmpleadoPermanente extends Empleado {
	
	private int antiguedad;
	private double precioPorAntiguedad;

	public EmpleadoPermanente(int horasTrabajadas, int antiguedad, int hijos, boolean casado) {
		super(300, horasTrabajadas, hijos, casado);
		this.setAntiguedad(antiguedad);
		this.setPrecioPorAntiguedad(100);
	}
	
	protected EmpleadoPermanente(double precioHora, int horasTrabajadas, int antiguedad, double precioAntiguedad, int hijos, boolean casado) {
		super(precioHora, horasTrabajadas, hijos, casado);
		this.setAntiguedad(antiguedad);
		this.setPrecioPorAntiguedad(precioAntiguedad);
	}
	
	public EmpleadoPermanente() {
		super();
	}
	
	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
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
				(this.getAntiguedad() * this.getPrecioPorAntiguedad()) +
				(this.getSalarioFamiliar().calcularSalario());
	}

}
