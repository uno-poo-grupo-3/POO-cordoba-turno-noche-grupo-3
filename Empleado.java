package clase5;

public abstract class Empleado {
	
	private double precioPorHora;
	private int horasTrabajadas;
	private SalarioFamiliar salarioFamiliar;
	
	public Empleado(double precioPorHora, int horasTrabajadas, int hijos, boolean casado) {
		this.setPrecioPorHora(precioPorHora);
		this.setHorasTrabajadas(horasTrabajadas);
		this.setSalarioFamiliar(hijos, casado);
	}
	
	public Empleado() {}
	
	public abstract double calcularSalario();


	public double getPrecioPorHora() {
		return precioPorHora;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public SalarioFamiliar getSalarioFamiliar() {
		return this.salarioFamiliar;
	}

	protected void setPrecioPorHora(double precioPorHora) {
		this.precioPorHora = precioPorHora;
	}
	
	protected void setSalarioFamiliar(int hijos, boolean casado) {
		this.salarioFamiliar = new SalarioFamiliar(hijos, casado);
	}
		
}
