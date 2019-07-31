package model;

import utilities.Datos;

public class Coche {

	private String modelo;
	private String color;
	private boolean metalizado;
	private String matricula;
	private String tipo;
	private int year;
	private String seguro;

	public Coche() {
		this.modelo = " ";
		this.color = " ";
		this.metalizado = false;
		this.matricula = " ";
		this.tipo = " ";
		this.year = 0;
		this.seguro = " ";
	}

	public Coche(String modelo, String color, boolean metalizado, String matricula, String tipo, int year,
			String seguro) {

		this.modelo = modelo;
		this.color = color;
		this.metalizado = metalizado;
		this.matricula = matricula;
		this.tipo = tipo;
		this.year = year;
		this.seguro = seguro;

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isMetalizado() {
		return metalizado;
	}

	public void setMetalizado(boolean metalizado) {
		this.metalizado = metalizado;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getSeguro() {
		return seguro;
	}

	public void setSeguro(String seguro) {
		this.seguro = seguro;
	}

	public void registrasCoche() {
		System.out.println("Inscriba su vehículo: ");

		do {
			try {
				this.modelo = Datos.recogeString("Introduzca Modelo: ");
			} catch (Exception e) {
				System.err.println("Por favor, introduzca bien el dato");
				this.modelo = "NULL";
			}
		} while (this.modelo.equalsIgnoreCase("NULL") || this.modelo.equalsIgnoreCase(""));

		do {
			try {
				this.color = Datos.recogeString("Introduzca Color: ");
			} catch (Exception e) {
				System.err.println("Por favor, introduzca bien el dato");
				this.color = "NULL";
			}
		} while (this.color.equalsIgnoreCase("NULL") || this.color.equalsIgnoreCase(""));

		do {
			try {
				String opc = Datos.recogeString("¿Metalizado? (s/n): ");
				if(opc.equalsIgnoreCase("s"))
					this.metalizado=true;
				else if (opc.equalsIgnoreCase("n"))
					this.metalizado=false;
			} catch (Exception e) {
				System.err.println("Por favor, introduzca bien el dato");
				this.color = "NULL";
			}
		} while (this.color.equalsIgnoreCase("s") || this.color.equalsIgnoreCase("n"));

		do {
			try {
				this.matricula = Datos.recogeString("Introduzca Matricula: ");
			} catch (Exception e) {
				System.err.println("Por favor, introduzca bien el dato");
				this.matricula = "NULL";
			}
		} while (this.matricula.equalsIgnoreCase("NULL") || this.matricula.equalsIgnoreCase(""));

		int tipo = 0;

		do {
			System.out.println("Tipo de coche: ");
			System.out.println("1. Utilitario");
			System.out.println("2. Familiar");
			System.out.println("3. Deportivo");
			try {
				tipo = Datos.recogeInt("Indique el tipo: ");
				switch (tipo) {
				case 1:
					this.tipo = "Utilitario";
					break;
				case 2:
					this.tipo = "Familiar";
					break;
				case 3:
					this.tipo = "Deportivo";
					break;
				}

			} catch (Exception e) {
				System.err.println("Por favor, introduzca bien el dato");
			}
		} while ((tipo > 3 && tipo < 1)||this.tipo.equalsIgnoreCase(" "));

		do {
			try {
				this.year = Datos.recogeInt("Introduzca Año: ");
			} catch (Exception e) {
				System.err.println("Por favor, introduzca bien el dato");
			}
		} while (this.year < 2000 || this.year > 2020);

		int seguro = 0;

		do {
			System.out.println("Tipo de seguro: ");
			System.out.println("1. Terceros");
			System.out.println("2. Todo Riesgo");
			try {
				seguro = Datos.recogeInt("Indique el tipo de seguro: ");
				switch (seguro) {
				case 1:
					this.seguro = "Terceros";
					break;
				case 2:
					this.seguro = "Todo Riesgo";
					break;
				}

			} catch (Exception e) {
				System.err.println("Por favor, introduzca bien el dato");
			}
		} while ((seguro > 2 && seguro < 1)||this.seguro.equalsIgnoreCase(" "));

	}

	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", color=" + color + ", metalizado=" + metalizado + ", matricula="
				+ matricula + ", tipo=" + tipo + ", year=" + year + ", seguro=" + seguro + "]";
	}

}
