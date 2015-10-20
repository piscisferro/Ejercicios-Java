/**
 * Created by Piscis Ferro on 21/04/2015.
 *
 * ArraysList
 *
 * Ejercicio 1
 *
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación, muestra
 * esos nombres por pantalla. Utiliza para ello un bucle for que recorra todo el ArrayList sin
 * usar ningún índice.
 *
 */

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {

        ArrayList<String> compClase = new ArrayList<String>();

        compClase.add("Pedro");
        compClase.add("Antonio");
        compClase.add("Jesus");
        compClase.add("Maria");
        compClase.add("Alberto");
        compClase.add("Mayo");

        for (String i : compClase) {
            System.out.println(i);
        }

    }
}