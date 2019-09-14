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

	public abstract void setChofer(String chofer);

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}
	
}
