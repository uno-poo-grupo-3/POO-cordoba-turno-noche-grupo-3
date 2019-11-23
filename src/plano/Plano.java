package plano;

import java.util.ArrayList;
import punto.Punto;


public class Plano {

	
	private ArrayList<Punto> puntos;
	
	public static void main(String[] args) {
		ArrayList<Punto> puntos = new ArrayList<Punto>();
		puntos.add(new Punto(1,2));
		puntos.add(new Punto(-3,-4));
		puntos.add(new Punto(-1,1));
		puntos.add(new Punto(5,-1));
		Plano plano = new Plano(puntos);
		
		for(Punto p : plano.getPuntos()) {
			Cuadrante cuadrante = p.getCuadrante();
			System.out.println(cuadrante);
		}
		
	}
	
	public Plano(ArrayList<Punto> puntos) {
		this.setPuntos(puntos);
	}
	
	public Plano() {
		this(new ArrayList<Punto>());
	}
	
	public void agregarPunto(Punto punto) {
		this.getPuntos().add(punto);
	}
	

	public ArrayList<Punto> getPuntos() {
		return puntos;
	}

	public void setPuntos(ArrayList<Punto> puntos) {
		this.puntos = puntos;
	}
	
}
