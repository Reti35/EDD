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
		int ni�os = (chicos * 100) / total;
		int ni�as = (chicas * 100) / total;

		// Mostrar resultados

		System.out.println("Total en clase: " + total);
		System.out.println("El porcentaje de chicos es: " + ni�os + "%");
		System.out.println("El porcentaje de chicas es: " + ni�as + "%");

		teclado.close();
	}

}
