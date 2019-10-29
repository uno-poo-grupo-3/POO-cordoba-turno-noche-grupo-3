package juegoEstrategia;

import java.util.ArrayList;

public class Unidad {
	
	private String nombre;
	private Integer salud;
	private Integer daño;
	private Integer distanciaAtaque;
	private ArrayList<Item> inventario;
	
	public Unidad(String nombre, Integer salud, Integer daño, Integer distanciaAtaque) {
		this.setNombre(nombre);
		this.setSalud(salud);
		this.setDaño(daño);
		this.setDistanciaAtaque(distanciaAtaque);
		this.setInventario(new ArrayList<Item>());
	}
	
	public Unidad(String nombre, Integer salud, Integer daño, Integer distanciaAtaque, ArrayList<Item> inventario) {
		this(nombre, salud, daño, distanciaAtaque);
		this.setInventario(inventario);
	}
	
	public void agregarItem(Item item) {
		this.getInventario().add(item);
	}
	
	private Integer getDistanciaAtaque() {
		return distanciaAtaque;
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

	private void setDistanciaAtaque(Integer distanciaAtaque) {
		this.distanciaAtaque = distanciaAtaque;
	}

	private void setInventario(ArrayList<Item> inventario) {
		this.inventario = inventario;
	}


	public Integer atacar(Unidad unidad) throws NoSePuedeAtacarException  {
		unidad.setSalud(unidad.getSalud() - this.getDaño());
		System.out.println(
				this.getNombre() +
				" ataco a " +
				unidad.getNombre() +
				" causandole " + this.getDaño() +
				" puntos de daño y dejandolo con " +
				unidad.getSalud() +
				" puntos de vida."
			);
		return unidad.getSalud();
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
	
	@Override
	public String toString() {
		return "Unidad [nombre=" + this.getNombre() + ", salud=" + this.getSalud() +  "]";
	}
		
}