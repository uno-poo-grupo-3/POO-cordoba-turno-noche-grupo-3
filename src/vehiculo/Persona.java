package vehiculo;

import java.util.Iterator;

public class Persona {

	private String nombre;

	public Persona(String nombre) {
		this.setNombre(nombre);
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private String getNombre() {
		return nombre;
	}

	public String toString() {
		return  this.getNombre(); 
	}

	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return null;
	}	
}