package juegoEstrategia;

import punto.Punto;

public class Soldado extends Unidad {
	
	private Integer energia;
	private static final Integer ENERGIA_ATAQUE = 10;

	public Soldado(String nombre, Punto posicion) {
		super(nombre, 200, 10, 1, 1, posicion);
		this.setEnergia(5);
	}
	
	public void setEnergia(Integer energia) {
		this.energia = energia;
	}
	
	private Integer getEnergia() {
		return this.energia;
	}

	@Override
	public Integer atacar(Unidad unidad) throws NoSePuedeAtacarException {
		if(this.getEnergia() < ENERGIA_ATAQUE) {
			throw new SinEnergiaException("No hay energía para atacar");
		}
		this.setEnergia(this.getEnergia() - ENERGIA_ATAQUE);
		return super.atacar(unidad);
	}
	
	public void consumirPocion() {
		Integer posicionPocion = this.getInventario().indexOf(new PocionAgua());
		if(posicionPocion >= 0) {
			PocionAgua pocion = (PocionAgua) this.getInventario().get(posicionPocion);
			Integer energia = pocion.consumir(this);
			this.setEnergia(energia);
			this.getInventario().remove(new PocionAgua());
			System.out.println("Consumida pocion, ahora la energía es de " + this.getEnergia());
		}	
	}
	
	
	@Override
	public String toString() {
		return "Unidad [nombre=" + this.getNombre() + ", salud=" + this.getSalud() + ", energia=" + this.getEnergia() +  "]";
	}
	
	
}