package nissan;

public class Vehiculo {

	String color;
	String marca;
	String matricula;

	public Vehiculo(String marca, String color, String matricula) {
		// TODO Auto-generated constructor stub
		this.color = color;
		this.marca = marca;
		this.matricula = matricula;
	}

	public void encender() {
		// TODO Auto-generated method stub
		if (marca.equalsIgnoreCase("Nissan")) {
			System.out.println("Marca Correcta");
			if (color.equalsIgnoreCase("Blanco")) {
				System.out.println("Color Correcto");
				if (matricula.equals("A567890")) {
					System.out.println("Encendido");
				}
			}
		}
	}
	
	
	
}
