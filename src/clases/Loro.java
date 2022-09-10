package clases;

public class Loro extends Animal {

	public Loro(String estructura, String alimentacion, String tipoReproduccion, String habitat,
			String desplazamiento) {
		super(estructura, alimentacion, tipoReproduccion, habitat, desplazamiento);
		// TODO Auto-generated constructor stub
		
		// estructura; Vertebrado o Invertebrado
		// alimentacion; Herbiboro, Carnivoro, Omnivoro
		// tipoReproduccion; Oviparo, Vivíparos, Ovoviviparos
		// habitat; tierra, agua, ambos
		// desplazamiento; camina, nada, vuela, repta
		
	}
	
	public void hablarle(String oracion) {
		System.out.print("El loro dice '" + oracion + "'. \n");
	}
	
	public void liberar() {
		System.out.print("El loro está libre. \n");
	}

}
