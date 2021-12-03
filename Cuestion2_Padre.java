package Cuestion2;

public class Padre {
	String nombre;
	int edad;
	public Padre(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public String Saludar() {
		return "Hola, soy el padre";
	}
}
