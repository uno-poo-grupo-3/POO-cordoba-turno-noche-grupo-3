package juegoEstrategia;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import juegoEstrategia.Arquero;
import juegoEstrategia.Caballero;
import juegoEstrategia.NoSePuedeAtacarException;
import juegoEstrategia.Soldado;
import punto.Punto;


public class TestCaballero {
	private Caballero caballero;

	@Before
	public void instancio() {
		this.caballero = new Caballero("el caballero del caballo loco", new Punto(1,1));
	}

	@Test
	public void queTengaAtributosCorrectos() {
		assertEquals(false, this.caballero.caballoEstaRebelde());
		assertEquals(2, this.caballero.getDistanciaAtaqueMax(), 1);
		assertEquals(1, this.caballero.getDistanciaAtaqueMin(), 1);
	}

	@Test
	public void queAtaque() throws NoSePuedeAtacarException {
		assertTrueInt(this.caballero.atacar(new Soldado("el capo", new Punto(2,2))));
	}

	@Test
	public void queNoAtaqueSiEstaLejos() throws NoSePuedeAtacarException {
		assertFalseInt(this.caballero.atacar(new Soldado("el idolo", new Punto(20,20))));
	}

	private void assertFalseInt(Integer atacar) {
		// TODO Auto-generated method stub

	}

	@Test
	public void queNoAtaqueSiEstaCerca() throws NoSePuedeAtacarException {
		assertTrueInt(this.caballero.atacar(new Soldado("el genio", new Punto(1.5,1.5))));
	}

	@Test
	public void queRecibaAtaque() throws NoSePuedeAtacarException {
		Arquero atacante = new Arquero("pepito", new Punto(3,3));
		atacante.atacar(this.caballero);
	}

	@Test
	public void sePoneRebelde() throws NoSePuedeAtacarException{
		Caballero atacante = new Caballero("capo", new Punto(3,3));
		Soldado atacado = new Soldado("el capo", new Punto(2,2));
		atacante.atacar(atacado);
		atacante.atacar(atacado);
		atacante.atacar(atacado);
		assertFalse(atacante.caballoEstaRebelde());
	}


	public void assertTrueInt(Integer atacar) {
		// TODO Auto-generated method stub

	}
}