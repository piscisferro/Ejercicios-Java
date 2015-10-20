/**
 * Capitulo 6
 * 
 * Ejercicio 2
 * 
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta
 * baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles. Cada palo está
 * formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8,
 * 9, 10, J, Q, K y A (que sería el 1). Para convertir un número en una cadena de caracteres
 * podemos usar String.valueOf(n) .
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int palo = 0;
		int carta = 0;
		
		
		System.out.println ("Este programa muestra al azar el nombre de una carta de la baraja francesa");
		input.nextLine();
		
		palo = (int) (Math.random()*4) + 1;
		carta = (int) (Math.random()*13) + 1;
		
		switch (carta) {
			case 1:
				System.out.print ("El As");
				break;
				
			case 11:
				System.out.print ("La sota");
				break;
				
			case 12:
				System.out.print ("La reina");
				break;
				
			case 13: 
				System.out.print ("El rey");
				break;
				
			default:
		}
		
		if (carta > 1 && carta < 11)
			System.out.print ("El " + carta);
		
		switch (palo) {
			case 1:
				System.out.println (" de Diamantes");
				break;
				
			case 2:
				System.out.println (" de Picas");
				break;
				
			case 3:
				System.out.println (" de Rombos");
				break;
				
			case 4: 
				System.out.println (" de Corazones");
				break;
				
			default:
		}
		
	}
}
