package juegoEstrategia;

import punto.Punto;

public class Main {

	public static void main(String[] args) {
		Unidad caballero = new Caballero("El caballero audaz", new Punto(3, 5));
		caballero.agregarItem(new PocionAgua());
		Arquero arquero = new Arquero("Pepe el veloz", new Punto(2, 4));
		arquero.agregarItem(new PaqueteFlechas());
		arquero.agregarItem(new PaqueteFlechas());
		Batalla batalla = new Batalla(caballero, arquero);
		Unidad unidadGanadora = batalla.simular();
		System.out.println("La unidad ganadora es " + unidadGanadora.getNombre());	
	}

}
