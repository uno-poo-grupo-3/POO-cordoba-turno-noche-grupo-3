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
			throw new NoSePuedeCambiarChofer("No se puede cambiar de chofer mientras haya acompa�antes");
		}
	}
	public void agregoPasajero(Persona persona) throws MaximaCantidadDePasajerosException {
		if (acompaniante==null) {
			setAcompaniante(Persona);
		}else {
			throw new MaximaCantidadDePasajerosException("La moto solo puede tener 1 acompañante");
			
		}
	}
	public Persona getAcompaniante() {
		return acompaniante;
	}
	public void setAcompaniante(Persona acompaniante) {
		this.acompaniante = acompaniante;
	}


}