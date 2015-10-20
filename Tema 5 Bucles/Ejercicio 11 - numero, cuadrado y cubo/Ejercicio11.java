/**
 * Capitulo 5
 * 
 * Ejercicio 11
 * 
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros
 * números enteros a partir de uno que se introduce por teclado.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Este programa calculara en tres columnas el cuadrado y el cubo de los 5 primeros numeros a partir del introducido");
		System.out.println ("Introduce un numero entero");
		int numero = input.nextInt();
		int i = 0;
		
		System.out.println ("Numero\tCuadrado  Cubo");
		
		while (i < 5) {
			
			System.out.printf("%4d %8d %8d\n", numero, numero * numero, numero * numero * numero);
			numero++;
			i++;
		}
	}
}
