package model;

import utilities.Datos;

public class Punto {

	private int xcor;
	private int ycor;

	public Punto() {
	}

	public void registrarPunto() {
		do {
			try {
				this.xcor = Datos.recogeInt("Introduzca coordenada X: ");
			} catch (Exception e) {
				this.xcor = 0;
				System.err.println("Por favor, introduzca un dato correcto.");
			}
		} while (this.xcor == 0);

		do {
			try {
				this.ycor = Datos.recogeInt("Introduzca coordenada Y: ");
			} catch (Exception e) {
				this.ycor = 0;
				System.err.println("Por favor, introduzca un dato correcto.");
			}
		} while (this.ycor == 0);

	}

	public int getXcor() {
		return xcor;
	}

	public void setXcor(int xcor) {
		this.xcor = xcor;
	}

	public int getYcor() {
		return ycor;
	}

	public void setYcor(int ycor) {
		this.ycor = ycor;
	}

}
