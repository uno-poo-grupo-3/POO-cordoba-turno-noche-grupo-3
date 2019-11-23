package figura;

public class Circulo implements Figura {
	
	private double radio;

	public Circulo(double radio) {
		this.setRadio(radio);
	}
	
	public double area() {
		return Math.PI * Math.pow(this.getRadio(), 2);
	}

	private double getRadio() {
		return radio;
	}

	private void setRadio(double radio) {
		this.radio = radio;
	}
	
}