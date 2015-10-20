/**
 * Capitulo 5
 * 
 * Ejercicio 21
 * 
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un numero
 * negativo y nos diga cuantos números se han introducido, la media de los impares y el mayor
 * de los pares. El número negativo sólo se utiliza para indicar el final de la introducción de
 * datos pero no se incluye en el cómputo.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio21 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int numero = 0;
		int mayor = 0;
		int suma = 0;
		int impares= 0;
		int media = 0;

		
		System.out.println ("Este programa podremos introducir numeros enteros y nos dira:");
		System.out.println ("- La media de los numeros impares \n- El mayor de los numeros pares");
		
		while (numero >= 0) {
			System.out.println ("Introduce un numero, use un numero negativo para salir");
			numero = input.nextInt ();
			
			if (numero > 0 && (numero % 2) == 0) {
				if (numero > mayor) {
					mayor = numero;
				}
			} else if (numero > 0 && (numero % 2) != 0) {
				suma += numero;
				impares++;
			}
		}
		
		System.out.println ("El mayor de los pares es: " + mayor);
		
		if (impares > 0) {
			media = suma / impares;
			System.out.println ("La media de los impares es: " + media);
		} else {
			System.out.println ("No has introducido numeros impares");
		}
		
		
	}
}
