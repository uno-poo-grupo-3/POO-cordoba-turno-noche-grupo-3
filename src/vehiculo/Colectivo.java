package vehiculoherencia;

public class Colectivo extends Vehiculo {
	public Colectivo () {
		super();
	}

	public void agregarPasajero() {
		super.setPasajeros(getPasajeros()+1);
	}
	
	public void quitarPasajero() {
		if(super.getPasajeros()!=0) {
			super.setPasajeros(getPasajeros()-1);
		}
	}
	
	public void cambiarChofer(int id_chofer) {
		if(super.getPasajeros()==0) {
			super.setId_chofer(id_chofer);
		}
		
	}
	
	public void conocerKM() {
		System.out.println("Kilometros recorridos");
	}
}
