import matematicas.Varias;

public class Prueba {
	public static void main (String[] args) {
		
		int numero = Integer.parseInt(System.console().readLine());
		
		boolean prueba;
		int prueba2;
		
		prueba = matematicas.Varias.esPrimo(numero);
		
		System.out.println ("es primo " + prueba);
		
		///////////////////////////////////////////////////////////////
		
		prueba2 = matematicas.Varias.voltea(numero);
		
		System.out.println ("voltea " + prueba2);
		
		///////////////////////////////////////////////////////////////
		
		prueba = matematicas.Varias.esCapicua(numero);
		
		System.out.println ("es capicua " + prueba);
		
		///////////////////////////////////////////////////////////////
		
		prueba2 = matematicas.Varias.siguientePrimo(numero);
		
		System.out.println ("siguiente Primo " + prueba2);
		
		///////////////////////////////////////////////////////////////
		
		System.out.println ("introduce exponente");
		
		int numero2 = Integer.parseInt(System.console().readLine());
		
		prueba2 = matematicas.Varias.potencia(numero, numero2);
		
		System.out.println ("potencia " + prueba2);
		
		///////////////////////////////////////////////////////////////
		
		prueba2 = matematicas.Varias.digitos(numero);
		
		System.out.println ("Digitos " + prueba2);
		
		///////////////////////////////////////////////////////////////
		
		System.out.println ("Introduce posicion");
		
		numero2 = Integer.parseInt(System.console().readLine());
		
		prueba2 = matematicas.Varias.digitoN(numero, numero2);
		
		System.out.println ("Digito en posicion " + prueba2);
		
		///////////////////////////////////////////////////////////////
		
		System.out.println ("Introduce numero de 1 digito para buscar");
		
		numero2 = Integer.parseInt(System.console().readLine());
		
		prueba2 = matematicas.Varias.posicionDeDigito(numero, numero2);
		
		System.out.println ("Posicion del digito " + prueba2);
		
		///////////////////////////////////////////////////////////////
		
		System.out.println ("quita por detras");
		
		numero2 = Integer.parseInt(System.console().readLine());
		
		prueba2 = matematicas.Varias.quitaPorDetras(numero, numero2);
		
		System.out.println ("Quita por detras " + prueba2);
		
		///////////////////////////////////////////////////////////////
		
		System.out.println ("Quita por delante");
		
		numero2 = Integer.parseInt(System.console().readLine());
		
		prueba2 = matematicas.Varias.quitaPorDelante(numero, numero2);
		
		System.out.println ("Quita por delante " + prueba2);
		
		///////////////////////////////////////////////////////////////
		
		System.out.println ("Pega por detras");
		
		numero2 = Integer.parseInt(System.console().readLine());
		
		prueba2 = matematicas.Varias.pegaPorDetras(numero, numero2);
		
		System.out.println ("Pega por detras " + prueba2);
		
		///////////////////////////////////////////////////////////////
		
		System.out.println ("Pega por delante");
		
		numero2 = Integer.parseInt(System.console().readLine());
		
		prueba2 = matematicas.Varias.pegaPorDelante(numero, numero2);
		
		System.out.println ("Pega por delante " + prueba2);
		
		///////////////////////////////////////////////////////////////
		
		System.out.println ("posicion inicial");
		
		numero2 = Integer.parseInt(System.console().readLine());
		
		System.out.println ("Posicion final");
		
		int numero3 = Integer.parseInt(System.console().readLine());
		
		prueba2 = matematicas.Varias.trozoDeNumero(numero, numero2, numero3);
		
		System.out.println ("Trozo de numero " + prueba2);
		
		
		///////////////////////////////////////////////////////////////
		
		System.out.println ("posicion inicial");
		
		numero2 = Integer.parseInt(System.console().readLine());
		
		System.out.println ("Posicion final");
		
		numero3 = Integer.parseInt(System.console().readLine());
		
		prueba2 = matematicas.Varias.trozoDeNumeroIn(numero, numero2, numero3);
		
		System.out.println ("Trozo de numero (incluyendo) " + prueba2);
		
		//////////////////////////////////////////////////////////////
		
		System.out.println ("trozo 1");
		
		numero2 = Integer.parseInt(System.console().readLine());
		
		System.out.println ("trozo 2");
		
		numero3 = Integer.parseInt(System.console().readLine());
		
		prueba2 = matematicas.Varias.juntaNumeros(numero2, numero3);
		
		System.out.println ("numeros arrejuntados " + prueba2);
		

	}
}
