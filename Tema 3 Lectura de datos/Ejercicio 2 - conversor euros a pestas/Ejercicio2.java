/** 
 * Capitulo 3
 * 
 * Ejercicio2
 * 
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se
 * quiere convertir debe ser introducida por teclado.
 * 
 * @author Juan Jose Fernandez Romero
 */

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println ("Introduzca la cantidad en euros que desea convertir");
		float euros = entrada.nextF6loat();
		
		double pesetas = euros * 166.386;
		System.out.println (euros + " euro son " + pesetas + " pesetas");
	}
}
		
