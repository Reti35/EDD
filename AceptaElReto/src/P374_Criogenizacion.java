import java.util.Scanner;

public class P374_Criogenizacion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int casos, cont = 0, minCont = 0, maxCont = 0;
		long temperatura, min = Long.MAX_VALUE, max = Long.MIN_VALUE;

		casos = sc.nextInt();

		do {

			do {

				temperatura = sc.nextLong();

				if (temperatura != 0) {

					if (temperatura < min) {

						min = temperatura;
						minCont = 1;

					} else if (temperatura == min) {

						minCont++;

					}

					if (temperatura > max) {

						max = temperatura;
						maxCont = 1;

					} else if (temperatura == max) {

						maxCont++;

					}

				}

			}

			while (temperatura != 0);

			cont++;
			
			System.out.print(min);
			System.out.print("");
			System.out.print(minCont);
			System.out.print("");
			System.out.print(max);
			System.out.print("");
			System.out.print(maxCont);

		}

		while (casos > cont);

		sc.close();

	}

}
