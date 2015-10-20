/**
 *  Capitulo 3
 * 
 * Ejercicio 10
 * 
 * Realiza un conversor de Mb a Kb.
 * 
 *  @author Juan Jose Fernandez Romero
 */

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println ("Este programa es un conversor de Mb a Kb.");
		
		System.out.println ("Indique el los Mb");
		double Mb = entrada.nextDouble();
		
		double Kb = Mb * 1024;
		
		System.out.println (Mb + " Mb son: " + Kb + " Kb.");

	}
}
