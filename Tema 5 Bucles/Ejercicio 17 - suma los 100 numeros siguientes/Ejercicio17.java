/**
 * Capitulo 5
 * 
 * Ejercicio 17
 * 
 * Realiza un programa que sume los 100 números siguientes a un número entero y positivo
 * introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un
 * número positivo).
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Este programa suma los 100 numeros siguiente al numero introducido");
		System.out.println ("Introduce el numero");
		
		int numero = input.nextInt ();
		int resultado = 0;
		
		// Despues de terminar el programa y para comprobar este bucle he decicido irme a los ejercicios resuelto
		// Y he llegado a la conclusion de que el bucle del ejercicio resuelto esta mal planteado puesto que
		// el ejercicio da a entender que sumes a un numero entero los 100 siguientes numeros. El ejercicio resuelto
		// suma los 100 siguientes en orden (el anterior con el actual)
				
		// Asi que este bucle es mi interpretacion del ejercicio: 
		for (int i = (numero + 1); i <= (numero + 100); i++)  // (numero + 1) porque estamos sumando el siguiente con el introducido.
			resultado += i;
			
		System.out.println (resultado);
	}
}
