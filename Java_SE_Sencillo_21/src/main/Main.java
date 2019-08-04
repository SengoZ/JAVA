package main;

import utilities.Datos;

public class Main {

	public static void run() {
		String opc = null;
		int limiteInferior;
		int limiteSuperior;
		int numero;

		while (true) {
			try {

				limiteInferior = Datos.recogeInt("Introduzca limite inferior: ");

				if (limiteInferior >= 0) {

					while (true) {

						limiteSuperior = Datos.recogeInt("Introduzca limite superior: ");
						if (limiteInferior < limiteSuperior)
							break;

					}

					break;
				}
			} catch (Exception e) {
				System.out.println("\nPor favor, introduzca un dato correcto.\n");
			}
		}

		do {

			try {
				numero = Datos.recogeInt("Introduzca un número: ");
				if (numero >= limiteInferior && numero <= limiteSuperior) {
					System.out.println("El número introducido está dentro de los limites");
				} else {
					System.out.println("El número introducido está fuera de los limites");
				}
				do {
					try {
						opc = Datos.recogeString("Desea introducir otro número? (y/n) ");
					} catch (Exception e) {
						System.out.println("\nPor favor, introduzca un dato correcto.\n");
					}
				} while (!opc.equalsIgnoreCase("y") && !opc.equalsIgnoreCase("n"));
			} catch (Exception e) {
				System.out.println("\nPor favor, introduzca un dato correcto.\n");
			}

		} while (opc.equalsIgnoreCase("y"));
	}

}
