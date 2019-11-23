package figura;

public class Cuadrado implements Figura {
	
	private double lado;
	
	public Cuadrado(double lado) {
		this.setLado(lado);
	}
	
	public double area() {
		return Math.pow(this.getLado(), 2);
	}

	private double getLado() {
		return lado;
	}

	private void setLado(double lado) {
		this.lado = lado;
	}
	
}