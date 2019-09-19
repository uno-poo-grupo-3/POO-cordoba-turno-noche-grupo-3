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
		if (horasTrabajadas != other.horasTrabajadas)
			return false;
		if (Double.doubleToLongBits(precioPorHora) != Double.doubleToLongBits(other.precioPorHora))
			return false;
		if (salarioFamiliar == null) {
			if (other.salarioFamiliar != null)
				return false;
		} else if (!salarioFamiliar.equals(other.salarioFamiliar))
			return false;
		return true;
	}
	
	
		
}
