/**
 * Examen
 * 
 * Ejercicio 2
 * 
 * Realiza una función que devuelva el número complementario a otro que se pasa como parámetro.
 * Cada dígito del número complementario es la diferencia con 9 del dígito original. Por ejemplo el
 * complementario de 308566 es el 691433 y el complementario de 92491 es el 7508. Prueba la función
 * desde un programa. A continuación se muestra la cabecera de la función:
 * public static long complementario(long x)
 *
 * @author Juan Jose Fernandez Romero 
 */
 
import matematicas.Varias;

public class Ex11jjfr2 {
	public static void main(String[] args) {
		
		System.out.println ("Este programa te dice el complementario del numero introducido");
		System.out.println ("Introduce el numero");
		 long numero = Integer.parseInt(System.console().readLine());
		 
		 long complementario = complementario(numero);
		 
		 System.out.println("El complementario es: " + complementario);
		
	}
	
	public static long complementario (long numero) {
		
		int digitos = matematicas.Varias.digitosLong(numero);
		
		digitos -= 1;
		
		long over9000 = 0;
		
		for (int i = 0; i < digitos; i++) {
			over9000 += 9;
			over9000 *=10;
		}
		
		over9000 += 9;

		long resultado;
		
		resultado = over9000 - numero;
		
		return resultado;
	}
	
}


		
