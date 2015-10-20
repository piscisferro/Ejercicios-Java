/**
 * Capitulo 7.1
 * 
 * Ejercicio 9
 * 
 * Realiza un programa que pida 8 números enteros y que luego muestre esos números junto
 * con la palabra “par” o “impar” según proceda.
 * 
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int[] num = new int[8];
		int i = 0;
		
		System.out.println ("Este programa mostrara los numeros introducidos" +
							"junto a la palabra par o impar");
		
		System.out.println ("Introduce los numeros");
		
		for (i = 0; i < 8; i++) {
			System.out.print(">>");
			num[i] = input.nextInt();
		}
		
		for (i = 0; i < 8; i++) {
			if (num[i] % 2 == 0) {
				System.out.println (num[i] + " <--Par");
			} else {
				System.out.println (num[i] + " <--Impar");
			}
		}
	}		
}
