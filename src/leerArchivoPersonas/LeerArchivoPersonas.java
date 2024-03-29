package leerArchivoPersonas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class LeerArchivoPersonas {
	
	public static void main(String[] args) {
		try {
			LinkedList<Persona> personas = LeerArchivoPersonas.getPersonas("/Users/juan/Downloads/personas.in");
			System.out.println(personas);
			LinkedList<Persona> personasOrdenadasPorDni = LeerArchivoPersonas.getPersonasOrdenadasPorDni(personas);
			System.out.println(personasOrdenadasPorDni);
			LeerArchivoPersonas.listarPersonas(personasOrdenadasPorDni, "personaOrdenadasPorDni.out");
			LinkedList<Persona> personasMayoresDe30 = LeerArchivoPersonas.getPersonasMayoresAEdad(personas, 30);
			System.out.println(personasMayoresDe30);
			LeerArchivoPersonas.listarPersonas(personasMayoresDe30, "personasMayores.out");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static LinkedList<Persona> getPersonas(String ruta) throws IOException {
		try(FileReader fileReader = new FileReader(ruta)) {
			BufferedReader buffer = new BufferedReader(fileReader);
			String linea = "";
			LinkedList<Persona> personas = new LinkedList<Persona>();
			while((linea = buffer.readLine()) != null) {
				String[] partes = linea.split(" ");
				personas.add(new Persona(
						Integer.parseInt(partes[0]), 
						partes[1], 
						Integer.parseInt(partes[2])
					));
			}
			return personas;
		} catch(IOException e) {
			throw e;
		}
	}
	
	public static LinkedList<Persona> getPersonasOrdenadasPorDni(LinkedList<Persona> personas) {
		LinkedList<Persona> personasOrdenadasPorDni = new LinkedList<Persona>(personas);
		Collections.sort(personasOrdenadasPorDni, new OrdenarPersonaPorDni());
		return personasOrdenadasPorDni;
	}
	
	public static LinkedList<Persona> getPersonasMayoresAEdad(LinkedList<Persona> personas, Integer edad) {
		LinkedList<Persona> copiaPersonas = new LinkedList<Persona>(personas);
		return copiaPersonas.stream()
				.filter(persona -> persona.getEdad() > edad)
				.collect(Collectors.toCollection(LinkedList::new));
	}
	
	public static void listarPersonas(LinkedList<Persona> personas, String archivoSalida) throws IOException {
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida))) {
				for(Persona persona : personas) {
					bw.write(persona.toString());
					bw.newLine();
				}
			} catch (IOException e) {
				throw e;
			}
		}
	
}
