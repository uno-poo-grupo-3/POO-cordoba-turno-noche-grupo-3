package juegodeestragegiajuan;

public class Main {

	public static void main(String[] args) {
		/*Unidad soldado = new Soldado("SOLDADO");
		soldado.agregarItem(new PocionAgua());
		soldado.agregarItem(new PocionAgua());
		Arquero arquero = new Arquero("ARQUERO");
		arquero.setFlechasRepuesto(100);
		Batalla batalla = new Batalla(soldado, arquero);
		Unidad unidadGanadora = batalla.simular();
		System.out.println("La unidad ganadora es " + unidadGanadora.getNombre());*/
		Soldado soldado= new Soldado("Soldado");
		PocionAgua usar = new PocionAgua();
		System.out.println(soldado.getInventario());
		soldado.agregarItem(new PocionAgua());
		System.out.println(soldado.getEnergia());
		System.out.println(soldado.getInventario());
		usar.consumir(soldado);
		System.out.println(soldado.getInventario());
		System.out.println(soldado.getEnergia());
	}

}