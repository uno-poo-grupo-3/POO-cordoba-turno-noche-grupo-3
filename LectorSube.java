package sube;

public abstract class LectorSube {
	private float saldo=100;
	private int tramo=0; //mepa que no va
	private  float valor;
	private int cantidadDePasada;
	private boolean esBeneficiarioTarifaSocial;

	public LectorSube(float tramo,int  saldo, int cantidadDePasada, boolean esBeneficiarioTarifaSocial) {

	}
	private void setValor(float valor) {
		this.valor = (esBeneficiarioTarifaSocial)?new TarifaSocial(valor).getValorPasaje():(cantidadDePasada!=0)?getValorPorTramo(tramo,cantidadDePasada):valor;
	}
	private void setCantidadDePasada(int cantidadDePasada) {
		this.cantidadDePasada = cantidadDePasada;
	}
	private void setEsBeneficiarioTarifaSocial(boolean esBeneficiarioTarifaSocial) {
		this.esBeneficiarioTarifaSocial = esBeneficiarioTarifaSocial;
	}
	public float getValorPorTramo(int tramo,int cantidadDePasada) {
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
		return valorPorTramo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo-valor;
	}
	

}