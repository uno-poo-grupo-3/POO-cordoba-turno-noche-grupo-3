package vehiculo;
import java.util.ArrayList;
import java.util.Iterator;
public class Colectivo extends Vehiculo {
	private ArrayList<Persona> pasajeros ;
	public Colectivo(int kmRecorridos, Persona Chofer) {
		super(kmRecorridos, Chofer);
		this.pasajeros = new ArrayList<Persona>();
	}	
	@Override
	public void cambioChofer(Persona Chofer) throws NoSePuedeCambiarChofer {
		if(pasajeros.isEmpty()) {
			setChofer(Chofer);
		}else {
			throw new NoSePuedeCambiarChofer("No se puede cambiar de chofer mientras haya pasajeros en el colectivo");
		}
		
	}
	public void agregarPasajero(Persona pasajeros) {
		this.pasajeros.add(pasajeros);
	}
	public void quitarPasajero(Persona PasajeroABajarr) {
		pasajeros.remove(PasajeroABajarr);
	}
}
