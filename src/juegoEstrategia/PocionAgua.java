package juegoEstrategia;

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
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() == obj.getClass())
			return true;
		return true;
	}

	public Integer consumir(Soldado soldado) {
		Integer energia = this.getEnergia();
		this.setEnergia(0);
		return energia;
	}
	
	public Boolean consumir(Caballero caballero) {
		Boolean cura = this.getCuraParaLocura();
		this.setCuraParaLocura(false);
		return cura;
	}
		
}