package compilador;

import punto.Punto;

public class Compilador {
	
	private String codigoFuente;
	private static final char CARACTER_INICIO = 'C';
	private static final char CARACTER_FINAL = 'F';
	private static final char NORTE = 'N';
	private static final char SUR = 'S';
	private static final char ESTE = 'E';
	private static final char OESTE = 'O';

	
	public Compilador(String codigoFuente) {
		this.setCodigoFuente(codigoFuente);
	}
	
	public Punto compilar() {
		if (this.validarCodigoFuente()) {
			String cadenaEjecucion = this.removerCaracteresNoNecesarios();
			return this.crearPunto(cadenaEjecucion);
		}
		return null;
	}
	
	private boolean validarCodigoFuente() {

		if(!this.arrancaConCaracterValido()) {
			return false;
		}
		
		if(!this.terminaConCaracterValido()) {
			return false;
		}
		
		if(!this.caracteresDelMedioSonValidos()) {
			return false;
		}
		
		return true;
	}
	
	private boolean arrancaConCaracterValido() {
		return this.getCodigoFuente().charAt(0) == CARACTER_INICIO;
	}
	
	private boolean terminaConCaracterValido() {
		return this.getCodigoFuente().charAt(this.getCodigoFuente().length()-1) == CARACTER_FINAL;
	}
	
	private boolean caracteresDelMedioSonValidos() {
		String cadenaEjecucion = this.removerCaracteresNoNecesarios();
		for(int i = 0; i < cadenaEjecucion.length(); i++) {
				char caracterActual = cadenaEjecucion.charAt(i);
				if(	caracterActual != NORTE &&
					caracterActual != SUR &&
					caracterActual != ESTE &&
					caracterActual != OESTE) 
				{
					return false;
				}
		}
		return true;
	}
	
	private String removerCaracteresNoNecesarios() {
		return this.getCodigoFuente().replaceAll("[" + CARACTER_INICIO + CARACTER_FINAL + "]", "");
	}
	
	private Punto crearPunto(String cadenaEjecucion) {
		int x = 0;
		int y = 0;
		for(int i = 0; i < cadenaEjecucion.length(); i++) {
			char caracterActual = cadenaEjecucion.charAt(i);
			switch(caracterActual) {
				case NORTE:
					x++;
					break;
				case SUR:
					x--;
					break;
				case ESTE:
					y++;
					break;
				case OESTE:
					y--;
					break;
			}
		}
		return new Punto(x,y);
	}
	
	public String getCodigoFuente() {
		return codigoFuente;
	}

	public void setCodigoFuente(String codigoFuente) {
		this.codigoFuente = codigoFuente;
	}

}
