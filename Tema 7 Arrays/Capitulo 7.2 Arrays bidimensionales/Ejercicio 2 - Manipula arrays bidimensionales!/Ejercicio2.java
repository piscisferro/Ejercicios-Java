/** 
 * Capitulo 7.2
 * 
 * Ejercicio 2
 * 
 * Escribe un programa que pida 20 números enteros. Estos números se deben introducir en
 * un array de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y
 * columnas igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la
 * esquina inferior derecha.
 * 
 * @author: Juan Jose Fernandez Romero
 * 
 */

public class Ejercicio2 {
	public static void main (String[] args) {
		
		int[][] array = new int [5][6];
		
		
		System.out.println ("Introduce 20 numeros, estos numeros se iran rellenando en fila");
		System.out.println ("Primera fila (5 numeros)");
		
		// Primera Linea (Se aprovecha el mismo bucle para sumar la linea)		
		for (int i = 0; i < 5; i++) {
			array[0][i] = Integer.parseInt(System.console().readLine()); 
			array[0][5] += array[0][i];
		}
		
		// Segunda Linea (Se aprovecha el mismo bucle para sumar la linea)
		System.out.println ("Segunda fila (5 numeros)");
		
		for (int i = 0; i < 5; i++) {
			array[1][i] = Integer.parseInt(System.console().readLine()); 
			array[1][5] += array[1][i];
		}
		
		// Tercera Linea (Se aprovecha el mismo bucle para sumar la linea)
		System.out.println ("Tercera fila (5 numeros)");
		
		for (int i = 0; i < 5; i++) {
			array[2][i] = Integer.parseInt(System.console().readLine()); 
			array[2][5] += array[2][i];
		}
		
		// Cuarta Linea (Se aprovecha el mismo bucle para sumar la linea)
		System.out.println ("Cuarta fila (5 numeros)");
		
		for (int i = 0; i < 5; i++) {
			array[3][i] = Integer.parseInt(System.console().readLine()); 
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
