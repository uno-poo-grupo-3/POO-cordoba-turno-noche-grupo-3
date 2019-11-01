package juegoEstrategia;

import java.util.ArrayList;
import punto.Punto;

/**
 * 
 * Esta clase representa a la unidad Arquero.
 * 
 * @verion 1.0
 * @author Juan Picasso
 * @author Agustin Gonzalez
 * @author Lucas Fernandez
 *
 */
public class Unidad {
	
	private String nombre;
	private Integer salud;
	private Integer daño;
	private Integer distanciaAtaqueMin;
	private Integer distanciaAtaqueMax;
	private ArrayList<Item> inventario;
	private Punto posicion;
	
	public Unidad(String nombre, Integer salud, Integer daño, Integer distanciaAtaqueMin, Integer distanciaAtaqueMax, Punto posicion) {
		this.setNombre(nombre);
		this.setSalud(salud);
		this.setDaño(daño);
		this.setDistanciaAtaqueMin(distanciaAtaqueMin);
		this.setDistanciaAtaqueMax(distanciaAtaqueMax);
		this.setInventario(new ArrayList<Item>());
		this.setPosicion(posicion);
	}
	
	public Unidad(String nombre, Integer salud, Integer daño, Integer distanciaAtaqueMin, Integer distanciaAtaqueMax, ArrayList<Item> inventario, Punto posicion) {
		this(nombre, salud, daño, distanciaAtaqueMin, distanciaAtaqueMax, posicion);
		this.setInventario(inventario);
	}
	
	/**
	 * Se agrega un item al inventario.
	 * @param item - El cual es agregado al inventario.
	 */
	public void agregarItem(Item item) {
		this.getInventario().add(item);
	}

	protected ArrayList<Item> getInventario() {
		return inventario;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setDaño(Integer daño) {
		this.daño = daño;
	}

	private void setDistanciaAtaqueMax(Integer distanciaAtaqueMax) {
		this.distanciaAtaqueMax = distanciaAtaqueMax;
	}
	
	private void setDistanciaAtaqueMin(Integer distanciaAtaqueMin) {
		this.distanciaAtaqueMin = distanciaAtaqueMin;
	}
	
	private Integer getDistanciaAtaqueMax() {
		return this.distanciaAtaqueMax;
	}
	
	private Integer getDistanciaAtaqueMin() {
		return this.distanciaAtaqueMin;
	}

	private void setInventario(ArrayList<Item> inventario) {
		this.inventario = inventario;
	}

	/**
	 * Ataque básico de una unidad
	 * 
	 * @param unidad - La unidad enemiga a la cual queremos atacar.
	 * @return Salud restante de la unidad enemiga.
	 * @throws DistanciaInvalidaParaAtacarException cuando la distancia del enemigo no esta dentro del rango permitido de ataque.
	 */
	public Integer atacar(Unidad enemigo) throws NoSePuedeAtacarException  {
		Boolean tieneAlcanceParaAtacar = this.distanciaPermitida(enemigo);
		if(!tieneAlcanceParaAtacar) {
			throw new DistanciaInvalidaParaAtacarException("No tengo alcance");
		}
		enemigo.setSalud(enemigo.getSalud() - this.getDaño());
		System.out.println(
				this.getNombre() +
				" ataco a " +
				enemigo.getNombre() +
				" causandole " + this.getDaño() +
				" puntos de daño y dejandolo con " +
				enemigo.getSalud() +
				" puntos de vida."
			);
		return enemigo.getSalud();
	}
	
	/**
	 * Se verifica si el enemigo esta dentro del rango de ataque usando el calculo de distancia entre puntos.
	 * 
	 * @param enemigo - El cual es usado para obtener la posicion.
	 * @return Si el enemigo esta o no dentro de nuestro rando de ataque.
	 */
	public Boolean distanciaPermitida(Unidad enemigo) {
		Punto posicionEnemigo = enemigo.getPosicion();
		double distancia = this.getPosicion().calcularDistancia(posicionEnemigo);
		if (distancia >= this.getDistanciaAtaqueMin() && distancia <= this.getDistanciaAtaqueMax()) {
			return true;
		}
		return false;
	}
	
	public Integer getSalud() {
		return this.salud;
	}
	
	protected void setSalud(Integer salud) {
		this.salud = salud;
	}
	
	private Integer getDaño() {
		return this.daño;
	}
	
	protected String getNombre() {
		return this.nombre;
	}
	
	private void setPosicion(Punto posicion) {
		this.posicion = posicion;
	}
	
	public Punto getPosicion() {
		return this.posicion;
	}
	
	@Override
	public String toString() {
		return "Unidad [nombre=" + this.getNombre() + ", salud=" + this.getSalud() +  "]";
	}
		
}