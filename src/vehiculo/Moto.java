package vehiculo;

public class Moto extends Vehiculo{
	private Persona acompaniante;
	public Moto(int kmRecorridos, Persona Chofer, Persona acompaniante) {
		super(kmRecorridos, Chofer);
		this.setAcompaniante(acompaniante);
	}

	@Override
	public void cambioChofer(Persona Chofer) throws NoSePuedeCambiarChofer {
		if (acompaniante==null) {
			setChofer(Chofer);

		}else {
			throw new NoSePuedeCambiarChofer("No se puede cambiar de chofer mientras haya acompañantes");
		}
	}
	public void agregoPasajero(Persona persona) {
		if (acompaniante==null) {
			setAcompaniante(Persona);
		}else {
			System.out.println("No se puede agregar mas de un acompañante a la moto");
			
		}
	}
	public Persona getAcompaniante() {
		return acompaniante;
	}
	public void setAcompaniante(Persona acompaniante) {
		this.acompaniante = acompaniante;
	}


}