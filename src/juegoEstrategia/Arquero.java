package juegoEstrategia;

public class Arquero extends Unidad {
	
	private Integer cantidadFlechas;
	private Integer flechasRepuesto;

	public Arquero(String nombre) {
		super(nombre, 50, 5, 5);
		this.setCantidadFlechas(20);
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
		return this.cantidadFlechas;
	}
	
	private void setCantidadFlechas(Integer cantidadFlechas) {
		this.cantidadFlechas = cantidadFlechas;
	}
	
	private Boolean tengoFlechas() {
		return this.getCantidadFlechas() > 0;
	}
	
	private void consumirFlecha() {
		this.setCantidadFlechas(this.getCantidadFlechas()-1);
	}
	
	public void setFlechasRepuesto(Integer flechasRepuesto) {
		this.flechasRepuesto = flechasRepuesto;
	}
	
	private Integer getFlechasRepuesto() {
		return this.flechasRepuesto;
	}
	
	public void recargarFlechas() {
		System.out.println(this.getNombre() + " recargó " + this.getFlechasRepuesto() + " flechas.");
		Integer flechasRepuesto = this.getFlechasRepuesto();
		this.setCantidadFlechas(flechasRepuesto);
		this.setFlechasRepuesto(0);
	}
		
}