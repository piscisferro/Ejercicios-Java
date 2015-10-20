/**
 * 
 * Capitulo 4
 * 
 * Ejercicio 1
 * 
 * Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura
 * toca a primera hora ese día.
 * 
 */

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println ("Este programa te dira que asignatura tienes a primera hora");
		System.out.println ("Introduce el dia de la semana");
		
		String dia = entrada.next();
		dia = dia.toLowerCase();
		
		switch (dia) {
			
			case "lunes":
			System.out.println ("Los Lunes a primera hora tienes Programacion.");
			break;
			
			case "martes":
			System.out.println ("Los Martes a primera hora tienes Programacion.");
			break;
			
			case "miercoles":
			System.out.println ("Los Miercoles a primera hora tienes Programacion.");
			break;
			
			case "jueves":
			System.out.println ("Los Jueves a primera hora tienes Sistemas Informaticos.");
			break;
			
			case "viernes":
			System.out.println ("Los Viernes a primera hora tienes Base de Datos.");
			break;
			
			case "sabado":
			System.out.println ("Los sabados a dormir hasta tarde.");
			break;
			
			case "domingo":
			System.out.println ("Fiestuki.");
			break;
			
		}
	}
}
