package vehiculo;

public class Main {

	public static void main(String[] args) throws NoSePuedeCambiarChofer {
		// TODO Auto-generated method stub
		Persona ChoferMoto = new Persona("agustin");
		Persona ChoferColectivo = new Persona("agustin2");
		Persona AcompanianteMoto = new Persona("agustin3");
		Persona AcompanianteMoto2 = new Persona("agustin4");
		Persona PasajeroColectivo3= new Persona("agustin5");
		Persona PasajeroColectivo4= new Persona("agustin6");
		Persona PasajeroColectivo5= new Persona("agustin7");
		Persona PasajeroColectivo6= new Persona("agustin8");
		Moto Chofer = new Moto(500,ChoferMoto,AcompanianteMoto);
			Chofer.agregoPasajero(new Persona("elpepo"));
			Chofer.agregoPasajero(new Persona("elpep2o"));
			Chofer.cambioChofer(new Persona("el pepo 3"));
			Chofer.toString();
		Colectivo Chofer1 = new Colectivo(600,ChoferColectivo);
		 		  Chofer1.agregarPasajero(PasajeroColectivo3);
		 		  Chofer1.agregarPasajero(PasajeroColectivo4);
		 		  Chofer1.agregarPasajero(PasajeroColectivo5);
		 		  Chofer1.quitarPasajero(PasajeroColectivo4);
		 		 
	}

}
