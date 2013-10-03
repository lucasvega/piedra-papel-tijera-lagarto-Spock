package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {

	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	
	private Forma MiForma;
	
	public Mano(final Forma forma) {
		this.MiForma = forma;
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		
		Resultado resultado = null;
		
		if (this.MiForma == otra.MiForma){
         resultado = Resultado.EMPATA;   
		}

        int miNumero = this.MiForma.getValor();
        int otraNumero = otra.MiForma.getValor();

        if (otraNumero == (miNumero + 1) % 5 || otraNumero == (miNumero + 2) % 5)
        { resultado = Resultado.PIERDE; }
        else{ resultado = Resultado.GANA; }

        return resultado;
	}

}


