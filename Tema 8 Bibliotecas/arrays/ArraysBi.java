/**
 * Biblioteca con funciones de Arrays Bidimensionales.
 *
 * @author Juan Jose Fernandez Romero 
 */

package arrays;

public class ArraysBi {
	
	/**
	 * Devuelve el número de filas de un array bidimensional de números enteros.
	 *
	 * @param x un array bidimensional de números enteros
	 * @return número de filas del array
	 */
	 
	public static int filasArrayIntBi(int x[][]) {
		return x.length;
	}
	
	
	
	/**
	 * Devuelve el número de columnas de un array bidimensional de números enteros.
	 *
	 * @param x un array bidimensional de números enteros
	 * @return número de columnas del array
	 */
	
	public static int columnasArrayIntBi(int x[][]) {
		return x[0].length;
	}
	
	
	
	
	/**
	 * Devuelve el máximo de un array bidimensional de números enteros.
	 *
	 * @param x un array bidimensional de números enteros
	 * @return el valor máximo encontrado en el array
	 */

	public static int maximoArrayIntBi(int x[][]) {
		
		int maximo = Integer.MIN_VALUE;
		
		for (int i = 0; i < filasArrayIntBi(x); i++) {
			for (int j = 0; j < columnasArrayIntBi(x); j++) {
				if (x[i][j] > maximo) {
					maximo = x[i][j];
				}
			}
		}
		return maximo;
	}
	
	
	/**
	 * 
	 * copiaArrayBiInt genera una copia del array que se pasa como parametro
	 * 
	 * @param array bidimensional que se quiere copiar.
	 * @return array[][] bidimensional entero
	 */
	 
