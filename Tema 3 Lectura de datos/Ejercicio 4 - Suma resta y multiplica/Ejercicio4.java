/** 
 * Capitulo 3
 * 
 * Ejercicio4 
 *
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 * 
 * @author Juan José Fernández Romero
 */

import java.util.Scanner;

public class Ejercicio4 {
	public static void main (String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println ("Introduzca un numero");
		double primerNumero = entrada.nextDouble();
		
		System.out.println ("Introduza un segundo numero");
		double segundoNumero = entrada.nextDouble();
		
		double suma = primerNumero + segundoNumero;
		double resta = primerNumero - segundoNumero;
		double multiplicacion = primerNumero * segundoNumero;
		double division = primerNumero / segundoNumero;
		
		System.out.println ("La suma entre " + primerNumero + " y " + segundoNumero + " es " + suma);
		System.out.println ("La resta entre " + primerNumero + " y " + segundoNumero + " es " + resta);
		System.out.println ("El producto entre " + primerNumero + " y " + segundoNumero + " es " + multiplicacion);
		System.out.println ("La division entre " + primerNumero + " y " + segundoNumero + " es " + division);
	}
}

		
