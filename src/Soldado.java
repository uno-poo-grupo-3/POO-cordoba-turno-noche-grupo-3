package juegodeestrategia;

public class Soldado extends Unidades {
	private int energia=0,pociones=0; //ver si cuerpo a cuerpo es distancia 0 o 1
	public Soldado() {
		super(10,200);
		this.energia=100;
		this.pociones=0;
		
	}
	
	public void restaurarEnergia() {
		//si tengo pocion de agua, recupero energia
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
	
	
	
	
	
	
	
	
	
	protected int getEnergia() {
		return energia;
	}
	protected void setEnergia(int energia) {
		this.energia = energia;
	}
	
	protected int getPociones() {
		return pociones;
	}
	protected void setPociones(int pociones) {
		this.pociones = pociones;
	}
	@Override
	public String toString() {
		return "Soldado [pociones=" + pociones + ", ataque=" + getAtaque()
				+ ", salud=" + getSalud() + ", energia=" + energia + "]";
	}
	
	
	


}
	