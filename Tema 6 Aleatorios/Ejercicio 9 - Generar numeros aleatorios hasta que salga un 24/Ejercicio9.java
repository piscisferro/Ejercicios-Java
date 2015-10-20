/**
 * Capitulo 6
 * 
 * Ejercicio 9
 * 
 * Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no
 * termine de generar números hasta que no saque el 24. El programa deberá decir al final
 * cuántos números se han generado.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int numero = 0;
		int muchosNumeros = 0;
		
		
		System.out.print ("Este programa genera numeros entre 0 y 100 hasta coincidir con el 24" + 
							"\ndespues dira cuantos numeros ha generado hasta llegar a 24");
		input.nextLine();
		
		
		
		while (numero != 24) {
			numero = (int)(Math.random() * 101);
			muchosNumeros++;
		}
		
		System.out.println ("El programa ha generado " + muchosNumeros + " hasta llegar a 24");
		
	}
}
