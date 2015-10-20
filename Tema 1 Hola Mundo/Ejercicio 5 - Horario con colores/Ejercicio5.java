/**
 * Capitulo 1
 * 
 * Ejercicio 5
 * 
 * Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura de un color diferente.
 *
 * @author Juan José Fernández Romero
 */

public class Ejercicio5 {
	public static void main(String[] args){
		
		String rojo = "\033[31m";
		String azul = "\033[34m";
		String verde = "\033[32m";
		String blanco = "\033[37m";
	
	/*** Pongo una nota aqui: En teoria y segun el libro esto asi deberia funcionar sin embargo ****
	 *** en la consola de Windows no se ven los colores, solo los caracteres, al parecer esto   ****
	 *** es debido al parecer porque Geany en windows usa la consola (CMD) de windows y la      **** 
	 *** consola de windows no es compatible con cambios graficos al menos no con el que se     ****
	 *** menciona en el libro                                                                   ****/
	
		System.out.println(rojo + "\tLunes" + "\tMartes" + "\tMiercoles" + "\tJueves" + "\tViernes");
		System.out.println(azul + "8:15" + blanco + "\tProg" + "\tProg" + "\tProg" + "\t" +"\tSIM" + "\tBB.DD");
		System.out.println(azul + "9:15" + blanco + "\tProg" + "\tProg" + "\tProg" + "\t" +"\tSIM" + "\tBB.DD");
		System.out.println(azul + "10:15" + blanco + "\tProg" + "\tLM" + "\tProg" + "\t" +"\tSIM" + "\tBB.DD");
		System.out.println(azul + "11:15" + verde + "\tRecreo" + "\tRecreo" + "\tRecreo" + "\t" +"\tRecreo" + "\tRecreo");
		System.out.println(azul + "11:45" + blanco + "\tFol" + "\tED" + "\tBB.DD" + "\t" +"\tLM" + "\tSIM"); 
		System.out.println(azul + "12:45" + blanco + "\tFol" + "\tED" + "\tBB.DD" + "\t" + "\tLM" + "\tSIM");
		System.out.println(azul + "13:45" + blanco + "\tFol" + "\tED" + "\tBB.DD" + "\t" + "\tLM" + "\tSIM");
	}
}
