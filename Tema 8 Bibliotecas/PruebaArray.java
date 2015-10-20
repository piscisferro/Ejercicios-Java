import arrays.ArraysUni;
import utilidades.Utilidades;

public class PruebaArray {
	public static void main (String[] args) {
		
		int prueba[];
		float numero4;
		boolean flag = false;
		
		System.out.println ("Introduce longitud");
		
		int numero = Integer.parseInt(System.console().readLine());
		
		System.out.println ("Introduce intervalo minimo");
		int numero2 = Integer.parseInt(System.console().readLine());
		
		System.out.println ("Intervalo Maximo");
		int numero3 = Integer.parseInt(System.console().readLine());
		
		prueba = arrays.ArraysUni.generaArrayInt(numero, numero2, numero3);
		
		arrays.ArraysUni.muestraArray(prueba);
		
		/////////////////////////////////////
		 
		numero = arrays.ArraysUni.minimoArrayInt(prueba);
		
		System.out.println ("minimo " + numero);
		
		/////////////////////////////////////
		
		numero = arrays.ArraysUni.maximoArrayInt(prueba);
		
		System.out.println ("maximo " + numero);
		
		/////////////////////////////////////
		
		numero4 = arrays.ArraysUni.mediaArrayInt(prueba);
		
		System.out.println ("media " + numero4);
		
		/////////////////////////////////////
		
		System.out.println ("Introduce numero a encontrar");
		
		numero = Integer.parseInt(System.console().readLine());
		
		flag = arrays.ArraysUni.estaEnArrayInt(prueba, numero);
		
		System.out.println ("numero encontrado: " + flag);
		
		/////////////////////////////////////
		
		System.out.println ("Introduce numero a encontrar");
		
		numero = Integer.parseInt(System.console().readLine());
		
		numero2 = arrays.ArraysUni.posicionEnArray(prueba, numero);
		
		System.out.println ("Posicion del numero " + numero2);
		
		/////////////////////////////////////
		
	  arrays.ArraysUni.volteaArrayInt(prueba);
	  
	  arrays.ArraysUni.muestraArray(prueba);
	  
	  ////////////////////////////////////
	  
	  System.out.println ("Rota n posiciones derecha");
		
		numero = Integer.parseInt(System.console().readLine());
	  
	  arrays.ArraysUni.rotaDerechaArrayInt(prueba, numero);
	  
	  arrays.ArraysUni.muestraArray(prueba);
	  
	  ///////////////////////////////////
	  
	  System.out.println ("Rota n posiciones izquierda");
		
		numero = Integer.parseInt(System.console().readLine());
	  
	  arrays.ArraysUni.rotaIzquierdaArrayInt(prueba, numero);
	  
	  arrays.ArraysUni.muestraArray(prueba);
		
		
		
	}
}
