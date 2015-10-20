/**
 * Examen
 * 
 * Ejercicio 4
 * 
 * Realiza un programa que pida 10 números enteros por teclado y que luego diga cuántos de esos
 * números son capicúa. Los números capicúa son los que se leen igual hacia delante y hacia atrás. Los
 * capicúa repetidos también cuentan.
 *
 * @author Juan Jose Fernandez Romero 
 */

public class Ex11jjfr4 {
	public static void main(String[] args) {
		
		System.out.println ("Este programa construira una Z de asteriscos");
		
		int altura = 0;
		int posicion = 0;
		
		do {
		System.out.println ("Introduce la altura (mayor que 4)");
		altura = Integer.parseInt(System.console().readLine());
		} while (altura < 4);
		
		
		
		for (int i = 1; i <= altura; i++) {
			
			if (i == 1 || i == altura) {
				while (posicion < altura) {
					System.out.print ("*");
					posicion++;
				}
			} else {
				while (posicion < (altura - i)) {
					System.out.print (" ");
					posicion++;
				}
				while (posicion == altura - i) {
					System.out.print ("*");
					posicion++;
				}
			}
			
			System.out.println ();
			posicion = 0;
		}

	}
}
