package figura;

import java.util.ArrayList;

public class TestInterface {

	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		figuras.add(new Cuadrado(4.5));
		figuras.add(new Circulo(6.4));
		figuras.add(new Rectangulo(2.4, 8.4));
		double totalArea = 0;
		for(Figura figura : figuras) {
			totalArea += figura.area();
		}
		System.out.println(totalArea);
	}

}
