package juegodeestrategia;

public class Unidades {
 private int ataque=0,salud=0;
 	public Unidades(int ataque,int salud) {
 		this.ataque=ataque;
 		this.salud=salud;
 	}

 	public void atacar(int valorAtaque) {} //ver si los metodos van a devolver algo
 	public void mover(int x, int y) {} //decidir si manejar el movimiento en int
 	public void usarItem(Object e) {}  //remplazar por la clase/interfaz item

	

	protected int getAtaque() {
		return ataque;
	}

	protected void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	protected int getSalud() {
		return salud;
	}

	protected void setSalud(int salud) {
		this.salud = salud;
	}
 	


}
