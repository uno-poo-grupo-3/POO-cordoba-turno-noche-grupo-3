package clase5;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestEmpresa {

	@Test
	void test() {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(new EmpleadoPermanente(10, 20, 2, true));
		empleados.add(new EmpleadoTemporario(30, 1, false));
		Empresa miEmpresa = new Empresa(123, "Emp S.A", empleados);
		miEmpresa.agregarEmpleado(new Gerente(3, 10, 4, true));
		double liquidacion = miEmpresa.montoTotal();
		assertEquals(15300, liquidacion, 0);
		
	}

}
