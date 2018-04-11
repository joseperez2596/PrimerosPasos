package fabrica;

import nissan.Vehiculo;

public class main {
	
	public static void main (String [] args) {
		
		String marca = "nissan";
		String color = "blanco";
		String matricula = "A567890";
		
		Vehiculo carro = new Vehiculo(marca, color, matricula);
		
		
		carro.encender();
		
	}
	
}
