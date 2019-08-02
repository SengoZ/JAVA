package main;

import model.Asignatura;

public class Main {
	
	private static Asignatura asignatura;
	
	public static void run() {
		asignatura = new Asignatura();
		
		asignatura.registroAsigntura();
		
		System.out.println(asignatura);
		
	}

}
