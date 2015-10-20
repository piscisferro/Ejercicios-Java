/**
 * Capitulo 5
 * 
 * Ejercicio 15
 * 
 * Escribe un programa que dados dos números, uno real (base) y un entero positivo
 * (exponente), saque por pantalla todas las potencias con base el numero dado y exponentes
 * entre uno y el exponente introducido. No se deben utilizar funciones de exponenciación.
 * Por ejemplo, si introducimos el 2 y el 3, se deberán mostrar 2¹, 2², 2³.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
				
		System.out.println ("Este programa calcula un numero elevado a una potencia y ademas muestra todos los numeros hasta esa potencia");
		System.out.println ("Introduce el numero base");
		
		int base = input.nextInt();
		int resultado = base;
		
		System.out.println ("Introduce la potencia a la que se elevara el numero, solo numeros positivos");
		
		int potencia = input.nextInt();
		
		System.out.println ("_______"); // Para separar en la consola los numeros introducidos de los resultados
		
		for (int i = 1; i <= potencia; i++) {
			
			System.out.println (resultado);
			
			resultado = resultado * base;
			
		}
		
		if (potencia == 0) {
			
			System.out.println ("1");
			
		}					
	}
}
