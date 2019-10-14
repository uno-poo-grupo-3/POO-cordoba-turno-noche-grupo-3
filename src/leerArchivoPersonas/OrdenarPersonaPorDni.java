package leerArchivoPersonas;

import java.util.Comparator;

public class OrdenarPersonaPorDni implements Comparator<Persona> {
	
	public int compare(Persona p1, Persona p2) {
		return p1.getDNI() - p2.getDNI();
	}
	
}
