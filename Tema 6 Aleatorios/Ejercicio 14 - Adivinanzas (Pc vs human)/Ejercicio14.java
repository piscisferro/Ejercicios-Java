/**
 * Capitulo 6
 * 
 * Ejercicio 14
 * 
 * Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El programa
 * intentará adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para
 * ello 5 oportunidades. En cada intento fallido, el programa debe preguntar si el número que
 * estás pensando es mayor o menor que el que te acaba de decir.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int numero = 0;
		int numInput = 0;
		int numMenu = 0;
		boolean acierto = false;
		
		
		System.out.print ("En este minijuego el ordenador intentara acertar el numero que introduzcas");
		input.nextLine();
		
		numero = (int)(Math.random() * 101);
		
		for (int i = 5; i > 0; i--) {
			if (i > 1)
				System.out.println ("Tengo " + i + " oportunidades");
				
			if (i == 1)
				System.out.println ("Es mi ultima oportunidad");
			
			
			System.out.println ("Es el " + numero);
			
			do {
				System.out.println ("¿He acertado? [1]Si [2]No");
				numMenu = input.nextInt();
				if (numMenu != 2 && numMenu != 1) {
					System.out.println ("Recuerda introducir el numero 1 para Si o 2 para No");
				}
			} while (numMenu != 2 && numMenu != 1);
			
			if (numMenu == 1) {
				acierto = true;
				System.out.println ("He acertado!");
				i = 0;
			}
			
			if (acierto == false) {
				do {
					System.out.println ("¿El numero que buscos es [1]mayor o [2]menor?");
					numMenu = input.nextInt();
					if (numMenu != 2 && numMenu != 1) {
						System.out.println ("Recuerda introducir el numero 1 para mayor o 2 para menor");
					}
					
				} while (numMenu != 2 && numMenu != 1);
				
				if (numMenu == 1) 
					numero = (int)(Math.random()*(101 - numero) + numero);
				
				if (numMenu == 2) 
					numero = (int)(Math.random() * numero);
				
			}
		}
	}
}
