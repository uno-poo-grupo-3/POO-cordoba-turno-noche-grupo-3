package juegoEstrategia;

public class Caballero extends Unidad {
	
	private Boolean caballoRebelde;
	private Integer cantidadAtaques;

	public Caballero(String nombre) {
		super(nombre, 200, 1, 2);
		this.setCantidadAtaques(0);
		this.setCaballoRebelde(false);
	}
	
	@Override
	public Integer atacar(Unidad unidad) throws NoSePuedeAtacarException {
		if(this.getCantidadAtaques().equals(3))
			this.setCaballoRebelde(true);
		
		if (this.getCaballoRebelde().equals(true))
			throw new CaballoLocoException("El caballo está loco, no se puede atacar.");
		
		this.setCantidadAtaques(this.getCantidadAtaques()+1);
		return super.atacar(unidad);
	}

	private Boolean getCaballoRebelde() {
		return this.caballoRebelde;
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
	
	public void consumirPocion() {
		Integer posicionPocion = this.getInventario().indexOf(new PocionAgua());
		if(posicionPocion >= 0) {
			PocionAgua pocion = (PocionAgua) this.getInventario().get(posicionPocion);
			Boolean cura = pocion.consumir(this);
			this.setCaballoRebelde(cura);
			this.setCantidadAtaques(0);
			this.getInventario().remove(new PocionAgua());
			System.out.println("Consumida pocion, ahora el caballo esta ok");
		}	
	}
	
}
