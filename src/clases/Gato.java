package clases;

public class Gato extends Animal {
	
	//Características
	private String color;
	
	//Constructor
	public Gato(String estructura, String alimentacion, String tipoReproduccion, String habitat,
			String desplazamiento) {
		super(estructura, alimentacion, tipoReproduccion, habitat, desplazamiento);
		
		}
	
	//getter and setter	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//Métodos
	public void comer() {
		
	}
	
	public void jugar() {
		
		
	}
	public void dormir(){
		
	}
}

