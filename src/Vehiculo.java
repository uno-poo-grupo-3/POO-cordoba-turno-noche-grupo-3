package vehiculoherencia;

 public class Vehiculo {
	private int pasajeros=0,id_chofer=0;
	


	public Vehiculo() {
		 this.setPasajeros(pasajeros);
		 this.setId_chofer(id_chofer);
	}


	 protected void agregarPasajero() {}
	 protected void quitarPasajero() {}
	 protected void cambiarChofer(int id_chofer) {}
	 protected void conocerKM() {}
	 

	

	protected int getPasajeros() {
		return pasajeros;
	}


	protected void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}


	@Override
	public String toString() {
		return "Vehiculo [id_chofer= #" + id_chofer + ", pasajeros=" + pasajeros + "]";
	}
	
	protected int getId_chofer() {
		return id_chofer;
	}


	protected void setId_chofer(int id_chofer) {
		this.id_chofer = id_chofer;
	}

}
