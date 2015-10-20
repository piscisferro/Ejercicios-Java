/**
 * Capitulo 7.1
 * 
 * Ejercicio 5
 * 
 * Escribe un programa que pida 10 números por teclado y que luego muestre los números
 * introducidos junto con las palabras máximo y minimo al lado del máximo y del mínimo
 * respectivamente.
 *
 * @author Juan Jose Fernandez Romero 
 */

import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    int[] numero = new int[10];
    int maximo = 0;
    int minimo = 0;
    
    System.out.println ("Este programa muestra el numero maximo y minimo de 10 numeros introducidos");
    System.out.println ("Introduce los 10 numeros");
    
    for (int i = 0; i < 10; i++) {
      numero[i] = input.nextInt();
      
      if (numero[i] > numero[maximo]) 
	maximo = i;
      
      if (numero[i] < numero[minimo])
	minimo = i;
    }
    
    System.out.println ("----------------");
    System.out.println ("A continuacion de muestran los numeros:");
    
    for (int i = 0; i < 10; i++) {
      if (i == maximo) {
	System.out.println (numero[i] + " Maximo");
      } else if (i == minimo) {
	System.out.println (numero[i] + " Minimo");
      } else {
	System.out.println (numero[i]);
      }
    }
  }
}
