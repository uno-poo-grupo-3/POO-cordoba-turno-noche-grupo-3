package juegodeestrategia;

public class Arquero extends Unidades {
	private int carcaj=0,paquete_flechas=0;
	
		public Arquero() {
			super(5,50);
			this.carcaj=20;
			this.paquete_flechas=0;
		}

		
		public void recargar() { //recibe item? parametro?
			this.setCarcaj(this.getCarcaj()+6);
			this.setPaquete_flechas(this.getPaquete_flechas()-1);
		}
		
		public void atacar(Unidades unidad) {
			unidad.setSalud(unidad.getSalud()-this.getAtaque());
		}
		
		public void mover(int x, int y) {
			//me muevo
		}
		
		public void usarItem(Object e) {
			//uso item
		}
		
		
		
		
		
		protected int getPaquete_flechas() {
			return paquete_flechas;
		}


		protected void setPaquete_flechas(int paquete_flechas) {
			this.paquete_flechas = paquete_flechas;
		}


		protected int getCarcaj() {
			return carcaj;
		}

		protected void setCarcaj(int carcaj) {
			this.carcaj = carcaj;
		}

		@Override
		public String toString() {
			return "Arquero [paquete_flechas="+paquete_flechas+", ataque=" + getAtaque() + ", salud=" + getSalud() +", carcaj=" + carcaj + "]";
		}
		public String getName() {
			return "Arquero";
		}
}
