/**
 * Examen
 * 
 * Ejercicio 1
 * 
 * Realiza una nueva versión del juego “Busca el tesoro” realizado en clase con los siguientes cambios:
 * • Hay tres minas en lugar de una. Si el jugador pisa una mina, está herido, y si pisa otra más, está
 * muerto.
 * • Sigue habiendo un único tesoro. Si el jugador lo encuentra, gana.
 * • No pueden coincidir las coordenadas de ninguno de los elementos, ya sean minas o tesoro.
 * • Para que el ejercicio se pueda corregir con facilidad, se deben mostrar por pantalla, a modo de
 * chuleta, las coordenadas de todos los elementos (minas y tesoro).
 *
 * @author Juan Jose Fernandez Romero 
 */

public class Ex11jjfr1 {
	// se definen constantes para representar el
	// contenido de las celdas
	static final int VACIO = 0;
	static final int MINA = 1;
	static final int MINADES = 4;
	static final int TESORO = 2;
	static final int INTENTO = 3;
	
	public static void main(String[] args) {
		int x;
		int y;
		int minas = 0;
		int[][] cuadrante = new int[5][4];
		boolean Aviso = false;
		
		// inicializa el array
		for(x = 0; x < 4; x++) {
			for(y = 0; y < 3; y++) {
			cuadrante[x][y] = VACIO;
			}
		}
		
		// coloca el tesoro
		int tesoroX;
		int tesoroY;
		
		tesoroX = (int)(Math.random()*4);
		tesoroY = (int)(Math.random()*3);
		cuadrante[tesoroX][tesoroY] = TESORO;
		
		do {
			// coloca las minas
			int minaX = (int)(Math.random()*4);
			int minaY = (int)(Math.random()*3);
			if (cuadrante[minaX][minaY] == VACIO) {
				cuadrante[minaX][minaY] = MINA;
				minas++;
			}
		} while (minas != 3);
		
		
		
		
		// juego
		System.out.println("¡BUSCA EL TESORO!");
		boolean salir = false;
		String c = "";
		int vidas = 2;
		do {
			// pinta el cuadrante
				for(y = 3; y >= 0; y--) {
					System.out.print(y + "|");
					for(x = 0; x < 5; x++) {
						if (cuadrante[x][y] == INTENTO) {
							System.out.print("X");
						} else if (cuadrante[x][y] == MINADES) {
								System.out.print ("*");
						}	else {
								System.out.print(" ");
						}
						
						System.out.print ("|");
						
					}
					System.out.println();
				}
				System.out.println(" ----------\n  0 1 2 3 4\n");
			
				
				// Chuleta
				
				for(y = 3; y >= 0; y--) {
					for(x = 0; x < 5; x++) {
						switch(cuadrante[x][y]) {
							case MINA:
								System.out.println ("MINA: " + x + ", " + y);
								break;
							
							case TESORO:
								System.out.println ("TESORO: " + x + ", " + y);
								break;
							
							case MINADES:
								System.out.println ("MINA: " + x +  ", " + y);
								break;
							
							default:
						}
					}

				}
				
			
			// pide las coordenadas
			System.out.print("Coordenada x: ");
			x = Integer.parseInt(System.console().readLine());
			System.out.print("Coordenada y: ");
			y = Integer.parseInt(System.console().readLine());
			
			// mira lo que hay en las coordenadas indicadas por el usuario
			switch(cuadrante[x][y]) {
				case VACIO:
					cuadrante[x][y] = INTENTO;
					System.out.println ("No has encontrado nada");
					break;
				
				case MINA:
					System.out.println("¡Has pisado una mina!.");
					cuadrante[x][y] = MINADES;
					vidas--;
					System.out.println ("Te quedan " + vidas + " vidas");
					if (vidas == 0) {
						System.out.println ("Lo siento has perdido :(");
					}
					break;
				
				case TESORO:System.out.println("Enhorabuena, has encontrado el tesoro.");
					salir = true;
					break;
				
				default:
			}
			
			// Miramos si hay una mina cerca.
			
			if (cuadrante[x][y] == INTENTO) {
				for (int fila = (-1); fila < 2; fila++) {
					for (int columna = (-1); columna < 2; columna++) {
						if (((x+fila) > (-1)) && ((y+columna) > (-1)) && ((x+fila) < 5) && ((y+columna) < 4)) {
							if (cuadrante[x+fila][y+columna] == MINA) {
								Aviso = true;
							}
						}
					}
				}
			
			}
			
			if (Aviso) {
				System.out.println ("¡CUIDADO!¡Hay una mina cerca!");
				Aviso = false;
			}
		
		} while (!salir && vidas > 0);
		
		// pinta el cuadrante
		for(y = 3; y >= 0; y--) {
			System.out.print(y + "|");
			for(x = 0; x < 5; x++) {
				switch(cuadrante[x][y]) {
					case VACIO:
					c = " ";
					break;
					
					case MINA:
					c = "*";
					break;
					
					case TESORO:
					c = "€";
					break;
					
					case INTENTO:
					c = "x";
					break;
					
					case MINADES:
					c = "*";
					break;
					
					default:
				}
				System.out.print(c + "|");
			}
			System.out.println();
		}
		System.out.println("----------\n  0 1 2 3 4\n");
		
		
	}
	
}
