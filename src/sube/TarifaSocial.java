package sube;

public class TarifaSocial{
	float valorPasaje;
	public TarifaSocial(float valorPasaje) {
		setValorPasaje(valorPasaje);
		
	}
	private void setValorPasaje(float valorPasaje) {
		this.valorPasaje = valorPasaje;
	}
	public float getValorPasaje() {
		return valorPasaje*100/60;
	}
}
