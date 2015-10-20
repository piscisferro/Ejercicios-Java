/**
 * Capitulo 6
 * 
 * Ejercicio 6
 * 
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo
 * y tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas
 * oportunidades quedan y si el número introducido es menor o mayor que el número secreto.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int numero = 0;
		int numInput = 0;
		
		
		System.out.print ("En este minijuego tendras que acertar un numero entre 0 y 100!");
		input.nextLine();
		
		numero = (int)(Math.random() * 101);
		
		for (int i = 5; i > 0; i--) {
			if (i > 1)
				System.out.println ("Tienes " + i + " oportunidades");
				
			if (i == 1)
				System.out.println ("Es tu ultima oportunidad");
				
			numInput = input.nextInt();
			
			if (numero == numInput) {
				System.out.println ("Felicidades has acertado!");
				i = 0;
			} else if (numero > numInput) {
				System.out.println ("El numero que buscas es mayor!");
			} else if (numero < numInput) {
				System.out.println ("El numero que buscas es menor!");
			}
		}
	}
}
