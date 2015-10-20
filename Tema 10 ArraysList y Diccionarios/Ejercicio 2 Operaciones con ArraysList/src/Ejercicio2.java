/**
 * Created by Piscis Ferro on 21/04/2015.
 *
 * Tema 10 ArrayList
 *
 * Ejercicio 2
 *
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un ArrayList y
 * que luego calcule la suma, la media, el máximo y el mínimo de esos números. El tamaño
 * de la lista también será aleatorio y podrá oscilar entre 10 y 20 elementos ambos inclusive.
 *
 */

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<Integer>();
        int suma = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int media = 0;

        for (int i = 0; i < 10; i++) {
            numList.add((int)(Math.random()*101));
        }

        // Muestra el array

        for (int i : numList) {
            System.out.print (i + ", ");
        }

        // Suma

        for (int i : numList){
            suma += i;
        }

        System.out.println("\nSuma Total: " + suma);

        // Media

        media = suma / numList.size();

        System.out.println("Media: " + media);

        // Maximo

        for (int i : numList){
            if (i > maximo) {
                maximo = i;
            }
        }

        System.out.println("El numero maximo es: " + maximo);

        // Minimo

        for (int i : numList) {
            if (i < minimo) {
                minimo = i;
            }
        }

        System.out.println("El numero minimo es: " + minimo);



    }
}