/** 
 * Capitulo 2
 * 
 * Ejercicio 1
 * 
 * Escribe un programa en el que se declaren las variables enteras x e y. Asignales los valores
 * 144 y 999 respectivamente. A continuación, muestra por pantalla el valor de cada variable,
 * la suma, la resta, la división y la multiplicación.
 * 
 * @author: Juan Jose Fernandez Romero
 * 
 */

public class Ejercicio1 {
	public static void main (String[] args) {
		
		int x = 144;
		int y = 999;
		
		int suma = x + y;
		int resta = x - y;
		int multiplicacion = x * y;
		double division = (double)x / (double)y; // Para la multiplicacion era necesario poner double
																						// sino saldria 0 puesto que valores integros no permiten decimales
		
		
		System.out.println ("Las variables son: x = " + x + " e y = " + y);		
		System.out.println ("La suma de las variables x e y es: " + suma);
		System.out.println ("La resta de las variables x e y es: " + resta);
		System.out.println ("La multiplicacion de las variables x e y es: " + multiplicacion);
		System.out.println ("La division de las variables x e y es: " + division);
	}
}
		
		
