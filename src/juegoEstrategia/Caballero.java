package juegoEstrategia;

public class Caballero extends Unidad {
	
	private Boolean caballoRebelde;
	private Integer cantidadAtaques;

	public Caballero(String nombre) {
		super(nombre, 200, 50, 2);
	}
	
	
	@Override
	public Integer atacar(Unidad unidad) throws NoSePuedeAtacarException {
		
		this.setCantidadAtaques(this.getCantidadAtaques() + 1);
		if(this.getCantidadAtaques()==3) {
			this.setCaballoRebelde(true);
		}
		if(this.caballoEstaRebelde()) {
			throw new NoSePuedeAtacarException("El caballo está rebelde, no se puede atacar.");
		}
		return super.atacar(unidad);
	}

	public void setCaballoRebelde(Boolean caballoRebelde) {
		this.caballoRebelde = caballoRebelde;
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
