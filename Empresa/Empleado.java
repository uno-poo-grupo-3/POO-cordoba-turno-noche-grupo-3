package clase5;

public abstract class Empleado {
	
	private double precioPorHora;
	private int horasTrabajadas;
	private Integer dni;
	private SalarioFamiliar salarioFamiliar;
	
	public Empleado(double precioPorHora, int horasTrabajadas, int hijos, boolean casado , Integer dni) {
		this.setPrecioPorHora(precioPorHora);
		this.setHorasTrabajadas(horasTrabajadas);
		this.construirSalarioFamiliar(hijos, casado);
		this.setDni(dni);
	}
	
	public Empleado() {}
	
	public abstract double calcularSalario();


	public double getPrecioPorHora() {
		return precioPorHora;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public  Integer getDni() {
		return dni;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public void setDni(int dni) {
		this.dni = dni;
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
	
	@Override
	public String toString() {
		return "Empleado [precioPorHora=" + precioPorHora + ", horasTrabajadas=" + horasTrabajadas
				+ ", salarioFamiliar=" + salarioFamiliar + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (!dni.equals(other.dni)){
			return false;
		}
		
		return true;
	}
	
	
		
}
