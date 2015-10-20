/**
 * Capitulo 6
 * 
 * Ejercicio 3
 * 
 * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 48 cartas:
 * 2, 3, 4, 5, 6, 7, 8, 9, sota, caballo, rey y as.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int palo = 0;
		int carta = 0;
		
		
		System.out.println ("Este programa muestra al azar el nombre de una carta de la baraja española");
		input.nextLine();
		
		palo = (int) (Math.random()*4) + 1;
		carta = (int) (Math.random()*12) + 1;
		
		switch (carta) {
			case 10:
				System.out.print ("Sota");
				break;
				
			case 11:
				System.out.print ("Caballo");
				break;
				
			case 12: 
				System.out.print ("Rey");
				break;
				
			default:
		}
		
		if (carta > 0
		 && carta < 10)
			System.out.print ("El " + carta);
		
		switch (palo) {
			case 1:
				System.out.println (" de Espadas");
				break;
				
			case 2:
				System.out.println (" de Bastos");
				break;
				
			case 3:
				System.out.println (" de Copa");
				break;
				
			case 4: 
				System.out.println (" de Oro");
				break;
				
			default:
		}
		
	}
}
