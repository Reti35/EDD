import java.util.Scanner;

public class Ejercicio1 {
	// programa de intercambio de valores
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// pedir valores al usuario
		System.out.println("Introduce el valor de x:");
		int x = teclado.nextInt();

		System.out.println("Introduce el valor de y:");
		int y = teclado.nextInt();

		// intercambio de valores
		// int aux = x;
		// x = y;
		// y = aux;

		x = x + y;
		y = x - y;
		x = x - y;

		// imprimir resultado
		System.out.println("x es:" + x);
		System.out.println("y es:" + y);
		teclado.close();
	}

}
