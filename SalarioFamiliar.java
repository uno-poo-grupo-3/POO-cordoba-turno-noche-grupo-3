package clase5;

public class SalarioFamiliar {
	
	private int hijos;
	private boolean casado;
	public static final double PRECIO_POR_HIJO = 200;
	public static final double PRECIO_SI_ES_CASADO = 100;
	
	public SalarioFamiliar(int hijos, boolean casado) {
		this.hijos = hijos;
		this.casado = casado;
	}

	public double getHijos() {
		return hijos;
	}

	public void setHijos(int hijos) {
		this.hijos = hijos;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setEsCasado(boolean esCasado) {
		this.casado = esCasado;
	}
	
	
	public double calcularSalario() {
		double salarioFamiliar = this.getHijos() * PRECIO_POR_HIJO;
		if (this.isCasado()) {
			salarioFamiliar += PRECIO_SI_ES_CASADO;
		}
		return salarioFamiliar;
	}
	
	
	
}
