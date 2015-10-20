/** 
 * Capitulo 7.2
 * 
 * Ejercicio 1
 * 
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num y asigna
 * los valores según la siguiente tabla. Muestra el contenido de todos los elementos del array
 * dispuestos en forma de tabla como se muestra en la figura.
 * 
 * @author: Juan Jose Fernandez Romero
 * 
 */

public class Ejercicio1 {
	public static void main (String[] args) {
		
		int[][] array = new int [3][6];
		
		array [0][0] = 0;
		array [0][1] = 30;
		array [0][2] = 2;
		array [0][5] = 5;
		array [1][0] = 75;
		array [1][4] = 0;
		array [2][2] = -2;
		array [2][3] = 9;
		array [2][5] = 11;
		
		System.out.print ("Fila 1:");
		
		for (int i : array[0]) {
			System.out.printf (" %2d ", i);
			System.out.print ("|");
		}
		
		System.out.print ("\nFila 2:");
		
		for (int i : array[1]) {
			System.out.printf (" %2d ", i);
			System.out.print ("|");
		}
		
		System.out.print ("\nFila 3:");
		
		for (int i : array[2]) {
			System.out.printf (" %2d ", i);
			System.out.print ("|");
		}

	}
}
