/**
 * Capitulo 7.1
 * 
 * Ejercicio 4
 * 
 * Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado y cubo.
 * Carga el array numero con valores aleatorios entre 0 y 100. En el array cuadrado se deben
 * almacenar los cuadrados de los valores que hay en el array numero. En el array cubo se
 * deben almacenar los cubos de los valores que hay en numero. A continuación, muestra el
 * contenido de los tres arrays dispuesto en tres columnas.
 *
 * @author Juan Jose Fernandez Romero 
 */

public class Ejercicio4 {
	public static void main(String[] args) {
		
		double[] numero = new double[20];
		double[] cuadrado = new double[20];
		double[] cubo = new double[20];
		
		System.out.println ("Este programa genera 20 numeros aleatorio y muestra el numero" +
												"\nsu cuadrado y su cubo");
												
	  System.out.printf ("%10s |%10s |%10s |%n%n", "numero", "cuadrado", "cubo");
		
		for (int i = 0; i < 20; i++) {
			numero[i] = (Math.random() * 100);
			cuadrado[i] = numero[i] * numero[i];
			cubo[i] = cuadrado[i] * numero[i];
			System.out.printf("%10.2f |%10.2f |%10.2f | %n", numero[i], cuadrado[i], cubo[i]);
		}
		
	}
}
