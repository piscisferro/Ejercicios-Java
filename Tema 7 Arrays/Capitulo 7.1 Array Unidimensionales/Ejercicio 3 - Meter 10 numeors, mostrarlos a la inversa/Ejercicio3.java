/**
 * Capitulo 7.1
 * 
 * Ejercicio 3
 * 
 * Escribe un programa que lea 10 números por teclado y que luego los muestre en orden
 * inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int[] numero = new int[10];
		
		System.out.println ("Este programa recogera 10 numeros introducidos por teclado y los mostrara" +
												"\nen el orden inverso");
		System.out.println ("Introduce los numeros");
		
		for (int  i = 0; i < 10; i++)
			numero[i] = input.nextInt();
			
		System.out.println ("Ahora se mostraran los numeros en el orden inverso");
		
		for (int i = 9; i >= 0; i--) 
			System.out.print (numero[i] + ", ");
		
	}
}
