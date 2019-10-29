package juegoEstrategia;

public class CaballoLocoException extends NoSePuedeAtacarException {
	private static final long serialVersionUID = 1L;

	CaballoLocoException(String mensaje) {
		super(mensaje);
	}
}