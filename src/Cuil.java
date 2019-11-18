package cuil;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class Cuil {
	private String tipo="",cuil="";
	private int dni=0;


	public Cuil(String tipo, int dni){
		this.tipo=tipo;
		this.dni=dni;
		this.cuil=Cuil.calcularCuil(this.getTipo(), this.getDni());

	}

	public int getDni() {
		return this.dni;
	}
	public String getTipo() {
		return this.tipo;
	}
	public String getCuil() {
		return this.cuil;
	}

	@Override
	public String toString() {
		return "Cuil [tipo=" + tipo + ", cuil=" + cuil + ", dni=" + dni + "]";
	}

	
	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuil other = (Cuil) obj;
		if (cuil == null) {
			if (other.cuil != null)
				return false;
		} else if (!cuil.equals(other.cuil))
			return false;
		return true;
	}

	public static void main(String[] args) throws IOException {
		int dni=18003006;
		String archivo= "C:\\Users\\Lucas\\Prueba\\cuils.txt";
		String tipo= "f";
		Cuil c1 = new Cuil(tipo,dni);
		Cuil c2 = new Cuil("m",42571761);
		Cuil c3 = new Cuil("m",42571761);
		System.out.println(c1);
		System.out.println(Cuil.calcularCuil(tipo, dni));
		Cuil.comprobarCodigoDeVerificacion(archivo);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c1.equals(c3));
		System.out.println(c2.equals(c3));
	}

	static public String calcularCuil(String tipo, int dni) {
		int copia_dni=dni; /* se hace una copia del dni ya que luego el parametro recibido quedara vacio*/
		int sexo_copia=0;
		int[] formula = {5,4,3,2,7,6,5,4,3,2};
		int total=0;
		int codigo_verificador=0;
		int sexo=0;
		int j=0;
		ArrayList<Integer> lista = new ArrayList<Integer>(); /* creo una lista para almacenar cada digito individualmente*/
		switch(tipo){ /*segun el tipo (f o m) a la variable sexo se le asigna el valor correspondiente*/
		case "m":
			sexo=20;
			break;

		case "f":
			sexo= 27;
			break;

		}
		while(dni>0) {
			lista.add(0,dni%10); /*cada digito es arrancado individualmente y agregado en orden a la lista*/
			dni=dni/10;
		}
		sexo_copia=sexo; /*los valores de sexo seran arrancados por lo que se hace una copia*/
		lista.add(0,sexo%10);
		sexo=sexo/10;
		lista.add(0,sexo%10); /*se agrega delante del dni el sexo*/
		for(Integer i: lista) {
			total+=i*formula[j]; /*se multiplica cada digito (sexo y dni) por cada numero de la formula*/
			j++;

		}
		codigo_verificador=total/11;
		codigo_verificador=total-(codigo_verificador*11);  /*se calcula el codigo verificador*/
		codigo_verificador=11-codigo_verificador;

		return Integer.toString(sexo_copia)+Integer.toString(copia_dni)+Integer.toString(codigo_verificador);/*se convierte los valores copiados y calculados en string y son retornados*/

	}

	static public void comprobarCodigoDeVerificacion(String archivo) throws IOException {
		File file = new File(archivo);
		BufferedReader bf = new BufferedReader(new FileReader(file));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Lucas\\Prueba\\cuils_revisados.txt",true));
		String linea="";
		String linea_comparacion="";
		String tipo_string="";
		String dni_string="";
		int dni_int=0;
		String sexo="";
		while((linea=bf.readLine())!=null) {;
		linea_comparacion=linea;	//hago una copia del cuil leido
		tipo_string=linea.substring(0,2);//substraigo los dos primeros digitos (el tipo/sexo)
		dni_string=linea.substring(2,10);//substraigo el dni
		dni_int=Integer.parseInt(dni_string);//convierto el dni string a int
		if(tipo_string.contentEquals("20")) {
			sexo="m";
		}else {
			sexo="f";
		}

		if(linea_comparacion.contentEquals(Cuil.calcularCuil(sexo, dni_int))==false) { //llamo al metodo con los parametros substraidos de cada cuil el cual devuelve el cuil correcto y lo comparo con cada uno del .txt
			bw.write(linea_comparacion+"/////Incorrecto, deberia ser:"+Cuil.calcularCuil(sexo, dni_int));
			bw.newLine();

		}else {
			bw.write(linea_comparacion+"/////correcto/////");
			bw.newLine();
		}

		}
		bw.close();
		bf.close();
	}
}




