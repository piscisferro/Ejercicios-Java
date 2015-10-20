/** 
 * Capitulo 7.2
 * 
 * Ejercicio 8
 * 
 * Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas
 * podría saltar un alfil que se encuentra en esa posición. Como se indica en la figura, el alfil
 * se mueve siempre en diagonal. El tablero cuenta con 64 casillas. Las columnas se indican
 * con las letras de la a a la h y las filas se indican del 1 al 8.
 * 
 * @author: Juan Jose Fernandez Romero
 * 
 */
 
public class Ejercicio8 {
	
	static final int VACIO = 0;
	static final int MOVIMIENTO = 1;
	static final int ALFIL = 2;
	
	public static void main (String[] args) {
			
		int[][] tablero = new int [8][8];
		String xTemp;
		int x = 0;
		int y = 0;
		int columna = 0;
		int fila = 0;
		
		String rojo = "\033[31m";
		String blanco = "\033[37m";
		String verde = "\033[32m";
			
		System.out.println ("Este programa muestra los posibles movimientos de la pieza de ajedrez"
												+ "alfil");
												
		System.out.println ("Introduce la posicion del alfil");
		
		// Dibuja el Tablero Vacio
		
		System.out.print ("  a b c d e f g h");
		
		for (y = 0; y < 8; y++) {
			System.out.print ("\n" + (y + 1) + "|");
			
			for (x = 0; x < 8; x++) {
				if (tablero[y][x] == MOVIMIENTO) {
					System.out.print ("o");
				}

				
				if (tablero[y][x] == ALFIL) {
					System.out.print ("Y");
				}
				
				if (tablero[y][x] == VACIO) {
					System.out.print (" ");
				}
				System.out.print ("|");
				
				if (x == 7) {
					System.out.print ((y + 1));
				}
			}
		}
		System.out.println ("\n  a b c d e f g h"); 
		
		// Fin del dibujado
		
		// Pide coordenadas
		
		System.out.println ("\nIntroduce la coordenada x (de la a hasta la h)");
		
		xTemp = System.console().readLine();
		
		switch (xTemp) {
			
			case "a": 
				x = 0;
				break;
				
			case "b":
				x = 1;
				break;
				
			case "c":
				x = 2;
				break;
				
			case "d":
				x = 3;
				break;
				
			case "e":
				x = 4;
				break;
			case "f":
				x = 5;
				break;
				
			case "g":
				x = 6;
				break;
				
			case "h":
				x = 7;
				break;
				
			default:
		}
	
		System.out.println ("Introduce la coordenada y (del 1 al 8)");
		
		y = Integer.parseInt(System.console().readLine()) - 1;
		
		tablero[y][x] = ALFIL;
		
		// Calcula los movimientos (desde el alfil hacia arriba)
		
		for (fila = (y - 1), columna = 1; fila >= 0; fila--, columna++) {
			if ((x + columna) < 8) {
				tablero[fila][x+columna] = MOVIMIENTO;
			}
			
			if ((x - columna) >= 0) {
				tablero[fila][x-columna] = MOVIMIENTO;
			}
		}
		
		
		// Calcula los movimientos (desde el alfil hacia abajo)
		
		
		for (fila = (y + 1), columna = 1; fila < 8; fila++, columna++) {
			if ((x + columna) < 8) {
				tablero[fila][x+columna] = MOVIMIENTO;
			}
			
			if ((x - columna) >= 0) {
				tablero[fila][x-columna] = MOVIMIENTO;
			}
			
		}
		
		// Muestra las coordenadas
		
		/**
		for (y = 0; y < 8; y++) {
			for (x = 0; x < 8; x++) {
				if (tablero[y][x] == MOVIMIENTO) {
				System.out.print ("\n" + x + " " + y);
				}
			}
		}
		*/
		
		// Dibuja el Tablero Vacio
		
		System.out.print ("  a b c d e f g h");
		
		for (y = 0; y < 8; y++) {
			System.out.print ("\n" + (y + 1) + "|");
			
			for (x = 0; x < 8; x++) {
				if (tablero[y][x] == MOVIMIENTO) {
					System.out.print (rojo + "o" + blanco);
				}
				
				if (tablero[y][x] == ALFIL) {
					System.out.print ("Y");
				}
				
				if (tablero[y][x] == VACIO) {
					System.out.print (" ");
				}
				System.out.print ("|");
				
				if (x == 7) {
					System.out.print ((y + 1));
				}
			}
		}
		System.out.println ("\n  a b c d e f g h"); 
		
		// Fin del dibujado
	}
}
