package vehiculo;

public class NoSePuedeCambiarChofer extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	NoSePuedeCambiarChofer(String mensaje) {
		super(mensaje);
	}

}