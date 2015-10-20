/**
 * 
 * Capitulo 4
 * 
 * Ejercicio 5
 * 
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax + b = 0).
 * 
 */

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Este programa resuelve ecuaciones del tipo ax + b = 0. Admite decimales.");
		
		double x = 0;
		
		System.out.println ("Introduce a");
		
		double a = input.nextDouble();
		
		
		if (a < 0 || a > 0) { // Si a no es 0 significa que la ecuacion se puede resolver
			
			System.out.println ("Introduce b");	// Pedimos b para continuar.
			double b = input.nextDouble();
			
			x = (-a) / b;
			
			System.out.println ("x = " + x);
		}
		
		if (a == 0) { // Si a es 0 la ecuacion no tiene solucion
			
			System.out.println ("La ecuacion no tiene solucion");
		}
		
	}
}
