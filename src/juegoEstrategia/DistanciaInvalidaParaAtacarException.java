package juegoEstrategia;

public class DistanciaInvalidaParaAtacarException extends NoSePuedeAtacarException {
	private static final long serialVersionUID = 1L;

	DistanciaInvalidaParaAtacarException(String mensaje) {
		super(mensaje);
	}
}