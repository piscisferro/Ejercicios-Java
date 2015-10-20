/**
 * Created by Piscis Ferro on 21/04/2015.
 *
 * Tema 10 ArrayList
 *
 * Ejercicio 3
 *
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa debe ordenar
 * palabras en lugar de números.
 *
 */

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio4 {
    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("Pepe");
        stringList.add("Antonio");
        stringList.add("Cucaracha");
        stringList.add("Zoo");
        stringList.add("Tiranido");
        stringList.add("Dinosario");
        stringList.add("Fulano");
        stringList.add("Piscis");

        for (String i : stringList) {
            System.out.print(i + ",");
        }

        System.out.println();

        Collections.sort(stringList);

        for (String i : stringList) {
            System.out.print(i + ",");
        }

    }
}