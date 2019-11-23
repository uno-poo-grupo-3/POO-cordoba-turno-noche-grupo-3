package figura;

public class Rectangulo implements Figura {
	
	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		this.setBase(base);
		this.setAltura(altura);
	}

	public double area() {
		return this.getBase() * this.getAltura();
	}
	
	private double getBase() {
		return base;
	}

	private double getAltura() {
		return altura;
	}

	private void setBase(double base) {
		this.base = base;
	}

	private void setAltura(double altura) {
		this.altura = altura;
	}

}