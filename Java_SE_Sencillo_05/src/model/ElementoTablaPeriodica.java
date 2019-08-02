package model;

import utilities.Datos;

public class ElementoTablaPeriodica {
	
	private String nombre;
	private String simbolo;
	private int numero;
	private static int numeroElementos=0;
	
	public ElementoTablaPeriodica() {}
	
	public void registroElementos() {
		do {
			try {
				nombre = Datos.recogeString("Introduzca nombre del elemento: ");
			} catch (Exception e) {
				System.out.println("\nIntroduzca correctamente el dato\n");
				nombre = "";
			}
		}while(nombre.equalsIgnoreCase(""));
		
		do {
			try {
				simbolo = Datos.recogeString("Introduzca simbolo: ");
			} catch (Exception e) {
				System.out.println("\nIntroduzca correctamente el dato\n");
				simbolo = "";
			}
		}while(simbolo.equalsIgnoreCase(""));
		
		do {
			try {
				numero = Datos.recogeInt("Introduzca valor: ");
			} catch (Exception e) {
				System.out.println("\nIntroduzca correctamente el dato\n");
				numero = 0;
			}
		}while(numero == 0);
		
		numeroElementos ++;
	}
	
	public static int numeroDeElemntos() {
		return numeroElementos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "ElementoTablaPeriodica [nombre=" + nombre + ", simbolo=" + simbolo + ", numero=" + numero + "]";
	}

}
