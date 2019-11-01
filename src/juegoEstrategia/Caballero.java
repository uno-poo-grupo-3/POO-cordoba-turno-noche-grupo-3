package juegoEstrategia;

import punto.Punto;

/**
 * 
 * Esta clase representa a la unidad Caballero.
 * 
 * @verion 1.0
 * @author Juan Picasso
 * @author Agustin Gonzalez
 * @author Lucas Fernandez
 *
 */
public class Caballero extends Unidad {
	
	private Boolean caballoRebelde;
	private Integer cantidadAtaques;

	public Caballero(String nombre, Punto posicion) {
		super(nombre, 200, 50, 1, 2, posicion);
		this.setCantidadAtaques(0);
		this.setCaballoRebelde(false);
	}
	
	/**
	 * Ataca a una unidad enemiga. Vamos a poder atacar siempre y cuando el caballo no este rebelde, cada 3 ataques el caballo se pondra rebelde.
	 * 
	 * @param unidad - La unidad enemiga a la cual queremos atacar.
	 * @return Salud restante de la unidad enemiga.
	 * @throws CaballoLocoException Si el caballo esta rebelde.
	 */
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

	Boolean caballoEstaRebelde() {
		return this.caballoRebelde;
	}
	
	private Integer getCantidadAtaques() {
		return this.cantidadAtaques;
	}
	
	private void setCantidadAtaques(Integer cantidadAtaques) {
		this.cantidadAtaques = cantidadAtaques;
	}
	
	/**
	 * 
	 * Consumo una poción del inventario (si es que tiene) para quitarle lo rebelde al caballo y poder seguir atacando.
	 */
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
