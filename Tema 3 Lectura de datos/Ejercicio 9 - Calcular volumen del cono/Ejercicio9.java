/**
 *  Capitulo 3
 * 
 * Ejercicio 9
 * 
 * Escribe un programa que calcule el volumen de un cono según la fórmula V = (1/3π)r²h
 * 
 *  @author Juan Jose Fernandez Romero
 */

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println ("Este programa calcula el volumen de un cono.");
		
		System.out.println ("Indique el radio de la base del cono.");
		double radio = entrada.nextDouble();
		
		System.out.println ("Indique la altura del cono");
		double h = entrada.nextDouble();
		
		// Valor de π = 3,14.
		
		double volumenCono = (3.14/3) * (radio * radio) * h;
		
		System.out.println ("El volumen del cono es: " + volumenCono + ".");

	}
}
