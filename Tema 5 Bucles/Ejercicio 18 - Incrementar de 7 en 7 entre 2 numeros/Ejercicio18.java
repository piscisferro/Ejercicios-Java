/**
 * Capitulo 5
 * 
 * Ejercicio 18
 * 
 * Escribe un programa que obtenga los números enteros comprendidos entre dos números
 * introducidos por teclado y validados como distintos, el programa debe empezar por el
 * menor de los enteros introducidos e ir incrementando de 7 en 7.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio18 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int primerNumero = 0;
		int segundoNumero = 0;
		int temp = 0;
		
		System.out.println ("Este programa con 2 numeros introducidos te dice los numeros que hay entre ellos de 7 en 7");
		
		do {
			System.out.println ("Introduce el primer numero entero");
		
			primerNumero = input.nextInt();
		
			System.out.println ("Introduce el segundo numero entero");
		
			segundoNumero = input.nextInt();
		
			if (temp == segundoNumero) 
				System.out.println ("Los numeros son iguales.");
		
		} while (temp == segundoNumero);
		
		if (primerNumero > segundoNumero) {
			temp = segundoNumero;
			segundoNumero = primerNumero;		
			primerNumero = temp;	
		}
		
		for (int i = primerNumero; i < segundoNumero; i+=7)  {
			if (i != primerNumero)
				System.out.println (i);
		}		
	}
}
