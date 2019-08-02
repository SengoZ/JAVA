package main;

import model.Punto;
import utilities.Distancias;

public class Main {
	
	private static Punto p1;
	private static Punto p2;
	
	public static void run() {
		p1 = new Punto();
		p2 = new Punto();
		
		System.out.println("Introduzca punto 1");
		p1.registrarPunto();
		
		System.out.println("Introduzca punto 2");
		p2.registrarPunto();
		
		System.out.println("Distancia entre dos puntos: " + Distancias.distanciaPunto(p1, p2));
		
		System.out.println("Distancia del punto P1 al origen: " + Distancias.distanciaOrigen(p1));
		
		System.out.println("Distancia del punto P2 al origen: " + Distancias.distanciaOrigen(p2));
	}
	
	

}
