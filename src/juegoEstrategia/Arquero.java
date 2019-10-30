package juegoEstrategia;

public class Arquero extends Unidad {
	
	private Integer carcajConFlechas;

	public Arquero(String nombre) {
		super(nombre, 50, 5, 5);
		this.setCantidadFlechas(2);
	}

	@Override
	public Integer atacar(Unidad unidad) throws NoSePuedeAtacarException {
		if(!this.tengoFlechas()) {
			throw new SinFlechasException("No tengo flechas para atacar.");
		}
		this.consumirFlecha();
		return super.atacar(unidad);
	}
	
	private Integer getCantidadFlechas() {
		return this.carcajConFlechas;
	}
	
	private void setCantidadFlechas(Integer cantidadFlechas) {
		this.carcajConFlechas = cantidadFlechas;
	}
	
	private Boolean tengoFlechas() {
		return this.getCantidadFlechas() > 0;
	}
	
	private void consumirFlecha() {
		this.setCantidadFlechas(this.getCantidadFlechas()-1);
	}
	
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