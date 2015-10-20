/**
 * Capitulo 5
 * 
 * Ejercicio 24
 * 
 * Escribe un programa que lea un número n e imprima una pirámide de números con n filas
 * como en la siguiente figura:
 * 
 *    1
 *   121
 *  12321
 * 1234321
 * 
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio24 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);		
		
		int posicion = 0;
		int incremento = 0;
		
		System.out.println ("Este programa creara una piramide numerica capicua de n filas");
												
		System.out.println ("Introduce 'n' (numero real)");
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			while (posicion < (n - i)) {
				System.out.print (" ");
				posicion++;
			}
			
			while (posicion <= n) {
				incremento++;
				System.out.print(incremento);
				posicion++;
			}
			
			while (posicion <= (n + i)) {
				incremento--;
				System.out.print (incremento);
				posicion++;
			}
			
			posicion = 0;
			incremento = 0;
			System.out.println();
			
		}
	}
}
