package clase5;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestEmpresa {

	@Test
	void testEmpresaMontoTotal() {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(new EmpleadoPermanente(10, LocalDate.of(1999, Month.JANUARY, 26), 2, true,388289));
		empleados.add(new EmpleadoTemporario(30, 1, false,182930));
		Empresa miEmpresa = new Empresa(123, "Emp S.A", empleados);
		miEmpresa.agregarEmpleado(new Gerente(3, LocalDate.of(2009, Month.NOVEMBER, 26), 4, true,123232));
		double liquidacion = miEmpresa.montoTotal();
		assertEquals(15300, liquidacion, 0);
	}
	
	@Test
	void testEmpleadoEquals() {
		Empleado e1 = new EmpleadoPermanente(10, LocalDate.of(1999, Month.JANUARY, 26), 2, true, 123);
		Empleado e2 = new EmpleadoPermanente(25, LocalDate.of(1999, Month.SEPTEMBER, 26), 5, false, 123);
		assertEquals(e1, e2);
	}

}
