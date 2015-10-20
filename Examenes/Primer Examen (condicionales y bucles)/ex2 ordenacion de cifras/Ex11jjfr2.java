/**
 * Examen
 * 
 * Ejercicio 2
 * 
 * Escribe un programa que pida un número entero positivo y que diga a continuación si las cifras que lo
 * componen están ordenadas de menor a mayor, mirando de izquierda a derecha. Se podrán introducir
 * números de cualquier longitud mientras lo permitan las variables. Usa long en lugar de int donde sea
 * necesario para admitir números largos. Fíjate bien que no se pide ordenar las cifras, solo saber si
 * están ordenadas o no.
 * Ejemplo 1:
 * Por favor, introduzca un número entero positivo: 34667
 * Los dígitos del número 34667 están ordenados.
 * Ejemplo 2:
 * Por favor, introduzca un número entero positivo: 85
 * Los dígitos del número 85 no están ordenados.
 *
 * @author Juan Jose Fernandez Romero 
 */

public class Ex11jjfr2 {
	public static void main(String[] args) {
		
		System.out.println ("Este programa dira si los digitos de un numero introducido estan en orden o no");
		System.out.println ("Introduce el numero");
		long numeroIn = Integer.parseInt(System.console().readLine());
		
		// Incluso con Long sigue dando error al meter numeros de mas de 10 digitos.
		
		long numInverso = 0;
		long numero = 0;
		long digitoActual = 0;
		long digitoAnterior = 0;		
		int digitos = 0;
		boolean orden = true;
		
		numero = numeroIn;
		
		while (numero > 0) {
			numero/= 10;
			digitos++;
		}
		
		numero = numeroIn;
		
		while (numero > 0) {
			numInverso = (numInverso * 10) + (numero % 10);
			numero /= 10;
		} 
		
		
		for (int i = 0; i < digitos; i++) {
			digitoAnterior = digitoActual;
			digitoActual = numInverso % 10;
			numInverso/=10;
			
			if (digitoActual < digitoAnterior && orden == true) {
				orden = false;
			} 
		}
		
		
		
		if (orden == true)
		System.out.println ("Los digitos del numero: " + numeroIn + " estan ordenados" );
		
		if (orden == false)
		System.out.println ("Los digitos del numero: " + numeroIn + " no estan ordenados" );

	}
}
