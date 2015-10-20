/**
 * 
 * Capitulo 4
 * 
 * Ejercicio 6
 * 
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura
 * h. Aplica la fórmula t =(√2h/g) siendo g = 9.81m/s 2
 * 
 */

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Este programa calcula el tiempo que tarda un objeto en caer desde la altura indicada.");
		
		System.out.println ("Introduce la altura desde la que caera el objeto en metros");		
		double h = input.nextDouble();
		
		double g = 9.81;
		
		double t = Math.sqrt((2 * h) / g);
		
		System.out.println ("El tiempo que tarda en caer el objeto es de " + t + " segundos.");
		
	}
}
