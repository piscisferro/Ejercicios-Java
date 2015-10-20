/**
 * Capitulo 5
 * 
 * Ejercicio 29
 * 
 * Escribe un programa que muestre por pantalla todos los números enteros positivos menores
 * a uno leído por teclado que no sean divisibles entre otro también leído de igual forma.
 * 
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio29 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int numero = 0;
		int divisor = 0;
		
		System.out.println ("Este programa mostrara los numeros enteros positivos menores al introducido" + 
												"\nAdemas estos numeros no seran divisibles por un segundo numero introducido.");				
		
		do {			
		System.out.println ("Introduce el numero (real)");
		numero = input.nextInt();		
		} while (numero < 0);
		
		do {											
		System.out.println ("Introduce el numero (real) divisor");
		divisor = input.nextInt();		
		} while (divisor < 0);

		System.out.print ("Los numeros menores y no divisibles son: ");
		
		while (numero > 0) {
			numero--;
			if (numero % divisor > 0) {
				System.out.print (numero + ", ");
			}
		}		
	}
}
