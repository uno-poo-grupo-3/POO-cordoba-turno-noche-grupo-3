package juegoEstrategia;

/**
 * 
 * Esta clase representa un item el cual puede ser guardado en un inventario.
 * 
 * @verion 1.0
 * @author Juan Picasso
 * @author Agustin Gonzalez
 * @author Lucas Fernandez
 *
 */
public class Item {
	
	/**
	 * Un item será igual a otro siempre y cuando sea la misma clase.
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() == obj.getClass())
			return true;
		return true;
	}
	
}