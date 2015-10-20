/** 
 * Capitulo 3
 * 
 * Ejercicio3
 * 
 * Realiza un conversor de pesetas a euros. La cantidad de euros que se
 * quiere convertir debe ser introducida por teclado.
 * 
 * @author Juan Jose Fernandez Romero
 */

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println ("Introduzca la cantidad, en pesetas, que desea convertir");
		int pesetas = entrada.nextInt();
		
		double euros = pesetas * 0.006;
		System.out.println (pesetas + " pesetas son " + euros + " euros");
	}
}
