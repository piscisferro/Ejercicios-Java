/**
 * Capitulo 6
 * 
 * Ejercicio 1
 * 
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
 * total (los puntos que suman entre los tres dados).
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int dado = 0;
		int suma = 0;
		
		
		System.out.println ("Este programa simula la tirada de 3 dados.");
		
		for (int i = 1; i < 4; i++) {
			dado = (int)(Math.random()*6) + 1;
			suma+=dado;
			input.nextLine();
			System.out.println ("El valor del " + i + "º dado es: ");
			System.out.println (dado);
		}
		
		System.out.println ("La suma de los tres dados es: " + suma);
	}
}
