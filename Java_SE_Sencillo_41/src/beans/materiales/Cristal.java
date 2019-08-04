package beans.materiales;

public class Cristal extends Materiales{
	
	private String color;
	private String size;
	
	public Cristal() {
		super();
	}
	
	public Cristal(String color, String tamano, int precio) {
        super(precio);
        this.color = color;
        this.size = tamano;
    }

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	@Override
    public String toString() {
        return "Cristal{" + "color=" + color + ", tamano=" + size  + '}';
    }

}
