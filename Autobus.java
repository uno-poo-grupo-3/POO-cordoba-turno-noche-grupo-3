package clase5;

public class Autobus extends Vehiculo {
	
	private String[] pasajeros;

	public Autobus(String chofer, double km, String[] pasajeros) {
		super(chofer, km);
		this.pasajeros = pasajeros;
	}

	public String[] getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(String[] pasajeros) {
		this.pasajeros = pasajeros;
	}

	@Override
	public void setChofer(String chofer) {
		if(this.getPasajeros().length == 0) {
			super.setChofer(chofer);
		}
	}
	
	
	
}
