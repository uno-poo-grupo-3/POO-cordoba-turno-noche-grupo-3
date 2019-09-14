package clase5;

public class Motocicleta extends Vehiculo {
	
	private String acompañante;

	public Motocicleta(String chofer, double km, String acompañante) {
		super(chofer, km);
		this.acompañante = acompañante;
	}

	public String getAcompañante() {
		return acompañante;
	}V

	public void setAcompañante(String acompañante) {
		this.acompañante = acompañante;
	}

	@Override
	public void setChofer(String chofer) {
		if (this.getAcompañante().isEmpty()) {
			super.setChofer(chofer);
		}
		
	}
	
}
