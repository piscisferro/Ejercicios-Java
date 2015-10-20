/**
 *  Capitulo 3
 * 
 * Ejercicio 8
 * 
 * Escribe un programa que calcule el salario semanal de un empleado en base a las horas
 * trabajadas, a razón de 12 euros la hora.
 * 
 *  @author Juan Jose Fernandez Romero
 */

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println ("Este programa calcula el salario semanal de un trabajador a razon de 12€ la hora");
		int precioHora = 12;
		
		System.out.println ("Indique el numero de horas trabajadas durante la semana.");
		int horas = entrada.nextInt();
		
		int salario = precioHora * horas;
		
		System.out.println ("El salario de la semana es de: " + salario + "€.");

	}
}
