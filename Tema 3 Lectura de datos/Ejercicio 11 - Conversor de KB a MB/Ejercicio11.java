/**
 *  Capitulo 3
 * 
 * Ejercicio 11
 * 
 * Realiza un conversor de Kb a Mb.
 * 
 *  @author Juan Jose Fernandez Romero
 */

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println ("Este programa es un conversor de Kb a Mb.");
		
		System.out.println ("Indique el los Kb");
		double Kb = entrada.nextDouble();
		
		double Mb = Kb * 0.0009765625;
		
		System.out.println (Kb + " Kb son: " + Mb + " Mb.");

	}
}
