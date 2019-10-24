package juegodeestrategia;

public class Lancero extends Unidades {
	public Lancero() {
		super(25,150);
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
	
	
	@Override
	public String toString() {
		return "Lancero [ataque=" + getAtaque() + ", salud=" + getSalud() + "]";
	}
	public String getName() {
		return "Lancero";
	}
}
