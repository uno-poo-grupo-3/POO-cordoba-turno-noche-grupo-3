package clase5;

public abstract class Empleado {
	
	private double precioPorHora;
	private int horasTrabajadas;
	private SalarioFamiliar salarioFamiliar;
	
	public Empleado(double precioPorHora, int horasTrabajadas, int hijos, boolean casado) {
		this.setPrecioPorHora(precioPorHora);
		this.setHorasTrabajadas(horasTrabajadas);
		this.construirSalarioFamiliar(hijos, casado);
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
	
	private void construirSalarioFamiliar(int hijos, boolean casado) {
		this.setSalarioFamiliar(new SalarioFamiliar(hijos, casado));
	}
	
	protected void setSalarioFamiliar(SalarioFamiliar salarioFamiliar) {
		this.salarioFamiliar = salarioFamiliar;
	}
		
}
