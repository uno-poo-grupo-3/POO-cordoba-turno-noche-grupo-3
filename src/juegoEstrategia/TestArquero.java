package juegoEstrategia;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import juegoEstrategia.Arquero;
import juegoEstrategia.Caballero;
import juegoEstrategia.Lancero;
import juegoEstrategia.NoSePuedeAtacarException;
import juegoEstrategia.Soldado;
import punto.Punto;

public class TestArquero {

		private Arquero arquero;
		
		@Before
		public void seInstancia() {
			 this.arquero = new Arquero("pepe el flechador", new Punto(1,1));
		}
		
		@Test
		public void queTengaAtributosCorrectos() {
			Assert.assertEquals(Double.valueOf(50), this.arquero.getSalud());
			Assert.assertEquals(Double.valueOf(2), this.arquero.getCantidadFlechas());
			Assert.assertEquals(Double.valueOf(1), this.arquero.getDistanciaAtaqueMax(), 1);
			Assert.assertEquals(Double.valueOf(5), this.arquero.getDistanciaAtaqueMin(), 2);
		}
		
		@Test
		public void queAtaque() throws NoSePuedeAtacarException {
			assertTrueInt(this.arquero.atacar(new Caballero("Caballero de zona sur",new Punto(3,3))));
		}
		
		private void assertTrueInt(Integer atacar) {
			// TODO Auto-generated method stub
			
		}

		@Test
		public void queNoAtaqueSiEstaLejos() throws NoSePuedeAtacarException {
			assertFalseInt(this.arquero.atacar(new Soldado("soldado de zona oeste",new Punto(20,20))));
		}
		
		private void assertFalseInt(Integer atacar) {
			// TODO Auto-generated method stub
			
		}

		@Test
		public void queNoAtaqueSiEstaCerca() throws NoSePuedeAtacarException {
			assertFalseInt(this.arquero.atacar(new Lancero("Lancero de helado",new Punto(2,2))));
		}
		
		@Test
		public void tiroFlecha() throws NoSePuedeAtacarException {
			this.arquero.atacar(new Soldado("soldado de madera",new Punto(3,3)));
			assertEquals(Double.valueOf(0), this.arquero.getCantidadFlechas());
		}
		
		@Test
		public void recibeFlechas() {
			this.arquero.recargarFlechas();
			assertEquals(Double.valueOf(2), this.arquero.getCantidadFlechas());
		}
		
		
		
}
