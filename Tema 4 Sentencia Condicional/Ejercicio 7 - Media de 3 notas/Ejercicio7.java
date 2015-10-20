/**
 * 
 * Capitulo 4
 * 
 * Ejercicio 7
 * 
 * Realiza un programa que calcule la media de tres notas.
 * 
 */

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Este programa calcula la media de tres notas");
		
		System.out.println ("Introduce la primera nota");
		double nota1 = input.nextDouble();
		
		System.out.println ("Introduce la segunda nota");
		double nota2 = input.nextDouble();
		
		System.out.println ("Introduce la tercera nota");
		double nota3 = input.nextDouble();
		
		double notaFinal = (nota1 + nota2 + nota3) / 3;
		
		System.out.println ("La nota media es de " + notaFinal);
		
	}
}
