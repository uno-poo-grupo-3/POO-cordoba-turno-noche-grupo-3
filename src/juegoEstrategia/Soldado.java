package juegoEstrategia;

public class Soldado extends Unidad {
	
	private Integer energia;
	private static final Integer ENERGIA_ATAQUE = 10;

	public Soldado(String nombre) {
		super(nombre, 200, 10, 1);
		this.setEnergia(20);
	}
	
	private void setEnergia(Integer energia) {
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
		Boolean seConsumioPocion = this.getInventario().remove(new PocionAgua());
		if(seConsumioPocion) {
			this.setEnergia(this.getEnergia() + 50);
			System.out.println("Consumida pocion, ahora la energía es de " + this.getEnergia());
		}	
	}
	
	
	@Override
	public String toString() {
		return "Unidad [nombre=" + this.getNombre() + ", salud=" + this.getSalud() + ", energia=" + this.getEnergia() +  "]";
	}
	
	
}