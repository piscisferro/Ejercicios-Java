public class Ex11frp1 {
  public static void main(String[] args) {
		
		Cuadrado cuadrado1 = new Cuadrado ("[", 5);
		Cuadrado cuadrado2 = new Cuadrado ("D", 2);
		Cuadrado cuadrado3 = new Cuadrado ("Q", 7);
		
		// No se como representar rombos cuya altura es par (puesto que no tendrian esquinas)
		// Asi que he hecho que los pares no tengan esquinas.
		
		Rombo rombo1 = new Rombo ("*", 5);
		Rombo rombo2 = new Rombo ("<", 7);
		Rombo rombo3 = new Rombo ("ñ", 4);
		Rombo rombo4 = new Rombo ("T", 6);
		
		System.out.println (cuadrado1 + "\n" + cuadrado2 + "\n" + cuadrado3);
		
		System.out.println (rombo1 + "\n" + rombo2 + "\n" + rombo3 + "\n" + rombo4);
		
		
	}
}
  
