/**
 * Capitulo 7.1
 * 
 * Ejercicio 6
 * 
 * Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota
 * los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición
 * 1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
 * posición 0. Finalmente, muestra el contenido del array.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    int[] numero = new int[15];
    
    System.out.println ("Este programa lee 15 numeros introducidos y para luego mostrarlos rotando.");
    System.out.println ("Introduce los 15 numeros");
    
    for (int i = 0; i < 15; i++) {
      numero[i] = input.nextInt();
    }
    
    System.out.println ("----------------");
    System.out.println ("A continuacion de muestran los numeros rotados:");
    
    System.out.println (numero[14]);
    
    for (int i = 0; i < 14; i++) 
      System.out.println (numero[i]);
      
  }
}
