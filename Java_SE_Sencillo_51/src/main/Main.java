package main;

import excepciones.RangoExcepciones;
import utilities.Datos;
import utilities.Funciones;

public class Main {

	public static void run() {

		String opc = null;
		int numeroIntentos = 0;
		int numero = 0;
		boolean noconseguido = true;

		do {
			do {
				try {
					numero = Funciones.realizarIntento();

					if (numero > 100 || numero < 0) {
						numeroIntentos ++;
						throw new RangoExcepciones(numero);
					} else {
						numeroIntentos ++;
						System.out.println("Valor correcto (" + numero + ") en " + numeroIntentos + " intentos");
						noconseguido = false;
					}
				} catch (RangoExcepciones e) {
					System.out.println("Intento "+numeroIntentos+" "+e);
				}
			} while (noconseguido);

			do {
				try {
					opc = Datos.recogeString("Desea lanzardo de nuevo?: (y/n) ");
					noconseguido = true;
					numeroIntentos=0;
				} catch (Exception e) {
					System.out.println("\nPor favor, Introduzca una opción correcta.\n");
				}
			} while (!opc.equalsIgnoreCase("y") && !opc.equalsIgnoreCase("n"));
		} while (opc.equalsIgnoreCase("y"));
	}

}
