package leerArchivoPersonas;

public class Persona {
	
	private Integer DNI;
	private String nombre;
	private Integer edad;
	
	public Persona(Integer DNI, String nombre, Integer edad) {
		this.setDNI(DNI);
		this.setNombre(nombre);
		this.setEdad(edad);
	}

	private void setDNI(Integer dNI) {
		this.DNI = dNI;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	public Integer getDNI() {
		return DNI;
	}

	private String getNombre() {
		return nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public String toString() {
		return  this.getDNI() + 
				";" + this.getNombre() + 
				";" + this.getEdad();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (DNI == null) {
			if (other.getDNI() != null)
				return false;
		} else if (!this.getDNI().equals(other.getDNI()))
			return false;
	
		return true;
	}
	
	
	
}
