package juegoEstrategia;

/**
 * 
 * Item que representa un pack de flechas.
 * 
 * @verion 1.0
 * @author Juan Picasso
 * @author Agustin Gonzalez
 * @author Lucas Fernandez
 *
 */
public class PaqueteFlechas extends Item {
	
	Integer cantidadFlechas;
	
	PaqueteFlechas() {
		this.setCantidadFlechas(6);
	}
	
	private void setCantidadFlechas(Integer cantidadFlechas) {
		this.cantidadFlechas = cantidadFlechas;
	}
	
	private Integer getCantidadFlechas() {
		return this.cantidadFlechas;
	}
	
	/**
	 * Consume el total de flechas disponible en el pack.
	 * 
	 * @return Flechas para arquero.
	 */
	public Integer consumir() {
		Integer flechas = this.getCantidadFlechas();
		this.setCantidadFlechas(0);
		return flechas;
	}
	
}