/**
 * Created by Piscis Ferro on 21/04/2015.
 *
 * Tema 10 ArrayList
 *
 * Ejercicio 3
 *
 * Escribe un programa que ordene 10 números enteros introducidos por teclado y almacenados
 * en un objeto de la clase ArrayList.
 *
 */

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numList.add((int)(Math.random()*101));
        }

        for (int i : numList) {
            System.out.print(i + ",");
        }

        System.out.println();

        Collections.sort(numList);

        for (int i : numList) {
            System.out.print(i + ",");
        }

    }
}