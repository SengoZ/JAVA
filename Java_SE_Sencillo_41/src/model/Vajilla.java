package model;

import java.util.HashSet;
import java.util.Set;

import beans.Taza;

public class Vajilla {
	
	@SuppressWarnings("rawtypes")
	private Set<Taza> juegoTazas = new HashSet<Taza>();
	
	public Vajilla() {}

	@SuppressWarnings("rawtypes")
	public Set<Taza> getJuegoTazas() {
		return juegoTazas;
	}

	@SuppressWarnings("rawtypes")
	public void setJuegoTazas(Set<Taza> juegoTazas) {
		this.juegoTazas = juegoTazas;
	}
	
	@SuppressWarnings("rawtypes")
	public void add(Taza t) {
		juegoTazas.add(t);
	}
	
	@Override
	@SuppressWarnings("rawtypes")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Taza t : juegoTazas) {
            sb.append(",");
            sb.append(t);
        }
        return sb.toString();
    }

}
