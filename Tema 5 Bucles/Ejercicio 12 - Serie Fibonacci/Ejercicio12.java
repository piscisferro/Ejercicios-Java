/**
 * Capitulo 5
 * 
 * Ejercicio 12
 * 
 * Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer
 * término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
 * anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
 * 144… El número n se debe introducir por teclado.
 * 
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int numeroActual = 1;
		int numeroAnterior = 0;
		int serie = 0;
		
		System.out.println ("Este mostrara los n primeros numeros de la serie fibonaccio donde n es un numero introducido");
		System.out.println ("Introduzca n");
		
		int n = input.nextInt();
		
		System.out.print ("0, ");
		System.out.print ("1, ");
		
		
		for (int i = 0; i < (n - 2); i++) {			
			
			serie = numeroActual + numeroAnterior;
			numeroAnterior = numeroActual;
			numeroActual = serie;
			
			System.out.print (serie + ", ");
			
		}		
	}
}
