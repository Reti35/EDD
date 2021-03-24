import java.util.Scanner;

public class Ejercicio2 {

	// Programa de operaciones basicas

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir valores al usuario

		System.out.println("Dime un numero:");
		int x = teclado.nextInt();

		System.out.println("Dime otro numero:");
		int y = teclado.nextInt();

		// Operaciones

		int suma = x + y;
		int resta = x - y;
		int division = x / y;
		int multiplicacion = x * y;
		int resto = x % y;

		// Imprimir resultado

		System.out.println("El resultado de la a suma es: " + suma);
		System.out.println("El resultado de la resta es: " + resta);
		System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
		System.out.println("El resultado de la division es: " + division);
		System.out.println("El resto es: " + resto);

		teclado.close();
	}

}
