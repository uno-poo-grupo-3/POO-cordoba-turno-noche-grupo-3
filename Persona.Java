package ordenarpersonas;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public class Persona implements Comparable<Persona>{ /*La interfaz implementa un metodo que permite ordenar la lista con 
													   una logica propia*/
	private String dni="", nombre="", edad="";         
	
	public Persona(String dni, String nombre, String edad){ /*El constructor recibe
	 														los datos en forma de string*/
		this.setDni(dni);
		this.setNombre(nombre);
		this.setEdad(edad);
	}
	
	
	static public LinkedList<Persona> getPersonas(String archivo) throws IOException {
		LinkedList<Persona> personas = new LinkedList<Persona>();
		BufferedReader bf = new BufferedReader (new FileReader  (archivo));
		String linea="";
		String[] dni_nombre_edad;
		while((linea=bf.readLine())!=null) { /*bf lee cada linea y la almacena en cada ciclo en el String linea*/
			dni_nombre_edad = linea.split(" "); /*La linea leida del .txt es dividida por el parametro " " y cada palabra es almacenada en un espacio del array dni_nombre_edad  */
			personas.add(new Persona (dni_nombre_edad[0],dni_nombre_edad[1],dni_nombre_edad[2])); /*Los parametros son pasados al constructor segun el espacio del array que corresponda*/
		}
		bf.close();
		return personas;
	}

	
	static public LinkedList<Persona> getPersonasOrdenadasPorDni(LinkedList<Persona> personas){
		LinkedList<Persona> personas_ordenadas_dni = new LinkedList<Persona>();
		for(Persona i: personas) {
			personas_ordenadas_dni.push(i); /*personas es ciclado y se almacena cada Persona en personas_ordenadas_dni */
		}
		
		Collections.sort(personas_ordenadas_dni); /*Ordena la lista con el criterio del metodo sobreescrito compareTo()*/
		return personas_ordenadas_dni;
	}
	
	static public LinkedList<Persona> getPersonasMayoresDeEdad(LinkedList<Persona> personas, int edad){
		LinkedList<Persona> personas_mayores = new LinkedList<Persona>();
		for(Persona i: personas) {
			if(Integer.parseInt(i.getEdad())>=edad) { /*La edad String es convertida a int para poder compararla con el parametro edad recibido*/
				personas_mayores.push(i);
			}
		}
		return personas_mayores;
	}
	
	static public void listarPersonas(LinkedList<Persona> lista,String nombre_archivo) throws IOException {
		FileWriter fw=new FileWriter(nombre_archivo);
		BufferedWriter bw=new BufferedWriter(fw);         
		for(Persona i: lista) {
			bw.write(i.toString());  
			bw.newLine();
		}
		bw.close();
	}
	protected String getDni() {
		return dni;
	}
	protected void setDni(String dni) {
		this.dni = dni;
	}
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getEdad() {
		return edad;
	}
	protected void setEdad(String edad) {
		this.edad = edad;
	}




	@Override
	public String toString() {
		return dni +";" + nombre +";"  + edad;
	}


	@Override
	public int compareTo(Persona persona) {
		if(Integer.parseInt(this.dni)==Integer.parseInt(persona.getDni())) {  /*Los dni愀 Strings son convertidos a int para poder compararlos y ordenarlos*/
		return 0;
		}else if(Integer.parseInt(this.dni)>Integer.parseInt(persona.getDni())) {
			return 1;
		}else {
			return -1;
		}
	}




	
}
