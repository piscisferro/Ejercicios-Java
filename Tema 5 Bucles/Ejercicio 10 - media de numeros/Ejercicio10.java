/**
 * Capitulo 5
 * 
 * Ejercicio 10
 * 
 * Escribe un programa que calcule la media de un conjunto de números positivos introduci-
 * dos por teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario
 * indicará que ha terminado de introducir los datos cuando meta un número negativo.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Este programa calculara la media de los numeros introducidos");
		System.out.println ("Introduce los numeros, cuando finalize, introduzca un numero negativo.");
		
		int media = 0;
		int suma = 0;
		int i = 0;
		double numeroFinal = 0;
		
		while (i >= 0) {
			
			suma = i + suma;
			media++;
			i = input.nextInt ();	
		}
		
		media--; // El bucle suma 1 de "media" de mas (al introducir el numero negativo), asi que aqui se lo quito. 
				// Podria haber puesto un If o una variable mas para guardar el input pero me ha parecido mas comodo asi. 
		numeroFinal = suma / media;
		
		System.out.println ("La media es: " + numeroFinal);
	}
}
