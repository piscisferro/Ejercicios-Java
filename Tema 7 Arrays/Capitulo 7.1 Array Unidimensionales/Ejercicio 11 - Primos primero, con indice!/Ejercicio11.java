/**
 * Capitulo 7.1
 * 
 * Ejercicio 11
 * 
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array.
 * A continuación se mostrará el contenido de ese array junto al índice (0 – 9) utilizando
 * para ello una tabla. Seguidamente el programa pasará los primos a las primeras posiciones,
 * desplazando el resto de números (los que no son primos) de tal forma que no se pierda
 * ninguno. Al final se debe mostrar el array resultante.
 * 
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int[] num = new int[10];
		boolean primo = true;
		int i = 0;
		int x = 0;
		int y = 0;
		int temp = 0;
		
		System.out.println ("Este programa pedira 10 numeros por teclado y luego los ordenada, primero" + 
							"los primos y luego el resto.");
		
		System.out.println ("Introduce los numeros:");
		
		for (i = 0; i < 10; i++) {
			System.out.print (">>");
			num[i] = input.nextInt();
		}
		
		
		for (i = 0; i < 10; i++) {
			for (x = 2; x < num[i]; x++) {
				if ((num[i] % x) == 0)	
				primo = false;		
			}
		
			if (primo) {
				temp = num[y];
				num[y] = num[i];
				num[i] = temp;
				y++;
			}
			
			primo = true;
			
		}
		
		System.out.println ("\n\nArray ordenado:");
		System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
		System.out.print("│ Índice ");
		for (i = 0; i < 10; i++) System.out.printf("│%4d ", i);
		System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");		
		System.out.print("│ Valor  ");
		for (i = 0; i < 10; i++) System.out.printf("│%4d ", num[i]);
		System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
		
	}		
}
