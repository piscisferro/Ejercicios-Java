/**
 * Examen A
 * 
 * Ejercicio 1
 * 
 * Realiza un programa que trocee un número introducido por teclado en otros dos números. Un trozo se formará
 * con los dígitos de las posiciones pares y otro trozo con los dígitos de las posiciones impares. Se debe conservar
 * el orden de los dígitos. Da igual el trozo que se muestre primero con tal de que cada trozo esté bien formado.
 * Utiliza el tipo long donde sea necesario para aceptar números largos.
 *
 * @Fecha 03/12/1993
 * 
 * @author Juan Jose Fernandez Romero 
 */

public class Ex11jjfr1 {
	public static void main(String[] args) {
		
		
		long[] num = new long[100];
		int i = 0;
		
		long numero = 0;
		long copia = 0;
		long resultado = 0;
		int digitos = 0;
		
		System.out.println ("Este programa trocea un numero largo en dos, un trozo" +
							"estara formado por los numeros pares, el otro por los impares");
							
		System.out.println ("Introduce el numero");		
		numero = Long.parseLong(System.console().readLine());
		
		copia = numero;
		
		while (copia > 0) {
			digitos++;
			copia /= 10;
		}
		
		
		for (i = digitos-1; i >= 0; i--) {
			num[i] = numero % 10;
			numero /= 10;
		} 
		
		System.out.print ("Primer trozo: ");
		
		for (i = 0; i < digitos; i+=2) {
			System.out.print (num[i]);
		}
		
		System.out.print ("\nSegundo Trozo: ");
		
		for (i = 1; i < digitos; i+=2) {
			System.out.print (num[i]);
		}

	}
}
