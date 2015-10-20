/**
 * Capitulo 5
 * 
 * Ejercicio 7
 * 
 * Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
 * El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el
 * mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se
 * ha abierto satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int i = 0;
		int codigoCajaFuerte = 4567;
		
		System.out.println ("Combinacion de la caja fuerte.");
		
		while (i < 4) {
			
			System.out.println ("Por favor introduzca el numero de la combinación.");
			codigoCajaFuerte = input.nextInt();
			
			if (codigoCajaFuerte == 4567) {
				
				System.out.println ("La caja fuerte se ha abierto satisfactoriamente.");
				i = 4;
			} else {
				
				System.out.println ("Lo siento, esa no es la combinacion.");
			}
			
			i++;
		}

	}
}
