/**
 * Capitulo 4
 * 
 * Ejercicio 14
 * 
 * Realiza un programa que diga si un número introducido por teclado es par y/o divisible
 * entre 5.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Este programa detecta si el numero introducido es par y divisible por 5.");
		int numero = input.nextInt();
		
		
		if ((numero % 2) == 0) {
			
			System.out.println ("El numero " + numero + " es par.");
			
		} else {
			
			System.out.println ("El numero " + numero + " no es par.");
			
		}
		
		if ((numero % 5) == 0) {
			
			System.out.println ("El numero " + numero + " es divisible entre 5.");
			
		} else {
			
			System.out.println ("El numero " + numero + " no es divisible entre 5.");
			
		}
		
	}
}
