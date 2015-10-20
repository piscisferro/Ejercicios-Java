/**
 * Biblioteca con funciones matemáticas.
 *
 * @author Juan Jose Fernandez Romero 
 */

package matematicas;

public class Varias {
	
	/**
	 * Funcion esPrimo dice si un numero es primo o no
	 * 
	 * @param numero numero entero positivo
	 * @return <code>true</code> Si el numero es primo
	 * @return <code>false</code> Si el numero no es primo
	 */
	
	public static boolean esPrimo(int numero) {
		
		int temp = numero;
		
		for (int i = 2; i < numero; i++) {
			temp = numero % i;
			
			if (temp == 0) {
				return false;
			}
		}
		return true;
		
	}
	
	/**
	 * Funcion Voltea, que voltea un numero
	 * 
	 * @param numero numero entero positivo
	 * @return numero volteado
	 */
	
	public static int voltea(int numero) {
		
		int numeroInverso = 0;
		
		
		while (numero > 0) {
			numeroInverso = (numeroInverso * 10) + (numero % 10);
			numero = numero / 10;
		} 
		
		return numeroInverso;
	}
	
	/**
	 * Funcion esCapicua dice si un numero es capicua o no
	 * 
	 * @param numero entero positivo 
	 * @return <code>true</code> Si es capicua
	 * @return <code>false</code> Si no es capicua
	 */
	 
	public static boolean esCapicua(int numero) {
		 
	 int temp;
		 
	 temp = voltea(numero);
		 
	 if (temp == numero) {
		 return true;
	 } else {
		 return false;
	 }
	}
	 
	/**
   * Función siguientePrimo, devuelve el menor primo que es mayor al número que se pasa como parámetro.
   * 
	 * @param numero entero positivo
	 * @return El siguiente primo.
	 */
	 
	public static int siguientePrimo(int numero) {
		 
		int siguientePrimo = 0;
		boolean primo = false;
		 
		siguientePrimo = numero;
		 
		do {
			siguientePrimo++;
			primo = esPrimo(siguientePrimo);
		} while (!primo);
		
		return siguientePrimo;
		
	}
	
	/**
	 * Función Potencia, devuelve la potencia dando una base y un exponente
	 *
	 * @param base = numero entero positivo
	 * @param exponente = numero entero positivo
	 * @return El siguiente primo.
	 */
	
	public static int potencia (int base, int exponente) {
		
		int resultado = 1;
		
		for (int i = 0; i < exponente; i++) {
			resultado *= base;
		}
		
		return resultado;
	}

	/**
	 * Función digitos, devuelve el numero de digitos que tiene un numero
	 * 
	 * @param numero = numero entero positivo
	 * @return numero de digitos.
	 */
	  
	public static int digitos(int numero) {
	  
		int digitos = 0;
		int i = numero;
			
		while (i != 0) {
			i /= 10;
			digitos++;
		}

		return digitos;
	}
	
	public static int digitosLong(long numero) {
	  
		int digitos = 0;
		long i = numero;
			
		while (i != 0) {
			i /= 10;
			digitos++;
		}

		return digitos;
	}
	
	
	/**
	 * Función digitoN, Devuelve el dígito que está en la posición n de un número entero. Se
	 * empieza contando por el 1 y de izquierda a derecha.
	 * 
	 * @param numero = numero entero positivo
	 * @param posicion = posicion n del numero (izquierda a derecha y de 1 en adelante)
	 * @return numero que esta en la posicion marcada.
	 */
		
	public static int digitoN(int numero, int posicion) {
			
		int temp = digitos(numero);
		int n = numero;
			
		if (temp == 1) {
			return numero;
		} else {		
				for (int i = (posicion); i < temp; i++) {
					n /= 10;
				}
				n %= 10;
				return n;
			}
	}
		 
	/**
	 * posicionDeDigito: Da la posición de la primera ocurrencia de un dígito dentro de
	 * un número entero. Si no se encuentra, devuelve -1.
	 * 
	 * @param numero = numero entero positivo
	 * @param digito = digito del cual se quiere saber la posición.
	 * @return posicion en la que se encuentra el numero, -1 en el caso de que no se encuentre
	 */
		
	public static int posicionDeDigito(int numero, int digito) {
			
		int flag;
		int digitos = digitos(numero);
			
			
		for (int i = 0; i < digitos; i++) {
			flag = numero % 10;
			numero /= 10;
				
			if (flag == digito) {
				digitos -= i; 
				return digitos;
			}
		}
			
		return -1;
	
	}
		
	 /**
	  * quitaPorDetras: Le quita a un número n dígitos por detrás (por la derecha).
	  * 
	  * @param numero = numero entero positivo
	  * @param quita = entero positivo, digitos que se quiere quitar
	  * @return numero recortado
		*/
						
