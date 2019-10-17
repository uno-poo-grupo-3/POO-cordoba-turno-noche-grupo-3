package vehiculoherencia;

public class Moto extends Vehiculo{

	public Moto () {
		super();
	}

	public void agregarPasajero() {
		if(super.getPasajeros()==1) {
			super.setPasajeros(1);
		}else {
			super.setPasajeros(getPasajeros()+1);
		}
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




