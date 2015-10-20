/**
 * Capitulo 6
 * 
 * Ejercicio 13
 * 
 * Escribe un programa que simule la tirada de dos dados. El programa deberá continuar
 * tirando los dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo
 * valor.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int dado1 = 1;
		int dado2 = 0;
		
		
		System.out.println ("Este programa simula la tirada de 3 dados.");
		System.out.print ("| ");
		
		while (dado1 != dado2) {
			dado1 = (int)(Math.random()*6) + 1;
			dado2 = (int)(Math.random()*6) + 1;
			System.out.print (dado1 + ", " + dado2 + " | ");
		}
		
	}
}
