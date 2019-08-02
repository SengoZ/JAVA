package main;

import utilities.Datos;
import utilities.Funciones;

public class Main {

	public static void run() {

		do {
			try {
				Funciones.dibujarPiramide_1(Datos.recogeInt("Introduzca tamaño de piramide 1: "));
				break;
			} catch (Exception e) {
				System.out.println("\nPor favor, introduzca dato correcto.\n");
			}
		} while (true);
		
		do {
			try {
				Funciones.dibujarPiramide_2(Datos.recogeInt("Introduzca tamaño de piramide 2: "));
				break;
			} catch (Exception e) {
				System.out.println("\nPor favor, introduzca dato correcto.\n");
			}
		} while (true);
		
		do {
			try {
				Funciones.dibujarPiramide_3(Datos.recogeInt("Introduzca tamaño de piramide 3: "));
				break;
			} catch (Exception e) {
				System.out.println("\nPor favor, introduzca dato correcto.\n");
			}
		} while (true);

	}

}
