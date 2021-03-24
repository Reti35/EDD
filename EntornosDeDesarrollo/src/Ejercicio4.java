import java.util.Scanner;

public class Ejercicio4 {

	// Programa para saber el porcentaje de chicos y chicas en una clase

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir valores al usuario

		System.out.println("Numero de chicos");
		int chicos = teclado.nextInt();

		System.out.println("Numero de chicas");
		int chicas = teclado.nextInt();

		// Calculos

		int total = chicas + chicos;
		int niños = (chicos * 100) / total;
		int niñas = (chicas * 100) / total;

		// Mostrar resultados

		System.out.println("Total en clase: " + total);
		System.out.println("El porcentaje de chicos es: " + niños + "%");
		System.out.println("El porcentaje de chicas es: " + niñas + "%");

		teclado.close();
	}

}
