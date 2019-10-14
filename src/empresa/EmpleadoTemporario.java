package empresa;

public class EmpleadoTemporario extends Empleado {
	
	public EmpleadoTemporario(int horasTrabajadas, int hijos, boolean casado,Integer dni) {
		super(200, horasTrabajadas, hijos, casado,dni);
	}
	
	@Override
	public double calcularSalario() {
		return 	(this.getHorasTrabajadas() * this.getPrecioPorHora()) +
				(this.getSalarioFamiliar().calcularSalario());
	}
	
}
