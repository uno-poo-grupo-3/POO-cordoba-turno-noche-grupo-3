package sube;

public class Main {

	public static void main(String[] args) {
		Sube sube = new Sube(50,1,3,true);
		Sube sube1 = new Sube(68,2,2,false);
		Sube sube2 = new Sube(108,3,1,true);
		Sube sube3 = new Sube(108,3,1,true);
		
		System.out.println(sube.getValorPorTramo(1,2));
		System.out.println(sube1.getValorPorTramo(1,2));
		System.out.println(sube2.getValorPorTramo(1,2));
		System.out.println(sube3.getValorPorTramo(1,2));
		
	}

}