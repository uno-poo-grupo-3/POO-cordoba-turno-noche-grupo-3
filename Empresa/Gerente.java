package clase5;
import java.time.LocalDate;
public final class Gerente extends EmpleadoPermanente {

	public Gerente(int horasTrabajadas, LocalDate antiguedad, int hijos, boolean casado, Integer dni) {
		super(400, horasTrabajadas, antiguedad, 150, hijos, casado,dni);
	}
	
}
