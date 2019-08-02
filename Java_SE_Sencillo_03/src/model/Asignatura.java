package model;

import utilities.Datos;

public class Asignatura {
	
	private String nombre;
	private int codigo;
	private String curso;
	
	public Asignatura() {}
	
	public void registroAsigntura() {
		do {
			try {
				this.nombre = Datos.recogeString("Introduzca nombre asignatura: ");
			} catch (Exception e) {
				System.err.println("Por favor, introduzca un dato correcto.");
			}
			
		}while(this.nombre.equalsIgnoreCase(""));
		
		do {
			try {
				this.codigo = Datos.recogeInt("Introduzca código asignatura: ");
			} catch (Exception e) {
				this.codigo=0;
				System.err.println("Por favor, introduzca un dato correcto.");
			}
			
		}while(this.codigo==0);
		
		do {
			try {
				this.curso = Datos.recogeString("Introduzca código asignatura: ");
			} catch (Exception e) {
				System.err.println("Por favor, introduzca un dato correcto.");
			}
			
		}while(this.curso.equalsIgnoreCase(""));
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Asignatura [codigo=" + codigo + ", nombre=" + nombre + ", curso=" + curso + "]";
	}
	
	

}
