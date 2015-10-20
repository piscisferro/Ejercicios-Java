/**
 *  Capitulo 3
 * 
 * Ejercicio 5
 * 
 * Escribe un programa que calcule el área de un rectángulo.
 * 
 *  @author Juan Jose Fernandez Romero
 */

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		System.out.println ("Este programa calcula el area de un rectangulo.");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println ("Introduce la altura del rectangulo.");
		double alturaRectangulo = entrada.nextDouble();
		
		System.out.println ("Introduce la base del rectangulo.");
		double baseRectangulo = entrada.nextDouble();
		
		double areaRectangulo = baseRectangulo * alturaRectangulo;
		
		System.out.println ("El area del rectangulo es: " + areaRectangulo);
	}
}
		
