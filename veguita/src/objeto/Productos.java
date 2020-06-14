package objeto;

public class Productos {
	
	private String nombre;
	private int precio;
	private String descripcion;
	
	//Setters and Getters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Productos(String nombre, int precio, String descripcion)
	{
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		
	}

}
