package juegoEstrategia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import punto.Punto;

class Tests {

	@Test
	void testAtaqueSoldado() throws NoSePuedeAtacarException {
		Soldado soldado = new Soldado("Juan", new Punto(1,1));
		Soldado soldadoRival = new Soldado("Pedro", new Punto(1,2));
		Integer saludCompleta = soldado.getSalud();
		soldado.atacar(soldadoRival);
		Boolean perdioVida = soldadoRival.getSalud() < saludCompleta;
		assertTrue(perdioVida);
	}
	
	@Test
	void testThowSinEnergiaException() throws NoSePuedeAtacarException {
		Soldado soldado = new Soldado("Juan", new Punto(1,1));
		Soldado soldadoRival = new Soldado("Pedro", new Punto(1,2));
		soldado.setEnergia(1);
		Throwable e = null;
		try {
			soldado.atacar(soldadoRival);
		} catch(Throwable ex) {
			e = ex;
		}
		assertTrue(e instanceof SinEnergiaException);
	}
	
	@Test
	void testObtenerEnergiaDePocion() throws NoSePuedeAtacarException {
		Soldado soldado = new Soldado("Juan", new Punto(1,1));
		PocionAgua pocion = new PocionAgua();
		Integer energiaUsada = pocion.consumir(soldado);
		assertTrue(energiaUsada.equals(50));
	}
	
	@Test
	void testCargarFlechas() throws NoSePuedeAtacarException {
		Arquero arquero = new Arquero("Pepe", new Punto(1,4));
		arquero.agregarItem(new PaqueteFlechas());
		arquero.recargarFlechas();
		assertTrue(arquero.getCantidadFlechas().equals(26));
	}

}
