/**
 * Examen A
 * 
 * Ejercicio 3
 * 
 * Escribe un programa que genere la tabla de entrenamiento de un usuario de un gimnasio. El programa debe
 * pedir el día de la semana (un número del 1 al 7) y debe mostrar de forma aleatoria la secuencia del
 * entrenamiento en función de las siguientes pautas:
 * - El entrenamiento empieza siempre con un calentamiento que puede ser bicicleta, elíptica o cinta.
 * - A continuación sigue el entrenamiento de un grupo muscular grande y de uno pequeño. Los grupos musculares
 * grandes son espalda, pecho y piernas y los grupos musculares pequeños son biceps, triceps y hombros.
 * - El entrenamiento finaliza con abdominales o con ejercicio aeróbico (bicicleta, elíptica o cinta). En caso de
 * finalizar con aeróbico, no se puede repetir el ejercicio que se hizo en el calentamiento.
 * - Los miércoles y los domingos son días de descanso.
 *
 * @Fecha 03/12/1993
 * 
 * @author Juan Jose Fernandez Romero 
 */

public class Ex11jjfr3 {
	public static void main(String[] args) {
		
		int dia = 0;
		boolean entrenamiento = false;
		int calentamiento = 0;
		int grupoGrande = 0;
		int grupoPequeño = 0;
		int fin = 0;
		
		System.out.println ("Este programa mostrara una tabla de entrenamiento aleatoria para" + 
							"el dia de la semana elegido");
							
							
		do {				
			System.out. println ("Selecciona el dia (numero del 1 al 7)");
			System.out. println ("1 - Lunes");
			System.out. println ("2 - Martes");
			System.out. println ("3 - Miercoles");
			System.out. println ("4 - Jueves");
			System.out. println ("5 - Viernes");
			System.out. println ("6 - Sabado");
			System.out. println ("7 - Domingo");
		
			dia = Integer.parseInt(System.console().readLine()); 
			
			System.out.println ();
			
		} while (dia > 7 || dia < 1);
		
		switch (dia) {
			case 1:
			case 2:
				entrenamiento = true;
				break;
			case 3:
				entrenamiento = false;
				break; 
			case 4:
			case 5:
			case 6:
				entrenamiento = true;
				break;
			case 7:
				entrenamiento = false;
				break;
		}
			
			
		if (!entrenamiento) 
			System.out.println ("Hoy toca descansar");
				
		if (entrenamiento) {
				
			calentamiento = (int)((Math.random() * 3) + 1);
			grupoGrande = (int)((Math.random() * 3) + 1);
			grupoPequeño = (int)((Math.random() * 3) + 1);
			fin = (int)((Math.random() * 4) + 1);
				
			System.out.println ("Hoy toca:");
			System.out.print ("Para calentamiento --> ");
				
			switch (calentamiento) {
					 
				 case 1: 
				 	System.out.println ("bicicleta");
				 	break;
				 case 2:
					System.out.println ("cinta");
					break;
				case 3:
					System.out.println ("eliptica");
					break;
			}
				
			System.out.print ("Grupo muscular grande --> ");
				
			switch (grupoGrande) {
				case 1:
					System.out.println ("Espalda");
					break;
				case 2: 
					System.out.println ("Pecho");
					break;
				case 3:
					System.out.println ("Piernas");
					break;
			}
				
			System.out.print ("Grupo muscular pequeño --> ");
				
			switch (grupoPequeño) {
				case 1:
					System.out.println ("Biceps");
					break;
				case 2: 
					System.out.println ("Triceps");
					break;
				case 3:
					System.out.println ("Hombros");
					break;
			}
			
			while (fin == calentamiento) {
				fin = (int)((Math.random() * 4) + 1);
			}
			
			System.out.print ("Para finalizar --> ");
			
			switch (fin) {
				case 1: 
				 	System.out.println ("bicicleta");
				 	break;
				 case 2:
					System.out.println ("cinta");
					break;
				case 3:
					System.out.println ("eliptica");
					break;
				case 4:
					System.out.println ("abdominales");
					break;
			}
			
		}

	}
}
