/**
 * Capitulo 7.1
 * 
 * Ejercicio 7
 * 
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre
 * por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores
 * y a continuación cambiará todas las ocurrencias del primer valor por el segundo en
 * la lista generada anteriormente. Los números que se han cambiado deben aparecer
 * entrecomillados.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int[] num = new int[100];
		int[] digito = new int [2];
		int primerNumero = 0;
		int segundoNumero = 0;
		String rojo = "\033[31m";
		String blanco = "\033[37m";
		int i = 0;
		
		System.out.println ("Este programa pedira dos numeros y luego sustituira las ocurrencias del primer numero" + 
							"por el valor del segundo numero");
		
		System. out.println ("Array Original");
		
		for (i = 0; i < 100; i++) {
			num[i] = (int)(Math.random() * 20);
			System.out.print (num[i] + " ");
		}
		
		System.out.println ("\nIntroduce el primer numero");
		
		primerNumero = input.nextInt ();
		
		System.out.println ("Introduce el segundo numero");
		
		segundoNumero = input.nextInt ();
		
		for (i = 0; i < 100; i++) 
			if (num[i] == primerNumero)	{
				System.out.print (rojo + "\"" + segundoNumero + "\" " + blanco);
			} else {
				System.out.print (num[i] + " ");
			}
			
			
		}
	}

