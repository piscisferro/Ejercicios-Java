/**
 * Capitulo 7.1
 * 
 * Ejercicio 10
 * 
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los
 * almacene en un array. El programa debe ser capaz de pasar todos los números pares a las
 * primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas
 * restantes. Utiliza arrays auxiliares si es necesario.
 * 
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int[] num = new int[20];
		int i = 0;
		int x = 0;
		int temp = 0;
		
		System.out.println ("Este programa mostrara 20 numeros aleatorios y los ordenara, primero" + 
							"los pares y luego los impares.");
		
		System.out.println ("Array original");
		
		for (i = 0; i < 20; i++) {
			num[i] = (int)(Math.random() * 101);
			System.out.print (num[i] + ", ");
		}
		
		for (i = 0; i < 20; i++) {
			if (num[i] % 2 == 0) {
				temp = num[x];
				num[x] = num[i];
				num[i] = temp;
				x++;				
			}
		}
		
		System.out.println ("\n\nArray ordenado");
		
		for (i = 0; i < 20; i++) {
			System.out.print (num[i] + ", ");
		}
	}		
}
