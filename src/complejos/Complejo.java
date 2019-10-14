package complejos;

import java.util.Arrays;
import java.util.Collections;

public class Complejo implements Comparable<Complejo> {
	
	private double real;
	private double imaginario;
	
	public Complejo() {
		this.setImaginario(0);
		this.setReal(0);
	}
	
	public Complejo(double real, double imaginario) {
		this.real = real;
		this.imaginario = imaginario;
	}
	
	@Override
	public String toString() {
		return "Complejo [real=" + real + ", imaginario=" + imaginario + "]";
	}

	public Complejo sumar(Complejo c1) {
		double real = c1.getReal() + this.getReal();
		double imaginario = c1.getImaginario() + this.getImaginario();
		return new Complejo(real, imaginario);
	}
	
	public double modulo() {
		return(Math.sqrt(Math.pow(this.getReal(), 2) + Math.pow(this.getImaginario(), 2)));
	}
	
	public double getReal() {
		return real;
	}
	
	public void setReal(double real) {
		this.real = real;
	}
	
	public double getImaginario() {
		return imaginario;
	}
	
	public void setImaginario(double imaginario) {
		this.imaginario = imaginario;
	}


	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complejo other = (Complejo) obj;
		if (Double.doubleToLongBits(imaginario) != Double.doubleToLongBits(other.imaginario))
			return false;
		if (Double.doubleToLongBits(real) != Double.doubleToLongBits(other.real))
			return false;
		return true;
	}
	
	public int compareTo(Complejo c1) {
		if (this.modulo() < c1.modulo())
			return -1;
		else if(this.modulo() > c1.modulo())
			return 1;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		Complejo[] vectorDeComplejos = {
				new Complejo(22,6),
				new Complejo(4,8),
				new Complejo(15,3),
				new Complejo(34, 1),
				new Complejo(2,2),
		};
		
		System.out.println("Desordenado");
		for(int i=0; i < vectorDeComplejos.length; i++) {
			System.out.println(vectorDeComplejos[i]);
		}
		
		Arrays.sort(vectorDeComplejos);
		
		System.out.println("Ordenado");
		for(int i=0; i < vectorDeComplejos.length; i++) {
			System.out.println(vectorDeComplejos[i]);
		}
		
		
	}
	
}
