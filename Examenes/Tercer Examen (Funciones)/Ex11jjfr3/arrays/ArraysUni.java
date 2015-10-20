/**
 * Biblioteca con funciones de Arrays.
 *
 * @author Juan Jose Fernandez Romero 
 */

package arrays;

public class ArraysUni {
	
	/**
	 * copiaArray: genera una copia del array que se pasa como parametro.
	 * 
	 * @param array que se quiere copiar, entero.
	 * @return array rellenado y copiado. Entero positivo
	 */
	 
	public static int[] copiaArray (int[] array) {
		
		int[] copia = new int[array.length];
		
		for (int i = 0; i < array.length; i++) {
			copia[i] = array[i];
			
		}
		
		return copia;
		
	}
	
	
	/**
	 * generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo
	 * intervalo (mínimo y máximo) se indica como parámetro.
	 * 
	 * @param longitud, entero positivo
	 * @param minimo, entero positivo 
	 * @param maximo, entero positivo
	 * @return array rellenado de forma aleatoria. Entero positivo
	 */
	
	public static int[] generaArrayInt(int longitud, int minimo, int maximo) {
		
		int[] array = new int[longitud];
		
		for (int i = 0; i < longitud; i++) {
			array[i] = (int)(Math.random() * ((maximo + 1) - minimo) + minimo);
		}
		
		return array;
		
	}
	
	/**
	 * muestraArray: Muestra el array que se pasa como parametro.
	 * 
	 * @param array, entero positivo
	 */
	 
	public static void muestraArray (int array[]) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.print (array[i] + " ");
		}
		
		System.out.println();
		
	}
	
	/**
	 * minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
	 * 
	 * @param array entero positivo
	 * @return valor minimo
	 */
	 
	public static int minimoArrayInt (int array[]) {
		
		int minimo = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minimo) {
				minimo = array[i];
			}
		}
		
		return minimo;
		
	}
	
	/**
	 * maximoArrayInt: Devuelve el maximo del array que se pasa como parámetro.
	 * 
	 * @param array entero positivo
	 * @return valor maximo
	 */
	 
	public static int maximoArrayInt (int array[]) {
		
		int maximo = Integer.MIN_VALUE;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maximo) {
				maximo = array[i];
			}
		}
		
		return maximo;
		
	}
	
	/**
	 * mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
	 * 
	 * @param array entero positivo
	 * @return media del array entero positivo.
	 */
	
	public static float mediaArrayInt (int array[]) {
		
		float media = 0;
		int divisor = 0;
		
		for (int i = 0; i < array.length; i++, divisor++) {
			media += array[i];
			
		}
		
		media /= divisor;
		
		return media;
	}
	
	/**
	 * estaEnArrayInt: Dice si un número está o no dentro de un array.
	 * 
	 * @param array entero positivo
	 * @param numero, numero entero positivo.
	 * @return <code>true</code> si el se encuentra el numero.
	 * @return <code>falso</code> si no se encuentra el numero.
	 */
	
	public static boolean estaEnArrayInt (int array[], int numero) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == numero) {
				return true;
			} 
		}
		
		return false;
	}
	
	/**
	 * posicionEnArray: Busca un número en un array y devuelve la posición (el índice)
	 * en la que se encuentra.
	 * 
	 * @param array entero positivo
	 * @param numero, numero entero positivo.
	 * @return entero positivo, indice donde se encuentra el numero, si no se encuentra devolvera -1
	 */
	 
	public static int posicionEnArray (int array[], int numero) {
		
		int indice = -1;
		
		for (int i = 0; i < array.length; i++) {
			
			if (numero == array[i]) {
				indice = i;
			}
		}
		
		return indice;
		
	}
	
	/**
	 * volteaArrayInt: Le da la vuelta a un array.
	 * 
	 * @param array entero positivo
	 */
	 
	public static void volteaArrayInt (int array[]) {
		
		int[] voltea = copiaArray(array);
		int x = (array.length - 1);
		
		for (int i = 0; i < array.length; i++, x--) {
			array[i] = voltea[x];
		
		}
	
	}	
	/**
	 * rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
	 * 
	 * @param array entero positivo.
	 * @param posiciones, entero positivo
	 */
	 
	public static void rotaDerechaArrayInt (int array[], int posiciones) {
		
		for (int x = 0; x < posiciones; x++) {
			
			int[] copia = copiaArray(array);
		
			for (int i = 0; i < array.length; i++) {
				
				if (i > 0 && i < array.length) {
					
					array[i] = copia[i - 1];
					
				} else if (i == 0) {
					
					array[i] = copia[array.length - 1];
					
				}
			}
		}
	}
	 
	
	
	
	
	
	/**
	 * rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un array.
	 * 
	 * @param array entero positivo.
	 * @param posiciones, entero positivo
	 */
	
	public static void rotaIzquierdaArrayInt (int array[], int posiciones) {
		
		for (int x = 0; x < posiciones; x++) {
			
			int[] copia = copiaArray(array);
		
			for (int i = 0; i < array.length; i++) {
				
				if (i < (array.length - 1)) {
					
					array[i] = copia[i + 1];
					
				} else if (i == (array.length - 1)) {
					
					array[i] = copia[0];
					
				}
			}
		}
	}
	
	
}
			
			
		
	
