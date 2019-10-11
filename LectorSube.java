package sube;

public abstract class LectorSube {
	private int tramo=0; //mepa que no va
	private  float valor;
	private int cantidadDePasada;
	private boolean esBeneficiarioTarifaSocial;

	public LectorSube(float saldo,int  tramo, int cantidadDePasada, boolean esBeneficiarioTarifaSocial) {
		setCantidadDePasada(cantidadDePasada);
		setEsBeneficiarioTarifaSocial(esBeneficiarioTarifaSocial);
		setSaldo(saldo);
		setTramo(tramo);
		setValor(valor);
	}
	private void setValor(float valor) {
		System.out.println("pase");
		if(esBeneficiarioTarifaSocial) {
			new TarifaSocial(valor);
		}
			
		this.valor = (cantidadDePasada!=0)?getValorPorTramo(tramo,cantidadDePasada,esBeneficiarioTarifaSocial):valor;
		System.out.println("soy valor" + this.valor);
	}
	public float getValor() {
		return valor;
	}
	private void setCantidadDePasada(int cantidadDePasada) {
		System.out.println("pase1");
		this.cantidadDePasada = cantidadDePasada;
		System.out.println("Soy cantidad de pasada " + this.cantidadDePasada);
	}
	private void setEsBeneficiarioTarifaSocial(boolean esBeneficiarioTarifaSocial) {
		System.out.println("pase2");
		this.esBeneficiarioTarifaSocial = esBeneficiarioTarifaSocial;
		System.out.println("soy tarifa social" + this.esBeneficiarioTarifaSocial);
	}
	public void setTramo(int tramo) {
		System.out.println("pase3");
		this.tramo = tramo;
		System.out.println("soy tramo" + this.tramo);
	}
	public float getValorPorTramo(int tramo,int cantidadDePasada,boolean esBeneficiarioTarifaSocial) {
		float valorPorTramo = 0;
		switch(tramo) {
		case 1:
			valorPorTramo= 19/cantidadDePasada; 
					
			break;
		case 2:
			valorPorTramo= 21/cantidadDePasada;
			break;
		case 3:
			valorPorTramo= 23/cantidadDePasada;
			break;
		}
		if (esBeneficiarioTarifaSocial) {
			valorPorTramo =valorPorTramo*100/60;
		}
		return valorPorTramo;
	}
	public void setSaldo(float saldo) {
		System.out.println("pase4");
	}
	

}
