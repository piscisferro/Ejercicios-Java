/**
 * Capitulo 5
 * 
 * Ejercicio 8
 * 
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int multiplo = 0;
		
		System.out.println ("Este programa muestra la tabla de multiplicar del numero introducido.");
		System.out.println ("Introduce un numero entero");
		int numero = input.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			
			multiplo = numero * i;
			System.out.println (numero + " x " + i + " = " + multiplo);
			
		}

	}
}
