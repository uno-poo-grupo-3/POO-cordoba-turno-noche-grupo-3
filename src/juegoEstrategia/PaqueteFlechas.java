package juegoEstrategia;

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
	
	public Integer consumir() {
		Integer flechas = this.getCantidadFlechas();
		this.setCantidadFlechas(0);
		return flechas;
	}
	
}