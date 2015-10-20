/**
 * Capitulo 6
 * 
 * Ejercicio 7
 * 
 * Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los
 * 14 partidos y el pleno al quince (15 filas).
 *
 * @author Juan Jose Fernandez Romero 
 */

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int resultadoPartido;
		
		System.out.println ("Este programa muestra el resultado de una quiniela aleatoriamente.");

		
		for (int fila = 1; fila <= 15; fila++) {
			System.out.printf("%3d. |", fila);
			
			for (int apuesta = 1; apuesta <= 3; apuesta++) {
				resultadoPartido = (int)(Math.random() * 3) + 1;
				switch(resultadoPartido) {
					case 1: 
						System.out.print("1  |"); 
						break;
					case 2: 
						System.out.print("  2|"); 
						break;
					case 3: 
						System.out.print(" X |");
				}
			}
			
			System.out.println();

		}
	}
}
