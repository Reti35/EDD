package tema8Ejercicio4;

/**
 * @autor: René Ribera Medrano
 * 
 *         Tema 8 Ejercicio 4
 *
 *         Clase Lavadora
 */

public class Lavadora extends Electrodomestico{
	
	//	Atributos
	private int carga;
	
	//	Constructores
	public Lavadora() {
		
	}
	
	public Lavadora(int precioBase, int peso) {
		
		super();
		this.peso = peso;
		this.precioBase = precioBase;
		
	}
	
	public Lavadora(int carga, int precioBase, String color, int peso, char consumoEnergetico) {
		
		super(precioBase, color, peso, consumoEnergetico);
		this.carga = carga;
		
	}

	//	Getters y Setters
	public int getCarga() {
		
		return carga;
		
	}

	public void setCarga(int carga) {
		
		this.carga = carga;
		
	}
	
	

}
