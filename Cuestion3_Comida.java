package Cuestion3;

public class Comida extends Compra{
	String marca;
	float precio;
	String supermercado;
	public Comida(String marca, float precio, String supermercado) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.supermercado = supermercado;
	}
	public void resumen() {
		System.out.println("El resumen es [marca=" + marca + ", precio=" + precio + ", supermercado=" + supermercado + "]");
		
	}
}
