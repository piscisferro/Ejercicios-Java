public class Disco {
    private static int C = 50;
    private String codigo = "LIBRE";
    private String autor, titulo, genero;
    private int duracion; // duracion total en minutos
    private Cancion[] canciones = new Cancion[C];

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        setDuracion();
        return duracion;
    }

    public void setDuracion() {
        int duracion = 0;

        for (int i = 0; i < C; i++) {
            if (canciones[i].getDuracion() > 0 && canciones[i].getNumero() >= 0) {
                duracion += canciones[i].getDuracion();
            }
            this.duracion = duracion;
        }
    }


    public Cancion getCancion(int indice) {
        return this.canciones[indice];
    }

    public void setCanciones(Cancion[] c) {
        for(int i = 0; i < C; i++) {
            this.canciones[i] = c[i];
        }

    }

    public String toString() {

        setDuracion(); // Actualizamos la duraccion del disco

        String cadena = "------------------------------------";
        cadena += "\nCódigo: " + this.codigo;
        cadena += "\nAutor: " + this.autor;
        cadena += "\nTítulo: " + this.titulo;
        cadena += "\nGénero: " + this.genero;
        cadena += "\nDuración: " + this.duracion + " min";
        cadena += "\n------------- Canciones ----------------\n";

        // Aqui añadimos al toString todas las canciones.

        for (int i = 0; i < C; i++) {
            if (canciones[i].getNumero() > -1) {
                cadena += canciones[i];
            }
        }

        return cadena;
    }

}