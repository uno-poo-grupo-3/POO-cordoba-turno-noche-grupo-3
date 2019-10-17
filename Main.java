package cuil;


import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		int dni=42571761;
		String archivo= "C:\\Users\\Lucas\\Prueba\\cuils.txt";
		String tipo= "f";
		Cuil.calcularCuil(tipo, dni);
		Cuil.comprobarCodigoDeVerificacion(archivo);
	}
}
