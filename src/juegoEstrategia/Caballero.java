package juegoEstrategia;

public class Caballero extends Unidad {
	
	private Boolean caballoRebelde;
	private Integer cantidadAtaques;

	public Caballero(String nombre) {
		super(nombre, 200, 50, 2);
	}
	
	
	@Override
	public Integer atacar(Unidad unidad) throws NoSePuedeAtacarException {
		if(this.caballoEstaRebelde()) {
			throw new NoSePuedeAtacarException("Caballo está rebelde, no se puede atacar.");
		}
		this.setCantidadAtaques(this.getCantidadAtaques() + 1);
		return super.atacar(unidad);
	}

	private Boolean caballoEstaRebelde() {
		return this.caballoRebelde;
	}
	
	private Integer getCantidadAtaques() {
		return this.cantidadAtaques;
	}
	
	private void setCantidadAtaques(Integer cantidadAtaques) {
		this.cantidadAtaques = cantidadAtaques;
	}
	
}
