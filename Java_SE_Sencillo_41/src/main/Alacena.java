package main;

import beans.Taza;
import beans.materiales.Cristal;
import beans.materiales.Porcelana;
import model.Vajilla;

public class Alacena {
	
	private static Vajilla vajilla = new Vajilla();
	
	public static void gestion() {
		Porcelana p1 = new Porcelana("Ming",100);
        Taza<Porcelana> t1 = new Taza<>(p1,(short)100);
        Porcelana p2 = new Porcelana("Chang",100);        
        Taza<Porcelana> t2 = new Taza<>(p2,(short)150);
        Taza<Porcelana> t3 = t2;
        
        vajilla.add(t1);
        vajilla.add(t2);
        vajilla.add(t3);
        
        Cristal c = new Cristal("Esmerilado","pequeño",100);
        Taza<Cristal> c1 = new Taza<>(c,(short)50);
        vajilla.add(c1);

        System.out.println(vajilla);
	}

}