	public static int quitaPorDetras(int numero, int quita) {
						
		for (int i = 0; i < quita; i++) {
			numero /= 10;
		}
			
		return numero;
			
	}
		
	/**
	 * quitaPorDelante: Le quita a un número n dígitos por delante (por la izquierda).
	 * 
	 * @param numero = numero entero positivo
	 * @param quita = entero positivo, digitos que se quiere quitar
	 * @return numero recortado
	 */
	 
	public static int quitaPorDelante(int numero, int quita) {
		
		int digitos = digitos(numero);
		int recortar = digitos - quita; // Necesito saber el numero de digitos que me quedan despues de quitar
																		// para asi luego, mediante el modulo de 10^recortar quitarle los digitos
																		// que no quiero
		int modulo = potencia(10, recortar);
		
		int resultado = numero % modulo;
		
		return resultado;
		
	}
	
	/**
	 * pegaPorDetras: Añade un dígito a un número por detrás.
	 * 
	 * @param numero = numero entero positivo
	 * @param pega = entero positivo, digitos que se quieren pegar
	 * @return resultado final
	 */
	 
	public static int pegaPorDetras(int numero, int pega) {
		
		int resultado;
		int digitos = digitos(pega); // Necesito saber como de largo es el numero que quiere pegar 
																// para multiplicar el numero inicial por 10^digitos
		
		int multiplicador = potencia(10, digitos);
		
		resultado = (multiplicador * numero) + pega;
		
		return resultado;	
		
	}
	 
	 
	 
	 /**
	 * pegaPorDelante: Añade un dígito a un número por delante.
	 * 
	 * @param numero = numero entero positivo
	 * @param quita = entero positivo, digitos que se quieren pegar
	 * @return resultado final
	 */
	 
	public static int pegaPorDelante(int numero, int pega) {
		
		int resultado;
		int digitos = digitos(numero); // Igual que en la anterior, pero ahora necesito saber
																	// comod e alrgo es el numero. 
																	
		int multiplicador = potencia(10, digitos);
		
		resultado = (multiplicador * pega) + numero;
		
		return resultado;
		
	}
	 
	 
	 
	 /**
	 * trozoDeNumero: Toma como parámetros las posiciones inicial y final dentro de un
	 * número y devuelve el trozo correspondiente (sin incluir los numeros de las posiciones) 
	 * @param numero = numero entero positivo
	 * @param posicionInicial = entero positivo, del 1 hacia delante
	 * @param posicionFinal = entero positivo, del 1 hacia delante y mayor que posicionInicial
	 * @return resultado en entero positivo,
	 */
	 
	public static int trozoDeNumero (int numero, int posicionInicial, int posicionFinal ) {
		
		int digitos = digitos(numero);
		int quitaPorDetras = (digitos + 1) - posicionFinal ; // Posicion final +1 para que no incluya la posicion en el trozo
		
		int resultado = quitaPorDelante(numero, posicionInicial);
		resultado = quitaPorDetras(resultado, quitaPorDetras);
		
		return resultado;
		
	}
	
	 /**
	 * trozoDeNumeroIn: Toma como parámetros las posiciones inicial y final dentro de un
	 * número y devuelve el trozo correspondiente (incluyendo los numeros de las posiciones) 
	 * @param numero = numero entero positivo
	 * @param posicionInicial = entero positivo, del 1 hacia delante
	 * @param posicionFinal = entero positivo, del 1 hacia delante y mayor que posicionInicial
	 * @return resultado en entero positivo,
	 */
	 
	public static int trozoDeNumeroIn (int numero, int posicionInicial, int posicionFinal ) {
		
		int digitos = digitos(numero);
		int quitaPorDetras = digitos - posicionFinal; 
		
		int resultado = quitaPorDelante(numero, (posicionInicial - 1));
		resultado = quitaPorDetras(resultado, quitaPorDetras);
		
		return resultado;
		
	}
	 
	 
	 /**
	 * juntaNumeros: Pega dos números para formar uno.
	 * 
	 * @param trozo = numero entero positivo, primer trozo a pegar
	 * @param trozo2 = entero positivo, segundo trozo a pegar
	 * @return resultado entero positivo, resultado
	 */
	 
	public static int juntaNumeros (int trozo, int trozo2) {
		
		int digitos = digitos(trozo2); // Necesito saber como es de largo el trozo 2 para
																	// buscar el exponente para el 10^digitos
																	
		int potencia = potencia(10, digitos);
		
		int resultado = (potencia * trozo) + trozo2;
		
		return resultado;
		
		
	}
	
   
	
}



