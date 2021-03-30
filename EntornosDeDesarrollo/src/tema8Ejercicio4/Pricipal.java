package tema8Ejercicio4;

/**
 * @autor: René Ribera Medrano
 * 
 *         Tema 8 Ejercicio 4
 *
 *         Clase Principal
 */

public class Pricipal {

	public static void main(String[] args) {
		
		Electrodomestico e = new Electrodomestico(0, "Negro", 0, 'A');
		
		System.out.println(e.getConsumoEnergetico());
		System.out.println(e.getColor());

	}

}
