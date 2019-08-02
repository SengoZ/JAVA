package main;

import java.util.ArrayList;

import model.ElementoTablaPeriodica;
import utilities.Datos;

public class Main {

	private static ElementoTablaPeriodica elemento;
	private static ArrayList<ElementoTablaPeriodica> elementos;
	private static char opc;

	public static void run() {
		elemento = new ElementoTablaPeriodica();

		elementos = new ArrayList<ElementoTablaPeriodica>();

		String aux = "";

		do {
			elemento.registroElementos();
			
			elementos.add(elemento);
			do {
				try {
					aux = Datos.recogeString("Desea introducir otro elemento?(y/n) ");
				} catch (Exception e) {
					System.out.println("Por favor, introduzca valor correcto.");
				}

				opc = aux.charAt(0);
			}while (opc != 'y' && opc != 'n');
		} while (opc == 'y');
		
		System.out.println("Hay "+ElementoTablaPeriodica.numeroDeElemntos()+" elementos.");

	}

}
