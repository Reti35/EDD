package tema8Ejercicio4;

/**
 * @autor: Ren� Ribera Medrano
 * 
 *         Tema 8 Ejercicio 4
 *
 *         Clase Electrodomesticos
 */

public class Electrodomestico {
	
	//	Atributos
	protected int precioBase;
	protected String color;
	protected int peso;
	protected char consumoEnergetico;

	//	Constructores
	public Electrodomestico() {

		color = "Blanco";
		consumoEnergetico = 'F';
		precioBase = 100;
		peso = 5;

	}

	public Electrodomestico(int precioBase, int peso) {

		this.precioBase = precioBase;
		this.peso = peso;
		color = "Blanco";
		consumoEnergetico = 'F';

	}

	public Electrodomestico(int precioBase, String color, int peso, char consumoEnergetico) {

		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.peso = peso;
		this.consumoEnergetico = comprobarConsumo(consumoEnergetico);

	}

	//	Getters y Setters
	public int getPrecioBase() {

		return precioBase;

	}

	public void setPrecioBase(int precioBase) {

		this.precioBase = precioBase;

	}

	public String getColor() {

		return color;

	}

	public void setColor(String color) {

		this.color = color;

	}

	public int getPeso() {

		return peso;

	}

	public void setPeso(int peso) {

		this.peso = peso;

	}

	public char getConsumoEnergetico() {

		return consumoEnergetico;

	}

	public void setConsumoEnergetico(char consumoEnergetico) {

		this.consumoEnergetico = consumoEnergetico;

	}

	//	Metodos de la clase Electrodomestico
	private char comprobarConsumo(char letra) {

		char[] a = { 'A', 'B', 'C', 'D', 'E', 'F' };

		String l = String.valueOf(letra);
		int cont = 0;

		for (int i = 0; i < a.length; i++) {

			String s = String.valueOf(a[i]);

			if (l.equals(s)) {

				cont++;

			}

		}

		return (cont == 0) ? letra = 'F' : letra;

	}

	private String comprobarColor(String color) {
		
		String[] a = { "Blanco", "Negro", "Gris", "Azul", "Rojo", "Verde", "Amarillo" };
		int cont = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i].equalsIgnoreCase(color)) {
				
				cont++;
				
			}
		}

		return (cont == 0) ? color = "Blanco" : color;

	}

	public void precioFinal() {
		
	}
	
}
