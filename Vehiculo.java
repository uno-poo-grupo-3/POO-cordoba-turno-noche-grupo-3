package clase5;

public abstract class Vehiculo {
	
	private String chofer;
	private double km;
	
	public Vehiculo(String chofer, double km) {
		this.chofer = chofer;
		this.km = km;
	}

	public String getChofer() {
		return chofer;
	}

	public void setChofer(String chofer) {
		this.chofer = chofer;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}
	
}
