/**
 * Capitulo 7.1
 * 
 * Ejercicio 8
 * 
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de un
 * determinado año y que muestre a continuación un diagrama de barras horizontales con
 * esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro
 * caracter.
 * 
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		String[] mes = { "Enero", "Febrero", "Marzo", "Abril", 
						"Mayo", "Junio", "Julio", "Agosto",
						"Septiembre", "Octubre", "Noviembre", "Diciembre"};
						
		int[] temperatura = new int [12];
		int i = 0;
		
		System.out.println ("Este programa hara un diagrama de barras horizontal con la temperatura media" + 
							"de cada mes en malaga");
							
		System.out.println ("Introduce la temperatura");
		
		
		
		for (i = 0; i < 12; i++) {
			System.out.println (">>" + mes[i]);
			temperatura[i] = input.nextInt();
		}
		
		for (i = 0; i < 12; i++) {
			System.out.printf ("\n%10s", mes[i]);
			System.out.printf ("||");
		
			
			for (int x = 0; x < temperatura[i]; x++) {
				System.out.print ("#");
			}
		}
	}		
}
