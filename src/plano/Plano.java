package plano;

import java.util.ArrayList;
import punto.Punto;

public class Plano {
	
	public static void main(String[] args) {
		ArrayList<Punto> puntos = new ArrayList<Punto>();
		puntos.add(new Punto(1,2));
		puntos.add(new Punto(3,4));
		new Plano();
	}
	
	private ArrayList<Punto> puntos;
	
	public Plano(ArrayList<Punto> puntos) {
		this.setPuntos(puntos);
	}
	
	public Plano() {
		this(new ArrayList<Punto>());
	}
	
	public void agregarPunto(Punto punto) {
		this.getPuntos().add(punto);
	}
	
	public double getCantPuntos(Cuadrante cuadrante) {
		int contador = 0;
		for(int i = 0; i < this.getPuntos().size(); i++) {
			this.getPuntos().get(i).getCuadrante();
		}
		return contador;
	}

	public ArrayList<Punto> getPuntos() {
		return puntos;
	}

	public void setPuntos(ArrayList<Punto> puntos) {
		this.puntos = puntos;
	}
	
}
