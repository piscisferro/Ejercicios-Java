/**
 * Capitulo 5
 * 
 * Ejercicio 9
 * 
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int i = 1;
		int digitos = 0;
		System.out.println ("Este programa dice el numero de digitos que tiene un numero");
		System.out.println ("Introduce un numero");
		int numero = input.nextInt();
		
		i = numero / 10;
		digitos++;
		
		while (i != 0) {
			
			i = i / 10;
			digitos ++;
		}
		
		System.out.println ("El numero tiene " + digitos + " digitos");

	}
}
