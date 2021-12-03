package Cuestion2;

public class Principal {

	public static void main(String[] args) {
		Padre padre1=new Padre("bryan",45);
		padre1.Saludar();
		Hijo hijo1=new Hijo("Victor",14);
		hijo1.Saludar();
		System.out.println(hijo1.Saludar());
		System.out.println(padre1.Saludar());

	}

}
