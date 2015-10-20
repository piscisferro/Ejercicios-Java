/**
 * 
 * Capitulo 4
 * 
 * Ejercicio 4
 * 
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas
 * extras. Escribe un programa que calcule el salario semanal de un trabajador teniendo en
 * cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora.
 * A partir de la hora 41, se pagan a 16 euros la hora.
 * 
 */

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println ("Este programa calcula el salario semanal de un trabajador a razon de 12€ la hora");
		System.out.println ("A partir de 40 horas el trabajador cobrara 16€ hora.");
		int precioHora = 12;
		int precioHoraExtra = 16;
		int salario = 0;
		
		
		System.out.println ("Indique el numero de horas trabajadas durante la semana.");
		int horas = entrada.nextInt();
		
		if (horas <= 40) {
			salario = precioHora * horas;
			System.out.println ("El salario de la semana es de: " + salario + "€.");
		}
		
		if (horas > 40) {
			salario = (precioHora * 40) + (precioHoraExtra * (horas - 40));
			System.out.println ("El salario de la semana es de: " + salario + "€.");
		}
	}
}
