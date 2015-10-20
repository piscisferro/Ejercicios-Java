/**
 * Capitulo 4
 * 
 * Ejercicio 11
 * 
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule los
 * segundos que faltan para llegar a la medianoche.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Este programa calcula los segundos que faltan para medianoche.");
		System.out.println ("Introduce la hora (no minutos y en formato 24h)");
		
		int hora = input.nextInt();
		
		System.out.println ("Introduce los minutos.");
		
		int minutos = input.nextInt();
		
		int segundosMediaNoche = (24 * 360) - ((hora * 360) + (minutos * 60))
		
		System.out.println ("¡Faltan " + segundosMediaNoche + " segundos para medianoche!")
		
		if (segundosMediaNoche == 0) {
			System.out.println ("¡Ya es medianoche!");
		}
	}
}
		
