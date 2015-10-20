/** 
 * Capitulo 7.2
 * 
 * Ejercicio 9
 * 
 * Realiza un programa que sea capaz de rotar todos los elementos de una matriz cuadrada una
 * posición en el sentido de las agujas del reloj. La matriz debe tener 12 filas por 12 columnas
 * y debe contener números generados al azar entre 0 y 100. Se debe mostrar tanto la matriz
 * original como la matriz resultado, ambas con los números convenientemente alineados.
 * 
 * @author: Juan Jose Fernandez Romero
 * 
 */
 
public class Ejercicio9 {
	public static void main (String[] args) {
		
		String rojo = "\033[31m";
		String blanco = "\033[37m";
		String verde = "\033[32m";
		
		int[][] matriz = new int [12][12];
		int[][] matrizFinal = new int [12][12];
		int fila = 0;
		int columna = 0;
		int x = 0;
		int y = 0;
		
		// Genera la Matriz Original
		
		for (fila = 0; fila < 12; fila++) {
			for (columna = 0; columna < 12; columna++) {
				matriz[fila][columna] = (int)(Math.random() * 101);
			}
		}
		
		// Copia la Seccion 1 (superior) de la Matriz a la MatrizFinal
		
		
		
		for (fila = 0, x = 0; fila < 7; fila++, x++) {
			for (columna = (0 + x); columna < (12 - x); columna++) {
				if (columna < 11) {
					matrizFinal[fila][columna + 1] = matriz[fila][columna];
				}	
			}
		}
		
		
		
		// Copia la seccion 2 (inferior) de la Matriz a la MatrizFinal
		
		for (fila = 11, x = 1; fila > 5; fila--, x++) {
			for (columna = (0 + x); columna < (13 - x); columna++) {
				if (columna > 0 && columna < 12)  {
					matrizFinal[fila][columna - 1] = matriz[fila][columna];
				}
			}
		}
		
		
		
		// Copia la seccion 3 (izquierda) de la Matriz a la MatrizFinal
		
		
		for (columna = 0, y = 1; columna < 7; columna++, y++) {
			for (fila = (0 + y); fila < (13 - y); fila++) {
				if (fila > 0 && fila < 12) {
					matrizFinal[fila-1][columna] = matriz[fila][columna];
				}
			}
		}
		
		
		
		// copia la seccion 4 (derecha) de la matriz a la MatrizFinal
		
		for (columna = 11, y = 0; columna > 5; columna--, y++) {
			for (fila = 0 + y; fila < (11 - y); fila++) {
				if (fila > 0 && fila < 12) {
					matrizFinal[fila+1][columna] = matriz[fila][columna];
				}
			}
		}
		
		
		
		// Imprime la Matriz Original
		
		System.out.println ("\n\nMatriz Original");
		
		for (fila = 0; fila < 12; fila++) {
			System.out.print("\n|");
			for (columna = 0; columna < 12; columna++) {
				System.out.printf ("%3d", matriz[fila][columna]);
				System.out.print ("|");
			}
		}
		
		// Imprime la Matriz Final
		
		System.out.println ("\n\nMatriz Final");
		
		for (fila = 0; fila < 12; fila++) {
			System.out.print("\n|");
			for (columna = 0; columna < 12; columna++) {
				System.out.printf ("%3d", matrizFinal[fila][columna]);
				System.out.print ("|");
			}
		}
		
		System.out.println ();


	}
}
