import java.util.Scanner;

public class P368_CociendoHuevos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int huevos, olla, minutos;
		
		do {
			
			huevos = sc.nextInt();
			olla = sc.nextInt();
			
			if (huevos != 0 && olla != 0) {
				
				// Operaciones
				
				if (huevos <= olla) {
					
					minutos = 10;
					
				} else {
					
					minutos = 10 + 10 * (olla - huevos);
					
				}
				
				// Mostrar resultado
				
				System.out.println(minutos);
			}
			
		} while (huevos != 0 && olla != 0);
		
		sc.close();

	}

}
