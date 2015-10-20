/**
 * Created by Piscis Ferro on 30/04/2015.
 */
public class Cancion {


    private String nombre = "";
    private int duracion = 0;
    private int numero = -1;

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String toString() {

        String cadena = "";

        cadena += this.numero + ". ";
        cadena += this.nombre + "    ";
        cadena += this.duracion + " min\n";
        return cadena;

    }

}
