package cesar.marcatinco.ramos.examen;

public class Carta {
	
	private String nombre;
	private Plato [] platos;
	private Bebida [] bebida;
	public Carta(String nombre, Plato[] platos, Bebida[] bebida) {
		super();
		this.nombre = nombre;
		this.platos = platos;
		this.bebida = bebida;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Plato[] getPlatos() {
		return platos;
	}
	public void setPlatos(Plato[] platos) {
		this.platos = platos;
	}
	public Bebida[] getBebida() {
		return bebida;
	}
	public void setBebida(Bebida[] bebida) {
		this.bebida = bebida;
	}
	
	
}
