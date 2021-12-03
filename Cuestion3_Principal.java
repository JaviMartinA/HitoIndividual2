package Cuestion3;



public class Principal {

	public static void main(String[] args) {
		 Bebida bebida1=new Bebida("Cocacola",1.25f,"Mercadona");
		 Comida comida1=new Comida ("Lasaña",3.5f,"DIA");
		 Aperitivo aperitivo1=new Aperitivo ("Aceitunas",0.70f,"Lidl");
		 Compra[] compra1={bebida1,comida1,aperitivo1};
		 compra1[0].resumen();
		 compra1[1].resumen();
		 compra1[2].resumen();
		}
	/*El polimorfismo aplicado esta basado en herencia  y lo que hace es a través de una clase padre le da en herencia
	a sus hijos métodos y el polimorfismo se encarga de expresarlos dependiendo de cada clase hija*/
	

}//cierra clase
