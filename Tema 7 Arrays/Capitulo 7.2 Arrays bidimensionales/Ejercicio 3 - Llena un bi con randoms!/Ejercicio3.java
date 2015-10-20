/** 
 * Capitulo 7.2
 * 
 * Ejercicio 3
 * 
 * Modifica el programa anterior de tal forma que los números que se introducen en el array
 * se generen de forma aleatoria (valores entre 100 y 999).
 * 
 * @author: Juan Jose Fernandez Romero
 * 
 */

public class Ejercicio3 {
	public static void main (String[] args) {
		
		int[][] array = new int [5][6];
		
		
		System.out.println ("Este programa generara 20 numeros aleatorios en una tabla y calculara las sumas"
												+ "en la ultima fila y en la ultima columna");
		
		
		// Primera Linea (Se aprovecha el mismo bucle para sumar la linea)		
		for (int i = 0; i < 5; i++) {
			array[0][i] = (int)((Math.random() * 999) + 100);  
			array[0][5] += array[0][i];
		}
		
		// Segunda Linea (Se aprovecha el mismo bucle para sumar la linea)
	
		
		for (int i = 0; i < 5; i++) {
			array[1][i] = (int)((Math.random() * 999) + 100); 
			array[1][5] += array[1][i];
		}
		
		// Tercera Linea (Se aprovecha el mismo bucle para sumar la linea)
		
		
		for (int i = 0; i < 5; i++) {
			array[2][i] = (int)((Math.random() * 999) + 100); 
			array[2][5] += array[2][i];
		}
		
		// Cuarta Linea (Se aprovecha el mismo bucle para sumar la linea)
		
		
		for (int i = 0; i < 5; i++) {
			array[3][i] = (int)((Math.random() * 999) + 100); 
			array[3][5] = array[3][5] + array[3][i];
		}
		
		// Se suma la primera columna
		
		for (int i = 0; i < 4; i++) {
			array[4][0] += array[i][0];
		}
		
		// Se suma la segunda columna
		
		for (int i = 0; i < 4; i++) {
			array[4][1] += array[i][1];
		}
		
		// Se suma la tercera columna
		
		for (int i = 0; i < 4; i++) {
			array[4][2] += array[i][2];
		}
		
		// Se suma la cuarta columna
		
		for (int i = 0; i < 4; i++) {
			array[4][3] += array[i][3];
		}
		
		// Se suma la quinta columna
		
		for (int i = 0; i < 4; i++) {
			array[4][4] += array[i][4];
		}
		
		// Se suma el total
		/** Primero la columna final */
		for (int i = 0; i < 4; i++) {
			array[4][5] += array[i][5];
		}
		
		/**Ahora la fila final*/
		
		for (int i : array[4]) {
			array[4][5] += i;
		}
		
		array[4][5] /= 2; // Esto es porque en el Foreach hace que dé de resultado el doble
		
		// Se muestra toda la tabla y el array
		
		for (int n = 0; n < 5; n++) {
			System.out.println ();
			System.out.print ("Fila " + n + ":");
			for (int i : array[n]) {					
				System.out.printf (" %8d ", i);
				System.out.print ("|");
			}
		}
	}
}
