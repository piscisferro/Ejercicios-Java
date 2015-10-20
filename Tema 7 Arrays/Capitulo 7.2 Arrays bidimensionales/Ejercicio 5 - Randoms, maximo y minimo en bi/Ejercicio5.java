/** 
 * Capitulo 7.2
 * 
 * Ejercicio 5
 * 
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros
 * positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa
 * deberá dar la posición tanto del máximo como del mínimo.
 * 
 * @author: Juan Jose Fernandez Romero
 * 
 */

public class Ejercicio5 {
	public static void main (String[] args) {
			
		int[][] array = new int [6][10];
		int maximo = 0;
		int minimo = 1001;
		String rojo = "\033[31m";
		String blanco = "\033[37m";
		String verde = "\033[32m";
			
		System.out.println ("Este programa genera aleatoriamente una tabla de 6 filas y 10 columnas"
												+ "para luego indicar cual es el numero maximo y el minimo");
							
		System.out.println ("Tabla original");
		
		for (int n = 0; n < 6; n++) {
			System.out.print ("\n Fila " + n + ":");
			for (int i = 0; i < 10; i++)	{
				array[n][i] = (int)((Math.random()*1001));
				System.out.printf ("|%4d|", array[n][i]);
				if (array[n][i] > maximo) {
					maximo = array[n][i];
				}
				if (array[n][i] < minimo) {
					minimo = array[n][i];
				}
			}
		}
		

		
		System.out.println ("\n\nTabla con el maximo (rojo) y el minimo(verde)");
		
		for (int n = 0; n < 6; n++) {
			System.out.print ("\n Fila " + n + ":");
			for (int i = 0; i < 10; i++)	{
				if (array[n][i] == maximo) {
					System.out.print (rojo);
				}
				if (array[n][i] == minimo) {
					System.out.print (verde);
				}
				System.out.printf ("|%4d|", array[n][i]);
				System.out.print (blanco);
			}
		}
		
	}
}
