package excepciones;

public class RangoExcepciones extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int valor;

	public RangoExcepciones() {
	}

	public RangoExcepciones(int valor) {
		super();
		this.valor = valor;
	}

	@Override
	public String toString() {

		return "------------PROBLEMA: Valor no correcto: " + valor;
	}

}
