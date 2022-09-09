package clases;

public class Animal {
	private String estructura; //Vertebrado o Invertebrado
	private String alimentacion; // Herbiboro, Carnivoro, Omnivoro
	private String tipoReproduccion; // Oviparo, Vivíparos, Ovoviviparos
	private String habitat; //tierra, agua, ambos
	private String desplazamiento; //camina, nada, vuela, repta

	public Animal(String estructura, String alimentacion, String tipoReproduccion, String habitat,
			String desplazamiento) {

		this.estructura = estructura;
		this.alimentacion = alimentacion;
		this.tipoReproduccion = tipoReproduccion;
		this.habitat = habitat;
		this.desplazamiento = desplazamiento;
	}

	public String getEstructura() {
		return estructura;
	}

	public void setEstructura(String estructura) {
		this.estructura = estructura;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	public String getTipoReproduccion() {
		return tipoReproduccion;
	}

	public void setTipoReproduccion(String tipoReproduccion) {
		this.tipoReproduccion = tipoReproduccion;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getDesplazamiento() {
		return desplazamiento;
	}

	public void setDesplazamiento(String desplazamiento) {
		this.desplazamiento = desplazamiento;
	}
	

}
