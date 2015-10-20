/**
 * Capitulo 9
 * 
 * Ejercicio 1
 * 
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando instancias y
 * aplicándole algunos métodos.
 *
 * @author Juan Jose Fernandez Romero 
 */

public class Ejercicio1 {
	public static void main(String[] args) {

		
		Caballo caballo1 = new Caballo("Calcetines", "Negro", "Macho", 150, 8);
		Caballo caballo2 = new Caballo("Lancitas", "blanca", "Hembra", 100, 12);
		Caballo caballo3 = new Caballo("El-Rapido", "amarillo como el rayo", "Machote", 120, 7);
		
		System.out.println("Soy " + caballo1.getNombre() + " soy de color " + caballo1.getColor() + " y " + caballo1.getSexo() + 
											" peso " + caballo1.getPeso() + " Kg y tengo " + caballo1.getEdad() + " años");
											
		System.out.println("Soy " + caballo2.getNombre() + " soy de color " + caballo2.getColor() + " y " + caballo2.getSexo() + 
											" peso " + caballo2.getPeso() + " Kg y tengo " + caballo2.getEdad() + " años");
								
		System.out.println("Soy " + caballo3.getNombre() + " soy de color " + caballo3.getColor() + " y " + caballo3.getSexo() + 
											" peso " + caballo3.getPeso() + " Kg y tengo " + caballo3.getEdad() + " años");
											
		
											
		// Damos de comer a los caballos
		
		caballo1.come("paja");
		caballo2.come("esparragos");
		
		// Ponemos a correr a los caballos
		
		carrera(caballo1, caballo2, caballo3);

	}
	
	public static void carrera (Caballo c1, Caballo c2, Caballo c3) {
		
		int x = (int)((Math.random() * 3) + 1);
		
		System.out.println ("\nEmpieza la carrera entre: " + c1.getNombre() + ", " + c2.getNombre() + " y " + c3.getNombre() + "!!!");
		
		System.out.println ("\nLa carrera ha empezado! " + nombreAleatorio(c1, c2, c3) + " va en cabeza, atencion porque " + nombreAleatorio(c1, c2, c3) + 
												" esta dando mucha guerra y !" + nombreAleatorio(c1, c2, c3) + " esta ganando mucho terreno! ¿Quien ganara?\n");
												
		
		switch (x) {
			case 1: 
				System.out.println ("!Aqui tenemos la respuesta! ha ganado " + c1.getNombre());
				break;
			
			case 2:
				System.out.println ("!Aqui tenemos la respuesta! ha ganado " + c2.getNombre());
				break;
			
			case 3:
				System.out.println ("!Aqui tenemos la respuesta! ha ganado " + c3.getNombre());
				break;
			
		}
		
	}
	
	public static String nombreAleatorio (Caballo c1, Caballo c2, Caballo c3) { // Pasamos objetos como parametros
		
		int x = (int)((Math.random() * 3) + 1);
		
		
		switch (x) {
			case 1: 
				return c1.getNombre();
			
			case 2:
				return c2.getNombre();
			
			case 3:
				return c3.getNombre();
				
			default:
				return c1.getNombre();
			
			
		}
		
		
	}
	
	
	
}


