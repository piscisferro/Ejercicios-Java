import arrays.ArraysBi;
import arrays.ArraysUni;

public class PruebaArrayBi {
	public static void main (String[] args) {
		
		String neso = "neso";
		String nose = "nose";
		
		int[] prueba2;
		int[][] prueba3;
		boolean boleana;
		
		System.out.println ("Introduce fila");
		int numero = Integer.parseInt(System.console().readLine());
		
		System.out.println ("Introduce Columna");
		int numero2 = Integer.parseInt(System.console().readLine());
		
		System.out.println ("Introduce minimo");
		int numero3 = Integer.parseInt(System.console().readLine());
		
		System.out.println ("Introduce maximo");
		int numero4 = Integer.parseInt(System.console().readLine());
		
		
		int[][] prueba = arrays.ArraysBi.generaArrayBiInt(numero, numero2, numero3, numero4);
		
		arrays.ArraysBi.muestraArrayIntBi(prueba);
		
		///////////////////////////////////////////////////////
		
		numero = arrays.ArraysBi.maximoArrayIntBi(prueba);
		
		System.out.println ("numero maximo" + numero);
		
		///////////////////////////////////////////////////////
		
		prueba3 = arrays.ArraysBi.copiaArrayBiInt(prueba);
		
		arrays.ArraysBi.muestraArrayIntBi(prueba3);
		
		///////////////////////////////////////////////////////
		
		System.out.println ("muestra fila");
		numero = Integer.parseInt(System.console().readLine());
		
		prueba2 = arrays.ArraysBi.filaDeArrayBiInt (prueba, numero);
		
		arrays.ArraysUni.muestraArray(prueba2);
		
		///////////////////////////////////////////////////////
		
		System.out.println ("muestra columna");
		numero = Integer.parseInt(System.console().readLine());
		
		prueba2 = arrays.ArraysBi.columnaDeArrayBiInt (prueba, numero);
		
		arrays.ArraysUni.muestraArray(prueba2);
		
		///////////////////////////////////////////////////////
		
		System.out.println ("encuentra numero");
		
		numero = Integer.parseInt(System.console().readLine());
		
		prueba2 = arrays.ArraysBi.coordenadasEnArrayBiInt(prueba, numero);
		
		arrays.ArraysUni.muestraArray(prueba2);
		
		///////////////////////////////////////////////////////
		
		System.out.println ("fila");
		
		numero = Integer.parseInt(System.console().readLine());
		
		System.out.println ("columna");
		
		numero2 = Integer.parseInt(System.console().readLine());
		
		boleana = arrays.ArraysBi.esPuntoDeSilla(prueba, numero, numero2);
		
		System.out.println (boleana);
		
		///////////////////////////////////////////////////////
		
		System.out.println ("Introduce fila");
		numero = Integer.parseInt(System.console().readLine());
		
		System.out.println ("Introduce Columna");
		numero2 = Integer.parseInt(System.console().readLine());
		
		prueba2 = arrays.ArraysBi.diagonal(prueba, numero, numero2, neso);
		
		arrays.ArraysUni.muestraArray(prueba2); 
		
		prueba2 = arrays.ArraysBi.diagonal(prueba, numero, numero2, nose);
		
		arrays.ArraysUni.muestraArray(prueba2);
		
		//////////////////////////////////////////////////////
		
		
		
		
		
	
	}
	
}
