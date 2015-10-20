/**
 * Capitulo 5
 * 
 * Ejercicio 16
 * 
 * Escribe un programa que diga si un número introducido por teclado es o no primo. Un
 * número primo es aquel que sólo es divisible entre él mismo y la unidad.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		boolean primo = true;
				
		System.out.println ("Este programa calcula usi un numero entero introducido es primo o no");
		System.out.println ("Introduce el numero");
		
		int numero = input.nextInt ();
		
		for (int i = 2; i < numero; i++) {			
			if (numero % i == 0) {				
				primo = false; 				
			}
		}
		
		if (primo == true) {
			System.out.println ("El numero es primo");
			
		} else {
			System.out.println ("El numero no es primo");
			
		}				
	}
}
