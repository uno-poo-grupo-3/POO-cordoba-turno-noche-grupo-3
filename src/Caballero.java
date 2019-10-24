package juegodeestrategia;

public class Caballero extends Unidades {
	private int pociones=0,rebeldia_caballo=0;
	public Caballero() {
		super(50,200);
		this.pociones=0;
		this.rebeldia_caballo=0;
	}
	
	
	public void calmarCaballo() { //recibe item el metodo? o del objeto?
		this.setCaballo(0);
		this.setPociones(this.getPociones()-1);
	}
	
	
	
	public void atacar(Unidades unidad) {
		unidad.setSalud(unidad.getSalud()-this.getAtaque());
	}
	
	public void mover(int x, int y) {
		//me muevo
	}
	
	public void usarItem(Object e) {
		//uso item
	}
	
	
	
	
	
	
	protected int getPociones() {
		return pociones;
	}
	protected void setPociones(int pociones) {
		this.pociones = pociones;
	}
	
	protected int getRebeldia_caballo() {
		return rebeldia_caballo;
	}
	protected void setCaballo(int rebeldia_caballo) {
		this.rebeldia_caballo = rebeldia_caballo;
	}
	@Override
	public String toString() {
		return "Caballero [pociones=" + getPociones() + ", ataque=" + getAtaque()
				+ ", salud=" + getSalud() + "rebeldia caballo: "+rebeldia_caballo+"]";
	}
	
	public String getName() {
		return "Caballero";
	}
}
