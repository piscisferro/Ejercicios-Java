/**
 * Capitulo 5
 * 
 * Ejercicio 23
 * 
 * Escribe un programa que permita ir introduciendo una serie indeterminada de números
 * mientras su suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar el
 * total acumulado, el contador de los números introducidos y la media.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio23 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int suma = 0;
		int numero = 0;
		int divisorMedia = 0;
		
		
		System.out.println ("Este programa sumara numeros introducidos hasta que lleguen a 10000 o mas. Entonces calculara" +
												"\nEl total acumulado, la media y el contador de numeros introducidos");
												
		System.out.println ("Introduce los numeros (reales)");
		
		while (suma < 10000) {
			numero = input.nextInt();			
			suma += numero;
			divisorMedia++;
		}
		
		int media = suma / divisorMedia;
		
		System.out.println ("El total es: " + suma);
		System.out.println ("Has introducido " + divisorMedia + " numeros");
		System.out.println ("La media total es: " + media);
			

	}
}
