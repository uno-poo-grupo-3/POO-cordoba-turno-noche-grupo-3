package juegodeestrategia;

public class Lancero extends Unidades {
	public Lancero() {
		super(25,150);
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
	
	
	@Override
	public String toString() {
		return "Lancero [ataque=" + getAtaque() + ", salud=" + getSalud() + "]";
	}
	
}
