package beans.materiales;

public class Porcelana extends Materiales{

	private String procedencia;
	
	public Porcelana() {}
	
	public Porcelana(String procedencia, int precio) {
		super(precio);
		this.procedencia = procedencia;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	
	@Override
    public String toString() {
        return "Porcelana{" + "procedencia=" + procedencia + "}";
    }
	
}
