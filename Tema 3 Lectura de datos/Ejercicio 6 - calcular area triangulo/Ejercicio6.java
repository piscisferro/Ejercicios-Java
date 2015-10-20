/**
 *  Capitulo 3
 * 
 * Ejercicio 6
 * 
 * Escribe un programa que calcule el área de un Triangulo.
 * 
 *  @author Juan Jose Fernandez Romero
 */

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		System.out.println ("Este programa calcula el area de un triangulo.");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println ("Introduce la altura del triangulo.");
		double alturaTriangulo = entrada.nextDouble();
		
		System.out.println ("Introduce la base del triangulo.");
		double baseTriangulo = entrada.nextDouble();
		
		double areaTriangulo = (baseTriangulo * alturaTriangulo)/2;
		
		System.out.println ("El area del triangulo es: " + areaTriangulo);
	}
}
