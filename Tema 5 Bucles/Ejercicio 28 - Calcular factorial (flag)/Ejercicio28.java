/**
 * Capitulo 5
 * 
 * Ejercicio 28
 * 
 * Escribe un programa que calcule el factorial de un número entero leído por teclado.
 * 
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio28 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int factorial = 0;
		int numero = 0;
		
		System.out.println ("Este programa mostrara los numeros factoriales del numero introducido");				
		
		do {
											
		System.out.println ("Introduce el numero (entero positivo)");
		numero = input.nextInt();
		
		} while (numero < 0);

		System.out.println ("Los numeros factoriales son: ");
		
		if (numero == 0 || numero == 1) {
			System.out.print ("1");
		} else {	
				for (int i = 1; i < numero; i++) {
					factorial = numero * i;
					System.out.print (i + ", ");
				
				}
			}
		
		System.out.println ("\nEl factorial es: " + factorial);
	}
}
