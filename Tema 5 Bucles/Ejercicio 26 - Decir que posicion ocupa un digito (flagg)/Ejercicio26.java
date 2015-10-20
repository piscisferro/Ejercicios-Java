/**
 * Capitulo 5
 * 
 * Ejercicio 26
 * 
 * Realiza un programa que pida primero un número y a continuación un dígito. El programa
 * nos debe dar la posición (o posiciones) contando de izquierda a derecha que ocupa ese
 * dígito en el número introducido.
 * 
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio26 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);	
		
		int posicion = 0;
		int numeroInverso = 0;
		int operacion = 0;
		
		System.out.println ("Este programa pedira un numero y despues un digito y nos dira" +
												"\nEn que posicion esta (de izquierda a derecha)");
												
		System.out.println ("Introduce el numero (real)");
		int numero = input.nextInt();
		
		System.out.println ("Introduce un numero para el digito (real y solo 1 digito)");
		int digito = input.nextInt();
		
		System.out.println ("El digito " + digito + " esta en las siguientes posiciones:");
		
		while (numero > 0) {
			numeroInverso = (numeroInverso * 10) + (numero % 10);
			numero = numero / 10;
		}
		
		while (numeroInverso > 0) {
			operacion = numeroInverso % 10;
			numeroInverso = numeroInverso / 10;
			posicion++;
			
			if (operacion == digito) {
				System.out.print (posicion + ", ");
			}
		}				
	}
}
