/** 
 * Capitulo 7.2
 * 
 * Ejercicio 6
 * 
 * Modifica el programa anterior de tal forma que no se repita ningún número en el array.
 * 
 * @author: Juan Jose Fernandez Romero
 * 
 */
 
public class Ejercicio6 {
	public static void main (String[] args) {
			
		int[][] array = new int [6][10];
		int maximo = 0;
		int minimo = 1001;
		String rojo = "\033[31m";
		String blanco = "\033[37m";
		String verde = "\033[32m";
			
		System.out.println ("Este programa genera aleatoriamente una tabla de 6 filas y 10 columnas "
												+ "para luego indicar cual es el numero maximo y el minimo");
							
		System.out.println ("Tabla original");
		
		for (int n = 0; n < 6; n++) {
			System.out.print ("\n Fila " + n + ":");
			for (int i = 0; i < 10; i++)	{
				array[n][i] = (int)((Math.random()*1001));
				
				// Comprobacion de que el numero generado no se ha repetido
				// Aunque para hacerlo bien y en condiciones (porque hay probabilidad de
				// que se repita) lo mejor seria usar una funcion
				
				
				for (int y = 0; y <= n; y++) { 
					for (int x = 0; x < i; x++){
						while (array[n][i] == array[y][x]) {
							array[n][i] = (int)((Math.random()*1001));
						}
					}
				} // Fin de comprobacion
				
				
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
