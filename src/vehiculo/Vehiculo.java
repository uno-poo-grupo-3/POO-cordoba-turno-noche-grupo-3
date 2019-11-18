package vehiculo;

public abstract class Vehiculo {
	private int kmRecorridos;
	protected Persona Persona;
	public Vehiculo(int kmRecorridos, Persona persona) {
		this.setKmRecorridos(kmRecorridos);
		this.setChofer(persona);
	}
	
	public abstract void cambioChofer(Persona Chofer) throws NoSePuedeCambiarChofer;
	
	public int getkmRecorridos() {
		return kmRecorridos;
	}

	public Persona getChofer() {
		return Persona;
	}

	public void setKmRecorridos(int kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}
	public void setChofer(Persona persona) {
		Persona = persona;
	}
	public String toString() {
		return  "la cantidad de km recorridos fue de :" + this.getkmRecorridos() + 
				" y el chofer es :" + this.getChofer();
	}
}
