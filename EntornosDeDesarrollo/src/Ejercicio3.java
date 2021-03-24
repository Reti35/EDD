import java.util.Scanner;

public class Ejercicio3 {

	// Programa para saber si un numero es par o impar

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir valores al usuario

		System.out.println("Dime un numero:");
		int x = teclado.nextInt();

		// Comprobacion de el valor

		if (x % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		teclado.close();

	}

}
