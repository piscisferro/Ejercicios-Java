/**
 * 
 * Capitulo 4
 * 
 * Ejercicio 3
 * 
 * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre
 * del día de la semana.
 * 
 */

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println ("Escriba un numero del 1 al 7 para saber que dia es");
		
		int dia = entrada.nextInt();
		
		switch (dia) {
			
			case 1:
			System.out.println ("Lunes.");
			break;
			
			case 2:
			System.out.println ("Martes.");
			break;
			
			case 3:
			System.out.println ("Miercoles.");
			break;
			
			case 4:
			System.out.println ("Jueves.");
			break;
			
			case 5:
			System.out.println ("Viernes.");
			break;
			
			case 6:
			System.out.println ("Sabado.");
			break;
			
			case 7:
			System.out.println ("Domingo.");
			break;
			
			default:
			System.out.println ("El numero introducido no es valido");
		}
		
	}
}
