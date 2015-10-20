/**
 * 
 * Capitulo 4
 * 
 * Ejercicio 9
 * 
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax 2 + bx + c = 0).
 * 
 */

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Este programa resuelve ecuaciones del tipo ax² + bx + c = 0. Admite decimales.");
		
		double x1 = 0;
		double x2 = 0;
		
		System.out.println ("Introduce a");
		
		double a = input.nextDouble();
		
		if (a == 0) {	// si a es 0 significa que tenemos una ecuacion de primer grado
			
			System.out.println ("Introduce b");	// Pedimos b para continuar.
			double b = input.nextDouble();	
			
			if (b == 0) { // Si a es 0 la ecuacion no tiene solucion
			
			System.out.println ("La ecuacion no tiene solucion");
			
			} else { // Si b no es 0 significa que la ecuacion se puede resolver
				
				System.out.println ("Introduce c");	// Pedimos c para continuar.
				double c = input.nextDouble();	
			
				x1 = (-c) / b;
			
				System.out.println ("x = " + x1);			
			}
			
		} else {
			
			System.out.println ("Introduce b");	// Pedimos b para continuar.
			double b = input.nextDouble();	
			
			System.out.println ("Introduce c");	// Pedimos c para continuar.
			double c = input.nextDouble();	
			
			double raiz = (b * b)-(4 * a * c);
			
			if (raiz < 0) {
				
				System.out.println ("La ecuacion no tiene solución");
				
			} else {		
			
				x1 = (-b + (Math.sqrt(raiz))) / (2 * a);
				x2 = (-b - (Math.sqrt(raiz))) / (2 * a);
			
				System.out.println ("x1 = " + x1);
				System.out.println ("x2 = " + x2);
			}
		}
	}
}

