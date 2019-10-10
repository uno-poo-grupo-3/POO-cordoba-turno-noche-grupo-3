package ordenarpersonas;
import java.io.IOException;
import java.util.LinkedList;



public class Main {
	public static void main (String args[]) throws IOException{
		String archivo= "C:\\personas.txt";
		LinkedList<Persona> personas = new LinkedList<Persona>();
		LinkedList<Persona> personas_ordenadas_dni = new LinkedList<Persona>();
		LinkedList<Persona> personas_mayores = new LinkedList<Persona>();
		personas=Persona.getPersonas(archivo);
		personas_ordenadas_dni= Persona.getPersonasOrdenadasPorDni(personas);
		personas_mayores=Persona.getPersonasMayoresDeEdad(personas, 38);
		
	Persona.listarPersonas(personas_ordenadas_dni, "C:\\Users\\Lucas\\Prueba\\personasDni.txt");
	Persona.listarPersonas(personas_mayores,"C:\\Users\\Lucas\\Prueba\\personasMayores.txt");
	
	}
	
	
}
	
	
