package juegodeestrategia;

public class CampoDeBatalla {
	public static void main(String args[]) {
		
		

	}




	public static void pelea (Unidades unidad1, Unidades unidad2) { //se le pasan dos unidades para que peleen
		int turno=2;
		for(;unidad1.getSalud()>0 && unidad2.getSalud()>0;) { //las unidades pelean hasta que una muera o huya
			if(turno%2==0) {
				if(unidad1 instanceof Soldado) { //la dispocision de los if instanceof permite que las unidades luchen entre si sin importar de que tipo sean o quien ataque primero
					if(((Soldado) unidad1).getEnergia()>=40) { //si el soldado dispone de energia puede atacar
						System.out.println(unidad1.getName()+" Ataca a "+unidad2.getName());
						unidad1.atacar(unidad2);
					}else if(((Soldado) unidad1).getPociones()>0) {//si el soldado no tiene energia, intentara tomar una pocion
						((Soldado) unidad1).restaurarEnergia();
						System.out.println(unidad1.getName()+" ha bebido una pocion y restaurado su energia");
					}else if(((Soldado) unidad1).getEnergia()<40) {
						System.out.println("El soldado no tiene energia suficiente, ha huido");//de no tener energia ni pociones el soldado huira
						break;

					}
				}
				if(unidad1 instanceof Arquero) {
					if(((Arquero) unidad1).getCarcaj()>0) {//si el arquero tiene flechas puede atacar
						System.out.println(unidad1.getName()+" Ataca a "+unidad2.getName());
						unidad1.atacar(unidad2);
						((Arquero) unidad1).setCarcaj(((Arquero) unidad1).getCarcaj()-1);//por ataque se le resta una flecha al carcaj
					}else if(((Arquero) unidad1).getPaquete_flechas()>0) {//si el carcaj esta vacio pero el arquero tiene paquetes de flechas puede recargarlo
						((Arquero) unidad1).recargar();
					}else if (((Arquero) unidad1).getCarcaj()<=0) {//si el arquero no tiene paquetes de flechas huira
						System.out.println("El arquero no tiene mas flechas, huyo");
						break;
					}
				}
				if(unidad1 instanceof Lancero) {
					System.out.println(unidad1.getName()+" Ataca a "+unidad2.getName());
					unidad1.atacar(unidad2);
				}
				if(unidad1 instanceof Caballero) {
					if(((Caballero) unidad1).getRebeldia_caballo()<3) {//si el caballo no esta rebelde, el caballero puede atacar
						System.out.println(unidad1.getName()+" Ataca a "+unidad2.getName());
						unidad1.atacar(unidad2);
						((Caballero) unidad1).setCaballo(((Caballero) unidad1).getRebeldia_caballo()+1);//por cada ataque rebeldia_caballo aumenta en uno
					}else if(((Caballero) unidad1).getPociones()>0) {//si el caballero dispone de pociones, calmara al caballo
						((Caballero) unidad1).calmarCaballo();
					}else if(((Caballero) unidad1).getRebeldia_caballo()>=3) {//si el caballero no tiene pociones y su caballo esta rebelde, este huira
						System.out.println("El caballero a huido, su caballo se rebelo");
						break;
					}
				}
			}else{//fin del if turno unidad 1, los siguientes if's imitan a los primeros contemplando el orden de las unidades (unidad1, unidad2; unidad2,unidad1)
				if(unidad2 instanceof Soldado) {
					if(((Soldado) unidad2).getEnergia()>=40) {
						System.out.println(unidad2.getName()+" Ataca a "+unidad1.getName());
						unidad2.atacar(unidad1);;
					}else if(((Soldado) unidad2).getPociones()>0) {
						((Soldado) unidad2).restaurarEnergia();
						System.out.println(unidad1.getName()+" ha bebido una pocion y restaurado su energia");
					}else if(((Soldado) unidad2).getEnergia()<40) {
						System.out.println("El soldado no tiene energia suficiente, ha huido");
						break;
					}
				}
				if(unidad2 instanceof Arquero) {
					if(((Arquero) unidad2).getCarcaj()>0) {
						System.out.println(unidad2.getName()+" Ataca a "+unidad1.getName());
						unidad2.atacar(unidad1);
						((Arquero) unidad2).setCarcaj(((Arquero) unidad2).getCarcaj()-1);
					}else if(((Arquero) unidad2).getPaquete_flechas()>0) {
						((Arquero) unidad2).recargar();
					}else if(((Arquero) unidad2).getCarcaj()<=0) {
						System.out.println("El arquero no tiene mas flechas, huyo");
						break;
					}
				}
				if(unidad2 instanceof Lancero) {
					System.out.println(unidad2.getName()+" Ataca a "+unidad1.getName());
					unidad2.atacar(unidad1);
				}
				if(unidad2 instanceof Caballero) {
					if(((Caballero) unidad2).getRebeldia_caballo()<3) {
						System.out.println(unidad2.getName()+" Ataca a "+unidad1.getName());
						unidad2.atacar(unidad1);
						((Caballero) unidad2).setCaballo(((Caballero) unidad2).getRebeldia_caballo()+1);
					}else if(((Caballero) unidad2).getPociones()>0) {
						((Caballero) unidad2).calmarCaballo();
					}else if(((Caballero) unidad2).getRebeldia_caballo()>=3) {
						System.out.println("El caballero ah huido, su caballo se rebelo");
						break;
					}
				}
			}

			System.out.println("---------------------------------------------------"); //los siguientes if's muestran la informacion de cada unidad luego de cada ataque
			if(unidad1 instanceof Soldado) {
				System.out.println(unidad1.getName()+" Salud: "+unidad1.getSalud()+" Energia: "+((Soldado) unidad1).getEnergia());
				System.out.println();
			}if(unidad2 instanceof Soldado) {
				System.out.println(unidad2.getName()+" Salud: "+unidad2.getSalud()+" Energia: "+((Soldado) unidad2).getEnergia());
				System.out.println();
			}if(unidad1 instanceof Arquero) {
				System.out.println(unidad1.getName()+" Salud: "+unidad1.getSalud()+" Carcaj: "+((Arquero) unidad1).getCarcaj()+" flechas");
				System.out.println();
			}if(unidad2 instanceof Arquero) {
				System.out.println(unidad2.getName()+" Salud: "+unidad2.getSalud()+" Carcaj: "+((Arquero) unidad2).getCarcaj()+" flechas");
				System.out.println();
			}if(unidad1 instanceof Lancero) {
				System.out.println(unidad1.getName()+" Salud: "+unidad1.getSalud());
				System.out.println();
			}if(unidad2 instanceof Lancero) {
				System.out.println(unidad2.getName()+" Salud: "+unidad2.getSalud());
				System.out.println();
			}if(unidad1 instanceof Caballero) {
				System.out.println(unidad1.getName()+" Salud: "+unidad1.getSalud()+" Rebeldia del caballo: "+((Caballero) unidad1).getRebeldia_caballo());
				System.out.println();
			}if(unidad2 instanceof Caballero) {
				System.out.println(unidad2.getName()+" Salud: "+unidad2.getSalud()+" Rebeldia del caballo: "+((Caballero) unidad2).getRebeldia_caballo());
				System.out.println();
			}

			System.out.println("---------------------------------------------------");
			turno++;
		} //fin del for




	} //fin del metodo
} //fin de la clase
