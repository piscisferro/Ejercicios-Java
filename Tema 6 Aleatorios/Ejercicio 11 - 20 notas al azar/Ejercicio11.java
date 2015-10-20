/**
 * Capitulo 6
 * 
 * Ejercicio 11
 * 
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de
 * la forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número
 * de suspensos, el número de suficientes, el número de bienes, etc.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int nota = 0;
		int suspenso = 0;
		int suficiente = 0;
		int bien = 0;
		int notable = 0;
		int sobresaliente = 0;
		
		
		System.out.println ("Este programa muestra 20 notas generadas al azar");
		input.nextLine();
		
		for (int i = 0; i < 20; i++) {
			nota = (int)(Math.random() * 11);
			
			if (nota < 5) {
				suspenso++;
				System.out.println ("suspenso");
			}
			
			if (nota >= 5 && nota < 6) {
				suficiente++;
				System.out.println ("suficiente");
			}
			
			if (nota >= 6 && nota < 7) {
				bien++;
				System.out.println ("bien");
			}
			
			if (nota >= 7 && nota < 9) {
				notable++;
				System.out.println ("notable");
			}
			
			if (nota >= 9 && nota <= 10) {
				sobresaliente++;
				System.out.println ("sobresaliente");
			}
			
		}
		
		System.out.println ("\nHay un total de:\n" + suspenso + " suspensos " +
							"\n" + suficiente + " suficientes" + 
							"\n" + bien + " bien" +
							"\n" + notable + " notables" +
							"\n" + sobresaliente + " sobresalientes");
		
	}
}
