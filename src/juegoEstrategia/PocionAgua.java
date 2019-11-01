package juegoEstrategia;

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
public class PocionAgua extends Item {
	
	private Integer energia;
	private Boolean curaParaLocura;
	
	private Boolean getCuraParaLocura() {
		return curaParaLocura;
	}
	
	private void setCuraParaLocura(Boolean curaParaLocura) {
		this.curaParaLocura = curaParaLocura;
	}

	PocionAgua() {
		this.setEnergia(50);
		this.setCuraParaLocura(false);
	}
	
	private void setEnergia(Integer energia) {
		this.energia = energia;
	}
	
	private Integer getEnergia() {
		return this.energia;
	}
	
	/**
	 * Entrega energía al soldado, se vacia el total de energía de la poción.
	 * 
	 * @param soldado - Unidad de tipo Soldado a la cual se le quiere dar energía. 
	 * @return Energía total de la poción.
	 */
	public Integer consumir(Soldado soldado) {
		Integer energia = this.getEnergia();
		this.setEnergia(0);
		return energia;
	}
	
	/**
	 * Entrega la cura para el caballo rebelde.
	 * 
	 * @param caballeor - Unidad de tipo Caballero a la cual se le quiere curar el caballo. 
	 * @return Cura lista para consumir.
	 */
	public Boolean consumir(Caballero caballero) {
		Boolean cura = this.getCuraParaLocura();
		this.setCuraParaLocura(false);
		return cura;
	}
		
}