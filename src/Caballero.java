package juegodeestrategia;

public class Caballero extends Unidades {
	private int pociones=0,caballo=0;
	public Caballero() {
		super(50,200);
		this.pociones=0;
		this.caballo=0;
	}
	
	
	public void calmarCaballo() { //recibe item el metodo? o del objeto?
		//calmo al caballo
	}
	
	
	
	public void atacar(int valorAtaque) {
		//ataco
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
	
	protected int getCaballo() {
		return caballo;
	}
	protected void setCaballo(int caballo) {
		this.caballo = caballo;
	}
	@Override
	public String toString() {
		return "Caballero [pociones=" + getPociones() + ", ataque=" + getAtaque()
				+ ", salud=" + getSalud() + "]";
	}
}
