package juegoEstrategia;

import punto.Punto;

/**
 * 
 * Esta clase representa a la unidad Arquero.
 * 
 * @verion 1.0
 * @author Juan Picasso
 * @author Agustin Gonzalez
 * @author Lucas Fernandez
 *
 */
public class Arquero extends Unidad {
	
	private Integer carcajConFlechas;

	public Arquero(String nombre, Punto posicion) {
		super(nombre, 50, 5, 2, 5, posicion);
		this.setCantidadFlechas(2);
	}

	/**
	 * Para atacar el arquero necesita tener flechas. Se consumira 1 flecha para el ataque.
	 * 
	 * @param unidad - La unidad enemiga a la cual queremos atacar.
	 * @return Salud restante de la unidad enemiga.
	 * @throws SinFlechasException cuando el arquero no tiene flechas y tampoco tiene un pack de flechas en su inventario.
	 */
	@Override
	public Integer atacar(Unidad unidad) throws NoSePuedeAtacarException {
		if(!this.tengoFlechas()) {
			throw new SinFlechasException("No tengo flechas para atacar.");
		}
		this.consumirFlecha();
		return super.atacar(unidad);
	}
	
	public Integer getCantidadFlechas() {
		return this.carcajConFlechas;
	}
	
	private void setCantidadFlechas(Integer cantidadFlechas) {
		this.carcajConFlechas = cantidadFlechas;
	}
	
	/**
	 * Verifica tener al menos 1 flecha en el carcaj.
	 * 
	 * @return Si la cantidad de flechas es mayor a 0 o no.
	 */
	private Boolean tengoFlechas() {
		return this.getCantidadFlechas() > 0;
	}
	
	/**
	 * Resta en 1 la cantidad de flechas disponibles.
	 * 
	 */
	private void consumirFlecha() {
		this.setCantidadFlechas(this.getCantidadFlechas()-1);
	}
	
	/**
	 * Busca en el inventario un pack de flechas, si lo encuentra las añade al carcaj de flechas.
	 * 
	 */
	public void recargarFlechas() {
		Integer posicionPaqueteFlechas = this.getInventario().indexOf(new PaqueteFlechas());
		if(posicionPaqueteFlechas >= 0) {
			PaqueteFlechas paqueteFlechas = (PaqueteFlechas) this.getInventario().get(posicionPaqueteFlechas);
			Integer flechas = paqueteFlechas.consumir();
			this.setCantidadFlechas(this.getCantidadFlechas() + flechas);
			this.getInventario().remove(new PaqueteFlechas());
			System.out.println("Flechas recargasdas +" + this.getCantidadFlechas());
		}	
	}
		
}