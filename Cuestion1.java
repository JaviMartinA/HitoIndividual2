package Cuestion1;

public class Trabajador {
	private String nombre;
	private String ciudad;
	private int SalarioBruto;
	private boolean Contratotemporal;
	
	public Trabajador(String nombre, String ciudad, int salarioBruto, boolean contratotemporal) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		SalarioBruto = salarioBruto;
		Contratotemporal = contratotemporal;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getSalarioBruto() {
		return SalarioBruto;
	}
	public void setSalarioBruto(int salarioBruto) {
		SalarioBruto = salarioBruto;
	}
	public boolean isContratotemporal() {
		return Contratotemporal;
	}
	public void setContratotemporal(boolean contratotemporal) {
		Contratotemporal = contratotemporal;
	}
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", ciudad=" + ciudad + ", SalarioBruto=" + SalarioBruto
				+ ", Contratotemporal=" + Contratotemporal + "]";
	}
	
}
