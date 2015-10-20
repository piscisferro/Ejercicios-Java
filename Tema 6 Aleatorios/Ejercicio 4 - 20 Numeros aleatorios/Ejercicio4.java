/**
 * Capitulo 6
 * 
 * Ejercicio 4
 * 
 * Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por
 * espacios.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int numero = 0;
		
		
		System.out.println ("Este programa muestra 20 numeros aleatorios entre 0 y 10");
		input.nextLine();
		
		for (int i = 0; i < 20; i++) {
			numero = (int)(Math.random() * 11);
			System.out.print (numero + " ");
		}
	}
}
