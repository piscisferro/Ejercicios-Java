/** 
 * Capitulo 2
 * 
 * Ejercicio 6
 * 
 * Escribe un programa que calcule el total de una factura a partir de la base imponible (precio
 * sin IVA). La base imponible estará almacenada en una variable.
 * 
 * @author: Juan Jose Fernandez Romero
 * 
 */

public class Ejercicio6 {
	public static void main(String[] args) {
		
		int apunte1 = 0;  // Apunte/producto o lo que es lo mismo, lo que se quiere sumar
		int apunte2 = 0;  // Se pueden poner los que quieras pero para el ejemplo he declarado 3
		int apunte3 = 0;
		double baseImponible = 0;
		
		apunte1 = 5; // Aqui es donde se ponen los valores deseados.
		apunte2 = 2;
		apunte3 = 3;
		baseImponible = 21; // Porcentaje en %
		
		int sumaSinIVA = apunte1 + apunte2 + apunte3;
		double sumaConIVA =  sumaSinIVA - (sumaSinIVA * (baseImponible/100)); 
		
		System.out.println ("La suma de todos los apuntes/productos sin base imponible es: " + sumaSinIVA);
		System.out.println ("Total con base imponible: " + sumaConIVA);
		
	}
}
