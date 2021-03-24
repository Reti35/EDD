import java.util.Scanner;

public class Ejercicio5 {

	// Programa para saber la nota que hay que sacar para llegar a otra a partir de
	// una nota inicial

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Pedir notas

		System.out.println("Nota conseguida");
		int notainicial = teclado.nextInt();
		System.out.println("Nota que se quiere conseguir");
		int notadeseada = teclado.nextInt();

		// Calculos

		double notanecesaria = (notadeseada * 10 ) /notainicial  ;

		// Resultados

		System.out.println("La nota necesaria es: " + notanecesaria);
		teclado.close();
	}

}
