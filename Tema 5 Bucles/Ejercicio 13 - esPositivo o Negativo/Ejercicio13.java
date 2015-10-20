/**
 * Capitulo 5
 * 
 * Ejercicio 13
 * 
 * Escribe un programa que lea una lista de diez números y determine cuántos son positivos,
 * y cuántos son negativos.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int positivo = 0;
		
		System.out.println ("Este programa lee una lista de 10 numeros y determina cuantos positivos y negativos hay");
		System.out.println ("Introduce los numeros (positivos y negativos)");
		
		for (int i = 0; i < 10; i++) {
			
			int numero = input.nextInt();
			if (numero >= 0) {
				positivo++;
			}
			
		}
		
		System.out.println ("Hay " + positivo + " numeros positivos y " + (10 - positivo) + " numeros negativos");
		
	}
}
