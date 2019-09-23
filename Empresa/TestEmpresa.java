package clase5;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestEmpresa {

	@Test
	void test() {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		Empleado empleado= new Empleado(50, 40,2, true, 156458);
		empleados.add(new EmpleadoPermanente(10, LocalDate.of(1999, Month.JANUARY, 26), 2, true,388289));
		empleados.add(new EmpleadoTemporario(30, 1, false,182930));
		Empresa miEmpresa = new Empresa(123, "Emp S.A", empleados);
		miEmpresa.agregarEmpleado(new Gerente(3, LocalDate.of(2009, Month.NOVEMBER, 26), 4, true,123232));
		double liquidacion = miEmpresa.montoTotal();
		Integer dni = empleado.getDni();
		assertEquals(15300, liquidacion, 0);
		assertEquals(123232, dni, 0);
	}

}
