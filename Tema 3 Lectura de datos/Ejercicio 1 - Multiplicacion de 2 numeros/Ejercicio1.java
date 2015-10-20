/**
 * Capitulo 3
 * 
 * Ejercicio 1
 * 
 * Realiza un programa que pida dos números y que luego muestre el resultado de su
 * multiplicación.
 * 
 * @author Juan Jose Fernandez Romero
 */

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero: ");
		int primerNumero = entrada.nextInt();
		
		System.out.println("Introduzca un segundo numero entero: ");
		int segundoNumero = entrada.nextInt();
		
		int resultado = primerNumero * segundoNumero;
		System.out.println("La multiplicacion entre " + primerNumero + " y " + segundoNumero + " es: " + resultado);
		
	}
}
		
		
