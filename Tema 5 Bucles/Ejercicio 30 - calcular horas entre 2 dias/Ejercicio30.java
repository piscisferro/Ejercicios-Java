/**
 * Capitulo 5
 * 
 * Ejercicio 30
 * 
 * Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de
 * la semana. No se tendrán en cuenta los minutos ni los segundos. El día de la semana se
 * puede pedir como un numero (del 1 al 7) o como una cadena (de lunes a domingo). Se
 * debe comprobar que el usuario introduce los datos correctamente y que el segundo día es
 * posterior al primero. A continuación se muestra un ejemplo:
 *  
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio30 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int hora = 0;
		int numDia = 0;
		int hora2 = 0;
		int numDia2 = 0;
		String primerDia;
		String segundoDia;
		
		System.out.println ("Este programa calculara las horas entre los dos dias introducidos siempre que sea un dia posterior");				
		
		// Recogida del primer dia
		
		do {			
			System.out.println ("Introduce el primer dia (tanto caracteres como numero)");
			System.out.print("Dia: ");
			primerDia = input.nextLine().toLowerCase();	
			
		
			switch (primerDia) {
				case "lunes":
				case "1":
					numDia = 1;
					break;
			
				case "martes":
				case "2":
					numDia = 2;
					break;
			
				case "miercoles":
				case "3":
					numDia = 3;
					break;
			
				case "jueves":
				case "4":
					numDia = 4;
					break;
			
				case "viernes":
				case "5":
					numDia = 5;
					break;
			
				case "sabado":
				case "6":
					numDia = 6;
					break;
			
				case "domingo":
				case "7":
					numDia = 7;
					break;
			
				default:
					numDia = 0;
				}
				
				if (numDia <= 0) {
					System.out.println("Error, el dato se ha introducido mal");
				}
			
			} while (numDia <= 0);
		
		// Recogida de la hora del primer dia
		
		do {											
			System.out.println ("Introduce la hora (en horas)");
			System.out.print("Hora: ");
			hora = input.nextInt();		
			if (hora < 0 || hora > 24 ) {
					System.out.println ("La hora se ha introducido mal, recuerda introduci un numero entre 0 y 24");
			}
		} while (hora < 0 || hora > 24 );
		
		// Recogida del segundo dia
		
		do {			
			System.out.println ("Introduce el segundo dia (tanto caracteres como numero)");
			System.out.print("Dia: ");
			segundoDia = input.next().toLowerCase();				
		
			switch (segundoDia) {
				case "lunes":
				case "1":
					numDia2 = 1;
					break;
			
				case "martes":
				case "2":
					numDia2 = 2;
					break;
			
				case "miercoles":
				case "3":
					numDia2 = 3;
					break;
			
				case "jueves":
				case "4":
					numDia2 = 4;
					break;
			
				case "viernes":
				case "5":
					numDia2 = 5;
					break;
			
				case "sabado":
				case "6":
					numDia2 = 6;
					break;
			
				case "domingo":
				case "7":
					numDia2 = 7;
					break;
			
				default:
					numDia2 = 0;
				}
				
				if (numDia2 <= numDia) {
					System.out.println("El segundo dia no corresponde a un dia siguiente o se ha introducido mal");
				}
			
			} while (numDia2 <= numDia);
			
			// Recogida de la hora del segundo dia
			
			do {											
				System.out.println ("Introduce la hora del segundo dia  (en horas)");
				System.out.print("Hora: ");
				hora2 = input.nextInt();
				
				if (hora2 < 0 || hora2 > 24 ) {
					System.out.println ("La hora se ha introducido mal, recuerda introduci un numero entre 0 y 24");
				}
						
		} while (hora2 < 0 || hora2 > 24 );
		
		// Se acabo recoger datos!!
		
		System.out.print("Entre las " + hora + ":00h del " + primerDia);
		System.out.print(" y las " + hora2 + ":00h del " + segundoDia);
		System.out.println(" hay " + (((numDia2 * 24) + hora2) - ((numDia * 24) + hora)) + " horas.");

		
		
	}
}
