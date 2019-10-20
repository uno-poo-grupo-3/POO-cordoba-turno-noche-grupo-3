package juegodeestrategia;

public class Arquero extends Unidades {
	private int carcaj=0,pociones=0;
	
		public Arquero() {
			super(5,50);
			this.carcaj=20;
			this.pociones=0;
		}

		
		public void recargar() { //recibe item? parametro?
			//recargo carcaj
		}
		
		public void atacar(int valorAtaque) {
			//ataco
		}
		
		public void mover(int x, int y) {
			//me muevo
		}
		
		public void usarItem(Object e) {
			//uso item
		}
		
		
		
		
		
		protected int getCarcaj() {
			return carcaj;
		}

		protected void setCarcaj(int carcaj) {
			this.carcaj = carcaj;
		}

		@Override
		public String toString() {
			return "Arquero [pociones="+pociones+", ataque=" + getAtaque() + ", salud=" + getSalud() +", carcaj=" + carcaj + "]";
		}
}
