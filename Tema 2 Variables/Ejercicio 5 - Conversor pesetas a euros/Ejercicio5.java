/** 
 * Capitulo 2
 * 
 * Ejercicio 5
 * 
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere convertir
 * deberá estar almacenada en una variable.
 * 
 * @author: Juan Jose Fernandez Romero
 * 
 */

public class Ejercicio5 {
	public static void main(String[] args) {
		
		int pesetas = 0;
				
		pesetas = 25; // Aqui se pone el valor en euros que queremos convertir
							// Para el ejemplo he puesto 3 euros.
		
		double euros = pesetas * 0.006; 
		System.out.println (pesetas + " pesetas son " + euros + " euros");
	}
}
