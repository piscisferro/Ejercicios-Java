/**
 * Capitulo 7.1
 * 
 * Ejercicio 12
 * 
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array. A
 * continuación se mostrará el contenido de ese array junto al índice (0 – 9). Seguidamente el
 * programa pedirá dos posiciones a las que llamaremos “inicial” y “final”. Se debe comprobar
 * que inicial es menor que final y que ambos números están entre 0 y 9. El programa deberá
 * colocar el número de la posición inicial en la posición final, rotando el resto de números
 * para que no se pierda ninguno. Al final se debe mostrar el array resultante.
 * Por ejemplo, para inicial = 3 y final = 7:
 * 
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio12 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int[] num = new int[10];
		int[] numOrdenado = new int [10];
		int numInicial = 0;
		int numFinal = 0;
		int i = 0;
		int x = 0;
		int temp = 0;
		int temp2 = 0;
		
		System.out.println ("Introduce 10 numeros");
		
		for (i = 0; i < 10; i++) {
			System.out.print (">>");
			num[i] = input.nextInt();
		}
		
		do {
			
			System.out.println ("Introduce la posicion inicial (0-9)");
			numInicial = input.nextInt();
			
			if (numInicial < 0 || numInicial > 9) 
				System.out.println ("El numero introducido no es correcto.");
			
		} while (numInicial < 0 || numInicial > 9);
		
		do {
			
			System.out.println ("Introduce la posicion final (0-9)");
			numFinal = input.nextInt();
			
			if (numInicial <= numFinal || numFinal > 9) 
				System.out.println ("El numero introducido no es correcto.");
			
		} while (numInicial >= numFinal || numFinal > 9);
		
		
		System.out.println("Array Original:");
		System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
		System.out.print("│ Índice ");
		for (i = 0; i < 10; i++) System.out.printf("│%4d ", i);
		System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");		
		System.out.print("│ Valor  ");
		for (i = 0; i < 10; i++) System.out.printf("│%4d ", num[i]);
		System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
		
		// Programa
		
		for (i = 0; i < 10; i++) 
			numOrdenado[i] = num[i];
		
		numOrdenado[numFinal] = num[numInicial];
		
		
		for (i = numFinal+1; i < 10; i++) 
			numOrdenado[i] = num[i-1];
			
		numOrdenado[0] = num[9];
		
		for (i = 1; i <= numInicial; i++) 
			numOrdenado[i] = num[i-1];
		
		
		
		
		
		//  Fin del programa
		
		System.out.println("\n\nArray ordenado:");
		System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
		System.out.print("│ Índice ");		
		for (i = 0; i < 10; i++) System.out.printf("│%4d ", i);
		System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");		
		System.out.print("│ Valor  ");
		for (i = 0; i < 10; i++) System.out.printf("│%4d ", numOrdenado[i]);
		System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
		
		
		
	}		
}
