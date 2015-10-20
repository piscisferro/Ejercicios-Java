/** 
 * Capitulo 7.2
 * 
 * Ejercicio 10
 * 
 * Realiza un programa que sea capaz de rotar todos los elementos de una matriz cuadrada una
 * posición en el sentido de las agujas del reloj. La matriz debe tener 12 filas por 12 columnas
 * y debe contener números generados al azar entre 0 y 100. Se debe mostrar tanto la matriz
 * original como la matriz resultado, ambas con los números convenientemente alineados.
 * 
 * @author: Juan Jose Fernandez Romero
 * 
 */
 
public class Ejercicio10 {
	
	static final int VACIO = 0;
	static final int JUGADOR = 1;
	static final int PC = 2;
	
	public static void main (String[] args) {
		
		String rojo = "\033[31m";
		String blanco = "\033[37m";
		String verde = "\033[32m";
		
		int[][] tablero = new int [3][3];
		int fila = 0;
		int columna = 0;
		int x = 0;
		int y = 0;
		boolean empiezaJugador;
		
		System.out.println ("¡Bienvenido al juego de 3 en raya!");
		
		// Aqui decidimos quien empieza, con una probabilidad de 50% para cada uno.
		
		x = (int)(Math.random() * 10);
		
		switch (x) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				empiezaJugador = true;
				break;			
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				empiezaJugador = false;
				break;
			default:
				empiezaJugador = true;
		}
		
		
		// Pinta el tablero


	}
}
