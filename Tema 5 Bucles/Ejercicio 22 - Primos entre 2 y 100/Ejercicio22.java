/**
 * Capitulo 5
 * 
 * Ejercicio 122
 * 
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio22 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		boolean primo = true;
		
		System.out.println ("Este programa muestra en pantalla los numeros primos entre 2 y 100");
		
		for (int numero = 2; numero <= 100; numero++) {
			for (int i = 2; i < numero; i++) {			
				if (numero % i == 0) {				
				primo = false; 				
				}
			}
			
			if (primo == true) {
				System.out.print (numero + ", ");
			}
			
			primo = true;
		}
	}
}
