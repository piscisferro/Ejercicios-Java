/**
 * Capitulo 4
 * 
 * Ejercicio 18
 * 
 * Escribe un programa que diga cuál es la primera cifra de un número entero introducido
 * por teclado. Se permiten números de hasta 5 cifras.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio18 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Este programa dice la primera cifra de un numero de maximo 5 cifras");
		
		System.out.println ("Introduce un numero");
		
		int numero = input.nextInt();
		int cifra = 0;
		
		if (numero > 9 && numero < 100) {
			
			cifra = numero / 10;
			
		}else if (numero > 99 && numero < 1000) {
			
			cifra = numero / 100;
			
		}else if (numero > 999 && numero < 10000) {
			
			cifra = numero / 1000;
			
		}else if (numero > 9999 && numero < 100000) {
			
			cifra = numero / 10000;
		
		}else if (numero >= 100000) {
			
			System.out.println ("El numero es mayor de 5 cifras.");
			
		}else {
			System.out.println ("el numero: " + numero + " es ya de 1 cifra.");
		}
		
		if (cifra > 0) {
			
			System.out.println ("La primera cifra del numero introducido es: " + cifra);
			
		}
	}
}
