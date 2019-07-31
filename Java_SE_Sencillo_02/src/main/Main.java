package main;

import model.Coche;

public class Main {

	private static Coche coche;

	public static void run(){
		coche = new Coche();
		
		coche.registrasCoche();
		
		System.out.println(coche);
		

	}

}
