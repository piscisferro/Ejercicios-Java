/**
 * Capitulo 4
 * 
 * Ejercicio 13
 * 
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Este programa ordena los numeros introducidos");
		
		int aux = 0;
		
		System.out.println ("Introduce el primer numero");
		int a = input.nextInt();
		
		System.out.println ("Introduce el segundo numero");
		int b = input.nextInt();
		
		System.out.println ("Introduce el tercer numero");
		int c = input.nextInt();
	
		if (a > b) {
			
			aux = a;
			a = b;
			b = aux;
			
		}
		
		if (b > c) {
			
			aux = b;
			b = c;
			c = aux;
		}
		
		if (a > b) {
			
			aux = a;
			a = b;
			b = aux;
		}
		
		System.out.println ("Ordenados de menor a mayor: " + a + ", " + b + ", " + c);
		System.out.println ("Ordenados de mayor a menor: " + c + ", " + b + ", " + a);
		
	}
}
