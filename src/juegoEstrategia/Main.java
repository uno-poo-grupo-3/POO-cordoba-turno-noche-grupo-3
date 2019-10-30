package juegoEstrategia;

public class Main {

	public static void main(String[] args) {
		Unidad caballero = new Caballero("El caballero audaz");
		caballero.agregarItem(new PocionAgua());
		Arquero arquero = new Arquero("Pepe el veloz");
		arquero.agregarItem(new PaqueteFlechas());
		arquero.agregarItem(new PaqueteFlechas());
		Batalla batalla = new Batalla(caballero, arquero);
		Unidad unidadGanadora = batalla.simular();
		System.out.println("La unidad ganadora es " + unidadGanadora.getNombre());	
	}

}
