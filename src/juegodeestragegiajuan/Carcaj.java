package juegodeestragegiajuan;

public class Carcaj extends Item {
	public void recargar(Arquero arquero) {
		if(arquero.getInventario().contains(new Carcaj())) {
			arquero.setCantidadFlechas(arquero.getCantidadFlechas()+6);
		}
	}
}
