/**
 * 
 * Capitulo 4
 * 
 * Ejercicio 2
 * 
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas
 * tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21
 * a 5. respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir
 * por teclado.
 * 
 */

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println ("Introduce una hora en formato numerico ej: Para las 5 de la tarde: 17");
		
		int Hora = entrada.nextInt();
		
		if (Hora >= 6 && Hora <= 12) {
			System.out.println ("Buenos dias");
		}
		
		if (Hora >= 13 && Hora <= 20) {
			System.out.println ("Buenas tardes");
		}
		
		if (Hora >= 21 || Hora <= 5) {
			System.out.println ("Buenas noches");
		}		
	}
}
