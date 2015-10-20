/**
 * Capitulo 5
 * 
 * Ejercicio 19
 * 
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por
 * teclado. El carácter con el que se pinta la pirámide también se debe pedir por teclado.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio19 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int altura = 0;
		int posicion = 0;
		int base = 0;
		
		System.out.println ("Este programa contruye una piramide");
		
		System.out.println ("Introduce el simbolo con el cual se construira");
		char simbolo = input.nextLine().charAt(0);
		
		
		System.out.println ("Introduce la altura");
		altura = input.nextInt();
		
		base = (altura*2) - 1;
		
		for (int i = 0; i < altura; i++) {
			
			while (posicion < (altura - i)) {
				System.out.print (" ");
				posicion++;
			}
			
			
			while (posicion <= altura + i) {
				System.out.print (simbolo);
				posicion++;
			}
			
			System.out.println ();
			posicion = 0;

		}
	}
}
