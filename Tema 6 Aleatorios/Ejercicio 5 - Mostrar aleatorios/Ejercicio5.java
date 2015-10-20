/**
 * Capitulo 6
 * 
 * Ejercicio 5
 * 
 * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por
 * espacios. Muestra también el máximo, el mínimo y la media de esos números.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int numero = 0;
		int maximo = 0;
		int minimo = 199;
		
		
		System.out.println ("Este programa muestra 50 numeros aleatorios entre 100 y 199");
		input.nextLine();
		
		for (int i = 0; i < 50; i++) {
			numero = (int)((Math.random() * 101) + 99);
			System.out.print (numero + " ");
			
			if (numero < minimo)
				minimo = numero;
				
			if (numero > maximo)
				maximo = numero;
			
		}
		
		System.out.println ("\nEl numero maximo es: " + maximo +
							"\nEl numero minimo es: " + minimo);
		
	}
}
