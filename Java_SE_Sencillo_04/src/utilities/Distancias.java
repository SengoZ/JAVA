package utilities;

import model.Punto;

public class Distancias {
	
	public static float distanciaPunto(Punto p1, Punto p2) {
		return (float) Math.sqrt(Math.pow((p2.getXcor()-p1.getXcor()), 2)+Math.pow((p2.getYcor()-p1.getYcor()), 2));
	}

	public static float distanciaOrigen(Punto p1) {
		return (float) Math.sqrt(Math.pow(p1.getXcor(), 2)+Math.pow(p1.getYcor(), 2));
	}

}
