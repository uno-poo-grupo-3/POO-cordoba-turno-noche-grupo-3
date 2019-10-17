package vehiculoherencia;

public class Main {
	public static void main(String[] args) {
		Moto m1 = new Moto();
		Colectivo c1= new Colectivo();
		
		c1.agregarPasajero();
		c1.agregarPasajero();
		c1.agregarPasajero();
		m1.agregarPasajero();
		m1.agregarPasajero();
		m1.agregarPasajero();
		System.out.println(c1);
		System.out.println(m1);
		
	}
}
