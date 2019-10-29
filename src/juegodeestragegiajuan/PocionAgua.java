package juegodeestragegiajuan;

public class PocionAgua extends Item {
	PocionAgua pocion = new PocionAgua();
	public  void consumir(Soldado soldado) {
		if(soldado.getInventario().contains(pocion)) {
			soldado.setEnergia(soldado.getEnergia()+50);
			soldado.getInventario().remove(pocion);
			
		}
	}
}