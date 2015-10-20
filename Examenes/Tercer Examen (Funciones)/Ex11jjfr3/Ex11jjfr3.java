/**
 * Examen
 * 
 * Ejercicio 3
 * 
 * Se dice que una matriz cuadrada – tiene el mismo número de filas que de columnas - es triangular
 * superior cuando todos los valores que están por debajo de la diagonal principal son cero. Por ejemplo,
 * la siguiente matriz es triangular superior:
 * 2 7 5
 * 0 4 1
 * 0 0 8
 * Realiza una función que diga si una matriz dada es o no triangular superior y pruébala en un
 * programa. Recuerda que si la matriz no es cuadrada, se puede concluir directamente que no es
 * triangular superior, sin hacer ningún otro tipo de comprobación. La cabecera de la función es la
 * siguiente:
 * public static boolean esTriangularSuperior(int[ ][ ] a)
 *
 * @author Juan Jose Fernandez Romero 
 */

import matematicas.Varias;
import arrays.ArraysBi;
import arrays.ArraysUni;

public class Ex11jjfr3 {
	public static void main(String[] args) {
		
		int matriz[][] = new int [4][4];
		boolean triangularSuperior = false;
		int alto = matriz.length;
		int ancho = matriz[0].length;
		
		// Esta parte solo para testeo relena la matriz en triangulo
		
		for (int i = 0; i < matriz.length; i++) {
				matriz[0][i] = 1;
		}
		
		for (int i = 1; i < matriz.length; i++) {
				matriz[1][i] = 1;
		}
		
		for (int i = 2; i < matriz.length; i++) {
				matriz[2][i] = 1;
		}
		
		for (int i = 3; i < matriz.length; i++) {
				matriz[3][i] = 1;
		}
		
		arrays.ArraysBi.muestraArrayIntBi (matriz);
		
		/////////////
		
		if (alto != ancho) {
			
			System.out.println ("La matriz no es cuadrada!");
			
		} else {
			
			triangularSuperior = esTriangularSuperior(matriz);
			
		}
		
		System.out.println (triangularSuperior);
		
		
		
	}
	
	public static boolean esTriangularSuperior(int matriz[][]) {
		
		boolean flag = false;
		
		for (int i = 1, j = 0; i < matriz.length; i++, j++) {
			for (int x = 0; x <= j; x++) {
				if (matriz[i][x] != 0) {
					return false;
				}
				
			}
		}
		
		return true;
		
		
		
	}
}


