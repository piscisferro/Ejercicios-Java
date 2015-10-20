/**
 * Capitulo 4
 * 
 * Ejercicio 10
 * 
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio10 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Este programa te dira tu horoscopo a partir del dia y mes en el cual naciste");
		System.out.println ("Introduce el mes de tu cumpleaños.");
		
		String mes = input.nextLine();
		mes = mes.toLowerCase();
		
		System.out.println ("Introduce el dia de tu cumpleaños.");
		
		int dia = input.nextInt();
		
		
		if (((mes.equals ("1") || mes.equals ("01") || mes.equals("enero")) && (dia >= 20)) 
		|| ((mes.equals ("2") || mes.equals ("02") || mes.equals("febrero")) && (dia <= 17))) {
			
			System.out.println ("Eres Acuario");
			
		} else if (((mes.equals ("2") || mes.equals ("02") || mes.equals("febrero")) && (dia >= 18)) 
		|| ((mes.equals ("3") || mes.equals ("03") || mes.equals("marzo")) && (dia <= 19))) {
			
			System.out.println ("Eres Piscis");
			
		} else if (((mes.equals ("3") || mes.equals ("03") || mes.equals("marzo")) && (dia >= 20)) 
		|| ((mes.equals ("4") || mes.equals ("04") || mes.equals("abril")) && (dia <= 19))) {
			
			System.out.println ("Eres Aries");
			
		} else if (((mes.equals ("4") || mes.equals ("04") || mes.equals("abril")) && (dia >= 20)) 
		|| ((mes.equals ("5") || mes.equals ("05") || mes.equals("mayo")) && (dia < 20))) {
			
			System.out.println ("Eres Tauro");
			
		} else if (((mes.equals ("5") || mes.equals ("05") || mes.equals("mayo")) && (dia >= 21)) 
		|| ((mes.equals ("6") || mes.equals ("06") || mes.equals("junio")) && (dia < 20))) {
			
			System.out.println ("Eres Geminis");
			
		} else if (((mes.equals ("6") || mes.equals ("06") || mes.equals("junio")) && (dia >= 21)) 
		|| ((mes.equals ("7") || mes.equals ("07") || mes.equals("julio")) && (dia < 22))) {
			
			System.out.println ("Eres Cancer");
			
		} else if (((mes.equals ("7") || mes.equals ("07") || mes.equals("julio")) && (dia >= 23)) 
		|| ((mes.equals ("8") || mes.equals ("08") || mes.equals("agosto")) && (dia < 22))) {
			
			System.out.println ("Eres Leo");
			
		} else if (((mes.equals ("8") || mes.equals ("08") || mes.equals("agosto")) && (dia >= 23)) 
		|| ((mes.equals ("9") || mes.equals ("09") || mes.equals("septiembre")) && (dia < 22))) {
			
			System.out.println ("Eres Virgo");
			
		} else if (((mes.equals ("9") || mes.equals ("09") || mes.equals("septiembre")) && (dia >= 23)) 
		|| ((mes.equals ("10") || mes.equals("octubre")) && (dia < 22))) {
			
			System.out.println ("Eres Libra");
			
		} else if (((mes.equals ("10") || mes.equals("octubre")) && (dia >= 23)) 
		|| ((mes.equals ("11") || mes.equals("noviembre")) && (dia < 21))) {
			
			System.out.println ("Eres Escorpio");
			
		} else if (((mes.equals ("11") || mes.equals("noviembre")) && (dia >= 22)) || ((mes.equals ("12") 
		|| mes.equals("diciembre")) && (dia < 21))) {
			
			System.out.println ("Eres Sagitario");
			
		} else if(((mes.equals ("12") || mes.equals("diciembre")) && (dia >= 22)) || ((mes.equals ("1") 
		|| mes.equals ("01") || mes.equals("enero")) && (dia < 22))) {
			
			System.out.println ("Eres capricornio");
			
		} else {
			
			System.out.println ("Felicidades has encontrado un Bug en el programa");
			System.out.println ("!Contacte con soporte!");
			
		}
	}
}
