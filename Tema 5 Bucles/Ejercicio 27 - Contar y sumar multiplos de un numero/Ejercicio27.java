/**
 * Capitulo 5
 * 
 * Ejercicio 27
 * 
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un
 * número leído por teclado.
 * 
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio27 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);	
		
		int suma = 0;
		int multiplos = 0;;

		System.out.println ("Este programa mostrara los multiplos de 3 desde 1 al numero introducido");												
		System.out.println ("Introduce el numero (real)");
		int numero = input.nextInt();

		System.out.println ("Los multiplos son: ");
		
		for (int i = 3; i <= numero; i+=3 ) {
			suma += i;
			multiplos++;
			System.out.print (i + ", ");
		}
		
		System.out.println ("Hay: " + multiplos + " multiplos comprendidos entre 1 y " + numero);
		System.out.println ("La suma total de todos estos multiplos es de: " + suma);
		
				
	}
}
