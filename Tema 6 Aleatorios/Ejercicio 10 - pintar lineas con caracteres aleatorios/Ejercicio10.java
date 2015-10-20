/**
 * Capitulo 6
 * 
 * Ejercicio 10
 * 
 * Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. Las líneas
 * deben tener una longitud aleatoria entre 1 y 40 caracteres. Estos caracteres podrán ser uno
 * de los siguientes: *, -, =, ., |, @
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int numero = 0;
		char caracter = ' ';
		
		System.out.print ("Este programa pinta una linea entre 1 y 40 caracteres con un caracter especial aleatorio");
		input.nextLine();
		
		numero = (int)(Math.random()*6 + 1);
		
		switch (numero) {
			case 1:
				caracter = '*';
				break;
			case 2:
				caracter = '-';
				break;
			case 3:
				caracter = '=';
				break;
			case 4:
				caracter = '.';
				break;
			case 5:
				caracter = '|';
				break;
			case 6:
				caracter = '@';
				break;
		}
		
		numero = (int)(Math.random() * 101);
		
		for (int i = (int)(Math.random() * 40 + 1); i > 0; i--) {
			System.out.print (caracter);
		}
	}
}
