/**
 * Examen
 * 
 * Ejercicio 3
 * 
 * Realiza un programa que pida 10 números enteros por teclado y que luego diga cuántos de esos
 * números son capicúa. Los números capicúa son los que se leen igual hacia delante y hacia atrás. Los
 * capicúa repetidos también cuentan.
 *
 * @author Juan Jose Fernandez Romero 
 */

public class Ex11jjfr3 {
	public static void main(String[] args) {
		
		System.out.println ("Este programa despues de pedir 10 numeros, dira cuantos de ellos es capicua");
		
		int numero = 0;
		int numeroIn = 0;
		int capicua = 0;
		int digitos = 0;
		int contadorModulo = 1;
		int capicuaD = 0;
		int capicuaI = 0;
		int capicuaDInverso = 0;
		int modulo = 10;
		int divisor = 1;
		int extremos = 0;
		int x = 1;
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println ("Introduce un numero");
			numeroIn = Integer.parseInt(System.console().readLine());
			
			digitos = 0;
			numero = numeroIn;
			
			while (numero > 0) {
				numero/= 10;
				digitos++;
			}
			
			if (digitos == 1) {
				capicua++;
			}
			
			if (digitos > 2) {
				
				extremos = digitos / 2;
				
				// Segun experimentos, dividiendo 2 numeros irregulares enteros entre 2 
				// ej: 3, redondea hacia abajo por lo que incluso introduciendo numeros
				// con un numero de digito inpar, este bucle funcionara para hayar los
				// numeros extremos.
				
				
				
				for (int j = 0; j <= extremos; j++) {
					// Calcula Digitos para el extremo derecho del numero
					capicuaD = numeroIn % modulo;
					
					// Calcula Digitos para el extremo izquierdo del numero
					while (x < digitos) {
						divisor*= 10;
						x++;
					}
					capicuaI = numeroIn / divisor;
					
					// Actualiza contadores y divisores
					contadorModulo*=10;
					modulo*=contadorModulo;
					divisor/=10;
					
					
				}
				// Volteamos uno de los dos numeros extremos (he elegido el derecho)
				while (capicuaD > 0) {
					capicuaDInverso = (capicuaDInverso * 10) + (capicuaD % 10);
					capicuaD/= 10;
				} 
				
				if (capicuaDInverso == capicuaI) {
					capicua++;
				}
				
				// Reinicia contadores y  divisores
				contadorModulo = 1;
				modulo = 10;
				divisor = 1;
				x = 1;
				capicuaDInverso = 0;
				
			}
		}
		
		System.out.println ("Hay " + capicua + " numeros capicuas entre los introducidos");	
	}
}
