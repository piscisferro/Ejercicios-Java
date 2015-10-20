/**
 * Examen A
 * 
 * Ejercicio 2
 * 
 * Realiza un programa que pinte por pantalla un plano inclinado construido con ladrillos (carácter #) y que tiene la
 * caída de izquierda a derecha. Sobre este plano inclinado rueda una bolita (la letra O). El dibujo será como una
 * fotografía de la bolita rodando. La bolita se colocará de forma aleatoria sobre una de las posibles posiciones que
 * puede ocupar en el plano inclinado desde lo alto hasta tocar el suelo. La altura del plano inclinado será indicada
 * por el usuario y deberá ser mayor o igual a 3.
 *
 * 
 * @Fecha 03/12/1993
 * 
 * @author Juan Jose Fernandez Romero 
 */

public class Ex11jjfr2 {
	public static void main(String[] args) {
		
		int altura = 0;
		int bolita = 0;
		
		System.out.println ("Este programa pinta una semipiramide caida hacia la derecha" + 
							"ademas pintara de forma aleatoria una bolita cayendo");
							
		do {
			
		System.out.println ("Introduce la altura de la semipiramide (numero entero mayor a 3)");
		altura = Integer.parseInt(System.console().readLine());
		
		} while (altura < 3);
		
		System.out.println ();
		
		bolita = (int)((Math.random() * altura) + 1);
		
		for (int i = 1; i <= altura; i++) {
			
			for (int x = 0; x < i; x++) 
				System.out.print ("#");
			
			if (i == bolita) 
				System.out.print ("O");
			
			
			System.out.println();
		}
		
		
	}
	
}
