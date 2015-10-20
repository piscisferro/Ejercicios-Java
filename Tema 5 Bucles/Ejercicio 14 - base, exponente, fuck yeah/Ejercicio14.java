/**
 * Capitulo 5
 * 
 * Ejercicio 14
 * 
 * Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la
 * potencia.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
				
		System.out.println ("Este programa calcula un numero elevado a una potencia");
		System.out.println ("Introduce el numero base");
		
		int base = input.nextInt();
		int resultado = base;
		
		System.out.println ("Introduce la potencia a la que se elevara el numero, solo numeros positivos");
		
		int potencia = input.nextInt();
		
		System.out.println ("_______"); // Para separar en la consola los numeros introducidos de los resultados
		
		for (int i = 1; i < potencia; i++) {
			
			resultado *= base;
			
		}
		
		if (potencia == 0) {
			
			System.out.println ("1");
			
		} else {
			System.out.println (resultado);
			
		}		
	}
}
