package vehiculo;
import java.util.ArrayList;
import java.util.Iterator;
public class Colectivo extends Vehiculo {
	private ArrayList<Persona> pasajeros ;
	public Colectivo(int kmRecorridos, Persona Chofer) {
		super(kmRecorridos, Chofer);
		this.pasajeros = new ArrayList<Persona>();
		
	}
	public Colectivo(int kmRecorridos, Persona Chofer,ArrayList<Persona> pasajeros) {
		super(kmRecorridos, Chofer);
		this.pasajeros = pasajeros;
		//System.out.println(this.pasajeros);
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
	public  void imprimoPasajeros(int i) {
		System.out.println(pasajeros.get(i));
	}
}
