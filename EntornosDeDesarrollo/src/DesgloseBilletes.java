import java.util.Scanner;

public class DesgloseBilletes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Pedir cantidad
		System.out.println("Introduce una cantidad de dinero");
		double cantidad = sc.nextDouble();

		// Iniciar vectores y variables
		int[] cantidades = { 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
		int[] resultado = new int[14];
		String s1, s2;

		// Pasar a centimos el numero introducido por teclado
		int centimos = (int) (cantidad * 100);

		// Calcular numero de billetes y monedas
		for (int a = 0; a < cantidades.length; a++) {

			resultado[a] = centimos / cantidades[a];
			centimos = centimos % cantidades[a];

		}

		// Imprimir el resultado
		for (int a = 0; a < resultado.length; a++) {

			// Comprobacion de si hay alguna moneda o billete y euros o centimos
			if (resultado[a] != 0) {

				// Preparar texto
				s1 = (a < 6) ? "billetes" : "monedas";
				s2 = (a < 8) ? "euros" : "centimos";
				s1 = (resultado[a] == 1) ? s1.substring(0, s1.length() - 1) : s1;
				s2 = (a == 7 || a == 13) ? s2.substring(0, s2.length() - 1) : s2;
				cantidades[a] = (a < 8) ? cantidades[a] / 100 : cantidades[a];

				// Imprimir texto
				System.out.printf("%2d %8s de %3d %-9s%n", resultado[a], s1, cantidades[a], s2);
			}

		}

		sc.close();

	}

}