	public static int[][] copiaArrayBiInt (int[][] array) {
		
		int[][] copia = new int[array.length][array[0].length];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				
				copia[i][j] = array[i][j];
				
			}
		}
		
		return copia;
		
		
	}
	

	/**
	 * Muestra por pantalla el contenido de un array bidimensional de números enteros.
	 *
	 * @param x un array bidimensional de números enteros
	 */
	
	public static void muestraArrayIntBi(int x[][]) {
		
		for (int i = 0; i < filasArrayIntBi(x); i++) {
			
			for (int j = 0; j < columnasArrayIntBi(x); j++) {
				
			System.out.printf(x[i][j] + " ");
			
			}
			
			System.out.println();
		}
	}
	
	
	
	/**
	 * generaArrayBiInt: Genera un array de tamaño n x m con números aleatorios cuyo
	 * intervalo (mínimo y máximo) se indica como parámetro.
	 *
	 * @param y, numero de filas
	 * @param x, numeros columnas
	 * @param minimo, numero minimo entero positivo
	 * @param maximo, numero maximo entero positivo
	 * @return Array[][] bidimensional aleatorio, entero positivo
	 */
	 
	public static int[][] generaArrayBiInt(int y, int x, int minimo, int maximo) {
		
		int[][] array = new int[y][x];
		
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				
				array[i][j] = (int)(Math.random() * ((maximo + 1) - minimo) + minimo);
				
			}
		}
		
		return array;
		
	}
	
	/**
	 * filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como parámetro.
	 *
	 * @param fila, numero entero positivo
	 * @return array[] entero positivo
	 */
	 
	public static int[] filaDeArrayBiInt (int array[][], int fila) {
		
		int[] filaArray = new int[array[fila].length];
		
		for (int i = 0; i < array[fila].length; i++) {
			
			filaArray[i] = array[fila][i];
		}
		
		return filaArray;

	}
	
	/**
	 * columnaDeArrayBiInt: Devuelve la fila j-ésima del array que se pasa como parámetro.
	 *
	 * @param columna, numero entero positivo
	 * @return array[] entero positivo
	 */
	 
	public static int[] columnaDeArrayBiInt (int array[][], int columna) {
		
		int[] columnaArray = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			
			columnaArray[i] = array[i][columna];
		}
		
		return columnaArray;

	}
	
	/**
	 * coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array con dos
	 * elementos) de la primera ocurrencia del elemento que se pasa como parámetro. Si
	 * no se encuentra, se devuelve -1.
	 *
	 * @param array[][], array bidimensional entero
	 * @param numero, numero entero positivo
	 * @return array[] entero positivo
	 */
	 
	public static int[] coordenadasEnArrayBiInt (int array[][], int numero) {
		
		int[] coordenadas = {-1, -1};
		
		for (int i = 0; i < filasArrayIntBi(array); i++) {
			
			for (int j = 0; j < columnasArrayIntBi(array); j++) {
				
				if (array[i][j] == numero) {
					coordenadas[0] = i;
					coordenadas[1] = j;
				}
			
			}
		}
		
		return coordenadas;
		
	}
	
	
	
	
	/**
	 * esPuntoDeSilla: Dice si un número es o no punto de silla, es decir, mínimo en su
	 * fila y máximo en su columna.
	 *
	 * @param array, entero
	 * @param Fila, numero entero 
	 * @param Columna, numero entero 
	 * @return <code>true</code> Si es punto de Silla.
	 * @return <code>false</code> Si no es punto de silla.
	 */
	 
	public static boolean esPuntoDeSilla (int array[][], int fila, int columna) {
		
		int[] filaArray = filaDeArrayBiInt(array, fila);
		int[] columnaArray = columnaDeArrayBiInt(array, columna);
		int maximoF = Integer.MIN_VALUE;
		int maximoC = Integer.MIN_VALUE;
		
		
		// ATENCION solo funciona al compilar todos los archivos a la vez. Cosa que Geany en windows no hace.
		
		/*
		
		if (maximoArrayInt(filaArray) == array[fila][columna] && maximoArrayInt(columnaArray) == array[fila][columna]) {
			
			return true;		
		}
		 
		*///////////////////
		
		
		
		for (int i = 0; i < filaArray.length; i++) {
			if (filaArray[i] > maximoF) {
				maximoF = filaArray[i];
			}
		}
		
		for (int i = 0; i < columnaArray.length; i++) {
			if (columnaArray[i] > maximoC) {
				maximoC = columnaArray[i];
			}
		}
		
		if (maximoF == array[fila][columna] && maximoC == array[fila][columna]) {
			return true;
		}
		
							
		return false;
		
	}
	
	
	/**
	 * diagonal: Devuelve un array que contiene una de las diagonales del array bidimensional
	 * que se pasa como parámetro. Se pasan como parámetros fila, columna y
	 * direccion (una cadena de caracteres que puede ser "nose" o "neso").
	 *
	 * @param array[][], array bidimensional entero
	 * @param fila, numero entero positivo
	 * @param columna, numero entero positivo
	 * @param String, direccion: neso o nose. 
	 * @return array[] entero positivo
	 */
	 
	public static int[] diagonal(int array[][], int fila, int columna, String direccion) {
		
		int[] diagonal = new int[array.length];
		int posicion = 0;
		
		if (direccion.equals("neso")) {
			
			posicion = 0;
			
			for (int i = (array.length - 1), x = ((array.length - 1) - fila); i > fila; i--, x--) {
				
				if ((columna - x) >= 0) {
					
					diagonal[posicion] = array[i][columna-x];
					posicion++;
					
				}
			}
			
			for (int i = fila, x = 0; i >= 0; i--, x++) {
				
				if ((columna + x) < array[0].length) {
					
					diagonal[posicion] = array[i][columna + x];
					posicion++;
					
				}
			}
		}
		
		if (direccion.equals("nose")) {
			
			posicion = 0;
			
			for (int i = 0, x = fila; i < fila; i++, x--) {
				
				if ((columna - x) >= 0) {
					
					diagonal[posicion] = array[i][columna - x];
					posicion++;
					
				}
				
			}
			
			for (int i = fila, x = 0; i < array.length; i++, x++) {
				
				if ((columna + x) < array[0].length) {
					
					diagonal[posicion] = array[i][columna + x];
					posicion++;
					
				}
			}
		}
		
		return diagonal;

	}
	
	
	
	
	

	
	
}

