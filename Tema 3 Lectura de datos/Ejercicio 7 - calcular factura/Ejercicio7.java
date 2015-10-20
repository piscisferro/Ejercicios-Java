/**
 *  Capitulo 3
 * 
 * Ejercicio 7
 * 
 * Escribe un programa que calcule el total de una factura a partir de 
 * la base imponible.
 * 
 *  @author Juan Jose Fernandez Romero
 */

import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println ("Este programa calcula el total de una factura y le añade la base imponible.");
		
		//Para el ejemplo pondre solo 3 apuntes de factura
		
		System.out.println ("Indique el valor del primer apunte.");
		double apunte1 = entrada.nextDouble();
		
		System.out.println ("Indique el valor del segundo apunte.");
		double apunte2 = entrada.nextDouble();
		
		System.out.println ("Indique el valor del tercer apunte.");
		double apunte3 = entrada.nextDouble();
		
		System.out.println ("Indique el valor de la base imponible en porcentaje.");
		double baseImponible = entrada.nextDouble();
		baseImponible = baseImponible / 100;
		
		double totalSinIVA = apunte1 + apunte2 + apunte3;
		double totalConIVA = totalSinIVA + (totalSinIVA * baseImponible);
		
		System.out.println ("El total de la factura sin base imponible es de: " + totalSinIVA);
		System.out.println ("El total de la factura con base imponible es de: " + totalConIVA);
		
	}
}
