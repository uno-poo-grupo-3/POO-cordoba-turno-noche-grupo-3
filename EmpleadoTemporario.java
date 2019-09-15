package clase5;

public class EmpleadoTemporario extends Empleado {
	
	public EmpleadoTemporario(int horasTrabajadas, int hijos, boolean casado) {
		super(200, horasTrabajadas, hijos, casado);
	}
	
	@Override
	public double calcularSalario() {
		return 	(this.getHorasTrabajadas() * this.getPrecioPorHora()) +
				(this.getSalarioFamiliar().calcularSalario());
	}
	
}
