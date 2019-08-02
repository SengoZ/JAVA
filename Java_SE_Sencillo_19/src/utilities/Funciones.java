package utilities;

public class Funciones {

	public static void dibujarPiramide_1(int n) {
		System.out.println();

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();

	}

	public static void dibujarPiramide_2(int n) {
		System.out.println();

		for (int i = 1; i <= n; i++) {
			for (int j = n; j > 0; j--) {
				if (j <= i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println();
	}

	public static void dibujarPiramide_3(int n) {

		System.out.println();

		for (int i = 1; i <= n; i++) {

			for (int j = n; j >= -n; j--) {
				if(j>0) {
					if(j <= i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}	
				}else if(j <=0 && j >(-i)){
					System.out.print("*");
				}
			}
			System.out.println();

		}

		System.out.println();

	}

}
