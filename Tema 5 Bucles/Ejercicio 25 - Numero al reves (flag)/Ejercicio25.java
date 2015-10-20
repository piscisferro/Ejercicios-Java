/**
 * Capitulo 5
 * 
 * Ejercicio 25
 * 
 * Realiza un programa que pida un número por teclado y que luego muestre ese número al
 * revés.
 * 
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio25 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);	
		
		int numeroInverso = 0;
		
		System.out.println ("Este programa dara la vuelta a cualquier numero que se introduzca por teclado");
												
		System.out.println ("Introduce el numero (real)");
		int numero = input.nextInt();
		
		while (numero > 0) {
			numeroInverso = (numeroInverso * 10) + (numero % 10);
			numero = numero / 10;
		}
		
		System.out.println ("El numero inverso es: " + numeroInverso);
		
	}
}
