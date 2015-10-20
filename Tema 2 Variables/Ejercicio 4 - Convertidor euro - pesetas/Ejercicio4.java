/** 
 * Capitulo 2
 * 
 * Ejercicio 4
 * 
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere convertir deberá
 * estar almacenada en una variable.
 * 
 * @author: Juan Jose Fernandez Romero
 * 
 */

public class Ejercicio4 {
	public static void main(String[] args) {
		
		int euros = 0;
				
		euros = 3; // Aqui se pone el valor en euros que queremos convertir
							// Para el ejemplo he puesto 3 euros.
		
		int pesetas = euros * 166;
		System.out.println (euros + " euro son " + pesetas + " pesetas");
	}
}
		
