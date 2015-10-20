/**
 * Examen
 * 
 * Ejercicio 4
 * 
 * Una cadena de multicines nos ha encargado una aplicación para la venta on-line de entradas. Como
 * parte de esa aplicación, tenemos que implementar una función que coloque a los espectadores en una
 * fila de butacas. Una fila de butacas es un array de una dimensión. Cada celda se corresponde a una
 * butaca que tiene el valor 0 si está libre y el valor 1 si está ocupada. La función recibe como
 * parámetros el array con la información de la fila de butacas y un número que es la cantidad de gente
 * que se quiere colocar en esa fila. Si se puede colocar a los espectadores con éxito, la función
 * devolverá un 0 y si no se puede, un -1. Lo primero que tiene que hacer la función es comprobar si hay
 * sitio, si no lo hay devolverá -1. Si hay sitio, primero intentará colocar juntos a todo el grupo y, si no
 * puede, los irá colocando en los primeros huecos que encuentre.
 * Por ejemplo, si a = { 0, 1, 0, 0, 0, 1, 0 } y se quieren colocar 3 nuevos espectadores, la función
 * devolverá 0 y el array se habrá modificado quedando así a = { 0, 1, 1, 1, 1, 1, 0 }.
 * Prueba la función desde un programa. La cabecera de la función es la siguiente:
 * public static int ocupa(int[ ] fila, int usuarios)
 *
 * @author Juan Jose Fernandez Romero 
 */

import matematicas.Varias;
import arrays.ArraysBi;
import arrays.ArraysUni;

public class Ex11jjfr4 {
	public static void main(String[] args) {
		
		System.out.println ("Este programa gestiona las filas de butacas del cine,");
		
		int eleccion;
		int fila[] = new int[0];
		
			do {
			
			eleccion = menu();
			
			if (eleccion == 1) {
				
				
				System.out.println ("Inicializar fila de butacas ocupadas aleatoriamente, introduce longitud de fila");
				int longitud = Integer.parseInt(System.console().readLine());
				
				fila = arrays.ArraysUni.generaArrayInt(longitud, 0, 1);
				
				System.out.println ("hecho");
				
				arrays.ArraysUni.muestraArray(fila);
				
			}
			
			
			if (eleccion == 2) {
				
				System.out.println ("¿Cuantas personas desea colocar?");
				
				int personas = Integer.parseInt(System.console().readLine());
				
				colocaEspectadores(fila, personas);
				
				
			}
				
				
			
			
			
		} while (eleccion != 3);
		
		
		
		
		
	}
	
	public static int menu () {
		
		int eleccion;
		
		do {
			
			System.out.println ("¿Que quiere hacer?\n1: Inicializar fila con butacas ocupadas aleatorias\n2: Colocar personas" +
													"\n3: Salir");
			eleccion = Integer.parseInt(System.console().readLine());
			
		} while (eleccion != 1 && eleccion != 2 && eleccion != 3);
		
		return eleccion;
		
	}
	
	public static int haySitio (int personas, int fila[]) {
		
		int contador = 0;
		
		for (int i = 0; i < fila.length; i++) {
			if (fila[i] == 0) {
				contador++;
			}
		}
		
		if (contador >= personas) {
			return 0;
		} else {
			return -1;
		}
		
	}
	
	public static boolean sitioGrupo (int fila[], int personas) {
		
		int contador = 0;
		
		for (int i = 0; i < fila.length; i++) {
			if (fila[i] == 0) {
				contador++;
			}
			
			if (contador == personas) {
				return true;
			}
			
			if (fila[i] == 1) {
				contador = 0;
			}
		}
		
		return false;
	}
	
	
	public static void colocaEspectadores(int fila[], int personas) {
		
				int sitio = haySitio(personas, fila);
				boolean grupo = false;
				int contador = 0;
				
				if (sitio == 0) {
					System.out.println ("sitio = " + sitio + " se pueden colocar personas");
					grupo = sitioGrupo(fila, personas);
					
					if (grupo) {
						System.out.println ("Se puede colocar el grupo junto");
						
						for (int i = 0; i < fila.length; i++) {
							if (fila[i] == 0) {
								contador++;
							}
							
							if (contador == personas && personas > 0) {
								for (int j = 0; j < fila.length; j++)
									if (i-j >= 0) {
										fila[i-j] = 1;
										personas--;
									}
							}
							
							if (fila[i] == 1) {
								contador = 0;
							}
						}
						
					} else {
						System.out.println ("No se puede colocar el grupo junto, se colocaran por separado");
						
						for (int i = 0; i < fila.length; i++) {
							if (fila[i] == 0 && personas > 0) {
								fila[i] = 1;
								personas--;
							}
						}
						
						
					}
				
				} else if (sitio == -1) {
					System.out.println ("sitio = " + sitio + " no se pueden colocar personas");
				}
				
				arrays.ArraysUni.muestraArray (fila);
				

				
				
	}
}
	
	

