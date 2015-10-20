/**
 * Created by Piscis Ferro on 30/04/2015.
 */

import java.util.Scanner;

public class Programa_Main {

    // N determina el tamaño del array
    static int N = 100;
    static int C = 50;

    public static void main (String []args) {

        Scanner teclado = new Scanner(System.in);

        String input;
        int numero;
        String codigo; // String de caciones y Discos
        int opcion;
        int duracionMinima;
        int duracionMaxima;
        int posicionLibre;
        int cancionLibre;
        int cancion;
        int disco = 0;
        boolean codigoLibre = true;
        boolean numeroLibre = true;
        boolean nuevo;
        boolean salir = false;


        // Array de Discos y Canciones

        Disco[] coleccion = new Disco[N];
        Cancion[] canciones = new Cancion[C];


        // Rellena el Array con el objeto Disco vacio y el Array de canciones con objeto Cancion vacio.

        for (int i = 0; i < N; i++) {
            coleccion[i] = new Disco();
        }

        for (int i = 0; i < C; i++) {
            canciones[i] = new Cancion();
        }

        // Menu

        do {

            System.out.println("\nCOLECCIÓN DE DISCOS");
            System.out.println("-------------------");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {

                /*********************************************/
                /****************** Listado ******************/
                /*********************************************/

                case 1:

                    do {
                        System.out.println("\nLISTADO");
                        System.out.println("-------");
                        System.out.println("1. Completo");
                        System.out.println("2. Por autor");
                        System.out.println("3. Por género");
                        System.out.println("4. En un rango de duración");
                        System.out.println("5. Menú principal");
                        System.out.print("Introduzca una opción: ");
                        opcion = Integer.parseInt(teclado.nextLine());

                        switch (opcion) {

                            //////////////////////
                            // Listado Completo //
                            //////////////////////
                            case 1:

                                for (int i = 0; i < N; i++) {
                                    if (!coleccion[i].getCodigo().equals("LIBRE")) {
                                        System.out.println(coleccion[i]);
                                    }
                                }
                                break;

                            ///////////////////////
                            // Listado por autor //
                            ///////////////////////
                            case 2:

                                System.out.println("Introduzca el autor");
                                input = teclado.nextLine();

                                for (int i = 0; i < N; i++) {
                                    if (!coleccion[i].getCodigo().equals("LIBRE") && coleccion[i].getAutor().equals(input)) {
                                        System.out.println(coleccion[i]);
                                    }
                                }
                                break;

                            /////////////////////////
                            // Listado por genero //
                            ///////////////////////

                            case 3:

                                System.out.println("Introduzca el genero");
                                input = teclado.nextLine();

                                for (int i = 0; i < N; i++) {
                                    if (!coleccion[i].getCodigo().equals("LIBRE") && coleccion[i].getGenero().equals(input)) {
                                        System.out.println(coleccion[i]);
                                    }
                                }
                                break;

                            ///////////////////////////////////
                            // Listado por rango de duracion //
                            //////////////////////////////////

                            case 4:

                                System.out.println("Introduzca duracion minima");
                                duracionMinima = Integer.parseInt(teclado.nextLine());
                                System.out.println("Introduzca duracion maxima");
                                duracionMaxima = Integer.parseInt(teclado.nextLine());

                                for (int i = 0; i < N; i++) {
                                    if (!coleccion[i].getCodigo().equals("LIBRE") && coleccion[i].getDuracion() >= duracionMinima && coleccion[i].getDuracion() <= duracionMaxima) {
                                        System.out.println(coleccion[i]);
                                    }
                                }
                                break;
                        }

                    } while(opcion != 5);
                    break;

                /*********************************************/
                /*************** Nuevo Disco *****************/
                /*********************************************/

                case 2:

                    // Busca si hay una posicion libre en el Array

                    posicionLibre = 0;
                    nuevo = true;
                    codigo = coleccion[posicionLibre].getCodigo();

                    while (posicionLibre < N && !codigo.equals("LIBRE")) {
                        posicionLibre++;

                        if (posicionLibre < N) {
                            codigo = coleccion[posicionLibre].getCodigo();
                        }
                    }

                    if (posicionLibre == N) {
                        System.out.println("No hay espacio para un nuevo disco");
                        nuevo = false;
                    } //


                    if (nuevo) {

                        System.out.println("Nuevo Disco");
                        System.out.println("-----------");

                        input = comprobarCodigo(coleccion);

                        /*
                        codigoLibre = false;

                        do {
                            System.out.print("Código: ");
                            input = teclado.nextLine();

                            // Comprueba que el codigo se puede usar

                            for (int i = 0; i < N; i++) {
                                if (coleccion[i].getCodigo().equals(input)) {
                                    codigoLibre = false;
                                    System.out.println("El codigo introducido ya existe. Introduzca otro");
                                    i = N;
                                } else {
                                    codigoLibre = true;
                                }
                            }
                        } while (!codigoLibre); */

                        coleccion[posicionLibre].setCodigo(input);
                        System.out.print("Autor: ");
                        input = teclado.nextLine();
                        coleccion[posicionLibre].setAutor(input);

                        System.out.print("Titulo: ");
                        input = teclado.nextLine();
                        coleccion[posicionLibre].setTitulo(input);


                        System.out.print("Genero: ");
                        input = teclado.nextLine();
                        coleccion[posicionLibre].setGenero(input);

                        ////////////////////
                        // Añadir Cancion //
                        ////////////////////

                        borrar(canciones); // Limpia el array y lo rellena de canciones vacias.

                        do {
                            System.out.println("¿Añadir canción?\n1.Si\n2.No");
                            opcion = Integer.parseInt(teclado.nextLine());

                            if (opcion == 1) {
                                // Comprueba el primer espacio del array libre
                                cancionLibre = 0;
                                while (cancionLibre < C && canciones[cancionLibre].getNumero() != -1) {
                                    cancionLibre++;
                                }

                                if (cancionLibre == C) {
                                    System.out.println("No hay espacio en este disco para mas canciones");
                                    nuevo = false;
                                }

                                if (nuevo) {

                                    numero = comprobarNumero(canciones);

                                    while (numero == -1) {
                                        System.out.println ("Ha habido un error, probablemente no haya escrito nada, " +
                                                "intentelo de nuevo");
                                        numero = comprobarNumero(canciones);
                                    }

                                    /*

                                    do {
                                        System.out.print("Número: ");
                                        numero = Integer.parseInt(teclado.nextLine());
                                        numeroLibre = false;

                                        // Comprueba que el codigo se puede usar

                                        for (int i = 0; i < C; i++) {
                                            if (canciones[i].getNumero() == numero) {
                                                numeroLibre = false;
                                                System.out.println("El numero de cancion introducido ya existe. Introduzca otro");
                                                i = C;
                                            } else {
                                                numeroLibre = true;
                                            }
                                        }
                                    } while (!numeroLibre); */

                                    canciones[cancionLibre].setNumero(numero);

                                    System.out.print("Nombre: ");
                                    input = teclado.nextLine();
                                    canciones[cancionLibre].setNombre(input);

                                    System.out.print("Duración: ");
                                    numero = Integer.parseInt(teclado.nextLine());
                                    canciones[cancionLibre].setDuracion(numero);

                                    coleccion[posicionLibre].setCanciones(canciones);
                                }
                            } else {

                                // En el caso de que no se añadan canciones para que no nos tire error
                                // en el metodo setDuracion() del objeto disco a causa de los nulos.

                                coleccion[posicionLibre].setCanciones(canciones);

                            }

                        } while (opcion != 2);




                    }

                    break;

                /******************************************/
                /*************** Modificar ****************/
                /******************************************/

                case 3:

                    System.out.println("\nMODIFICAR");
                    System.out.println("---------");

                    System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
                    seleccionDisco(coleccion);

                    /*
                    codigoLibre = true;

                    do {

                        input = teclado.nextLine();

                        // Comprueba que el codigo esta

                        disco = -1;

                        for (int i = 0; i < N; i++, disco++) {
                            if (coleccion[i].getCodigo().equals(input)) {
                                codigoLibre = false;
                                i = N;
                            } else {
                                codigoLibre = true;
                            }
                        }

                        if (codigoLibre) {
                            System.out.println("El codigo introducido no existe. Introduzca otro");
                        }

                    } while (codigoLibre); */


                    System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

                    // Codigo

                    System.out.println("Código Actual: " + coleccion[disco].getCodigo());
                    codigo = comprobarCodigo(coleccion);

                    /*

                    codigoLibre = false;

                    do {
                        System.out.println("Código: " + coleccion[x].getCodigo());
                        System.out.print("Nuevo código: ");
                        codigo = teclado.nextLine();

                        // Comprueba que el codigo se puede usar

                        for (int i = 0; i < N; i++) {
                            if (coleccion[i].getCodigo().equals(input)) {
                                codigoLibre = false;
                                System.out.println("El codigo introducido ya existe. Introduzca otro");
                                i = N;
                            } else {
                                codigoLibre = true;
                            }
                        }
                    } while (!codigoLibre);  */

                    if (!codigo.equals("")) {
                        coleccion[disco].setCodigo(codigo);
                    }


                    // Autor

                    System.out.println("Autor: " + coleccion[disco].getAutor());
                    System.out.print("Nuevo autor: ");
                    input = teclado.nextLine();
                    if (!input.equals("")) {
                        coleccion[disco].setAutor(input);
                    }

                    // Titulo

                    System.out.println("Título: " + coleccion[disco].getTitulo());
                    System.out.print("Nuevo título: ");
                    input = teclado.nextLine();
                    if (!input.equals("")) {
                        coleccion[disco].setTitulo(input);
                    }

                    // Genero

                    System.out.println("Género: " + coleccion[disco].getGenero());
                    System.out.print("Nuevo género: ");
                    input = teclado.nextLine();
                    if (!input.equals("")) {
                        coleccion[disco].setGenero(input);
                    }

                    ///////////////////////////////////////
                    ///////// Modificar Canciones /////////
                    ///////////////////////////////////////

                    do {
                        System.out.println("¿Modificar canciónes?\n1.Si\n2.No");
                        opcion = Integer.parseInt(teclado.nextLine());

                        if (opcion == 1) {

                            borrar(canciones);
                            for (int i = 0; i < C; i++) {
                                canciones[i] = coleccion[disco].getCancion(i);
                            }

                            System.out.println("---- CANCIONES ----");

                            for (int i = 0; i < C; i++) {

                                if (canciones[i].getNumero() >= 0) {
                                    System.out.print(canciones[i]);
                                }

                            }

                            System.out.println("\nIntroduce el numero de la cancion que desea modificar.");
                            cancion = seleccionCancion(canciones);


                            /*
                            do {


                                numero = Integer.parseInt(teclado.nextLine());

                                // Comprueba si esta el numero introducido

                                cancion = -1;

                                for (int i = 0; i < C; i++, cancion++) {
                                    if (canciones[i].getNumero() == numero) {
                                        numeroLibre = false;
                                        i = C;
                                    } else {
                                        numeroLibre = true;
                                    }
                                }

                                if (codigoLibre) {
                                    System.out.println("El codigo introducido no existe. Introduzca otro");
                                }

                            } while (numeroLibre); */

                            System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

                            System.out.println("Numero: " + canciones[cancion].getNumero());
                            numero = comprobarNumero(canciones);

                                /*

                                do {
                                    System.out.print("Número: ");
                                    numero = Integer.parseInt(teclado.nextLine());
                                    numeroLibre = false;

                                    // Comprueba que el codigo se puede usar

                                    for (int i = 0; i < C; i++) {
                                        if (canciones[i].getNumero() == numero) {
                                            numeroLibre = false;
                                            System.out.println("El numero de cancion introducido ya existe. Introduzca otro");
                                            i = C;
                                        } else {
                                            numeroLibre = true;
                                        }
                                    }
                                } while (!numeroLibre);  */

                            if (numero != -1) {
                                canciones[cancion].setNumero(numero);
                            }

                            System.out.println("Nombre: " + canciones[cancion].getNombre());
                            System.out.print("Nombre: ");
                            input = teclado.nextLine();
                            if (!input.equals("")) {
                                canciones[cancion].setNombre(input);
                            }

                            System.out.println("Duracion: " + canciones[cancion].getDuracion());
                            System.out.print("Duración: ");
                            input = teclado.nextLine();

                            if (!input.equals("")) {
                                numero = Integer.parseInt(input);
                                canciones[cancion].setDuracion(numero);
                            }

                            coleccion[disco].setCanciones(canciones);

                        }


                    } while (opcion != 2);

                    break;

                case 4:

                    do {

                        System.out.println("\nBORRAR");
                        System.out.println("-----");
                        System.out.println("1. Borrar disco");
                        System.out.println("2. Borrar cancion");
                        System.out.println("3. Menu Principal");
                        opcion = Integer.parseInt(teclado.nextLine());

                        switch (opcion) {

                            case 1:


                                do {
                                    System.out.println("Por favor, introduzca el código del disco que quiere borrar: ");
                                    input = teclado.nextLine();

                                    // Comprueba que el codigo esta

                                    disco = -1;

                                    for (int i = 0; i < N; i++, disco++) {
                                        if (coleccion[i].getCodigo().equals(input)) {
                                            codigoLibre = false;
                                            i = N;
                                        } else {
                                            codigoLibre = true;
                                        }
                                    }

                                    if (codigoLibre) {
                                        System.out.println("El codigo introducido no existe. Introduzca otro");
                                    }

                                } while (codigoLibre);

                                coleccion[disco].setCodigo("LIBRE");
                                System.out.println("Borrado con exito");

                                break;

                            case 2:

                                System.out.println("Introduce el codigo del Disco donde se encuentra la cancion");
                                disco = seleccionDisco(coleccion);

                                /*
                                do {

                                    input = teclado.nextLine();

                                    // Comprueba que el codigo esta

                                    disco = -1;

                                    for (int i = 0; i < N; i++, disco++) {
                                        if (coleccion[i].getCodigo().equals(input)) {
                                            codigoLibre = false;
                                            i = N;
                                        } else {
                                            codigoLibre = true;
                                        }
                                    }

                                    if (codigoLibre) {
                                        System.out.println("El codigo introducido no existe. Introduzca otro");
                                    }

                                } while (codigoLibre); */

                                // Copiamos las canciones del disco al array.

                                borrar(canciones);
                                for (int i = 0; i < C; i++) {
                                    canciones[i] = coleccion[disco].getCancion(i);
                                }

                                // Comprueba si esta el numero introducido y ademas selecciona la cancion

                                System.out.println("Introduzca el codigo de la cancion que desea borrar");
                                cancion = seleccionCancion(canciones);

                                /*
                                do {


                                    numero = Integer.parseInt(teclado.nextLine());

                                    cancion = -1;

                                    for (int i = 0; i < C; i++, cancion++) {
                                        if (canciones[i].getNumero() == numero) {
                                            numeroLibre = false;
                                            i = C;
                                        } else {
                                            numeroLibre = true;
                                        }
                                    }

                                    if (codigoLibre) {
                                        System.out.println("El codigo introducido no existe. Introduzca otro");
                                    }

                                } while (numeroLibre); */

                                canciones[cancion].setNumero(-1);
                                System.out.println("Borrado con exito");

                                break;
                        }
                    } while (opcion != 3);

                    break; // break case 4

                case 5:
                    salir = true;
                    break;
            }

        } while (!salir);

    }

    /**
     * Funcion para recoger y saber si un codigo se puede usar
     *
     * @param coleccion Disco[]
     * @return String
     *
     */

    public static String comprobarCodigo(Disco[] coleccion) {

        Scanner teclado = new Scanner(System.in);

        boolean codigoLibre = true;
        String input;


        do {
            System.out.print("Código: ");
            input = teclado.nextLine();

            // Comprueba que el codigo se puede usar

            if (!input.equals("")) {

                for (int i = 0; i < N; i++) {

                    if (coleccion[i].getCodigo().equals(input)) {
                        codigoLibre = false;
                        System.out.println("El codigo introducido ya existe. Introduzca otro");
                        i = N;
                    } else {
                        codigoLibre = true;
                    }
                }
            }
        } while (!codigoLibre);

        return input;
    }

    /**
     * Funcion para saber si el numero introducido existe
     *
     * @param canciones Cancion[]
     * @return int,  -1 Si el usuario pone espacio en blanco
     *
     */

    public static int comprobarNumero(Cancion[] canciones) {

        Scanner teclado = new Scanner(System.in);

        boolean numeroLibre = false;
        int numero;
        String input;


        do {
            System.out.print("Número: ");
            input = teclado.nextLine();

            if (!input.equals("")) {

                numero = Integer.parseInt(input);

                // Comprueba que el codigo se puede usar

                for (int i = 0; i < C; i++) {
                    if (canciones[i].getNumero() == numero) {
                        numeroLibre = false;
                        System.out.println("El numero de cancion introducido ya existe. Introduzca otro");
                        i = C;
                    } else {
                        numeroLibre = true;
                    }
                }
            } else {
                numero = -1;
                numeroLibre = true;
            }
        }while (!numeroLibre) ;


        return numero;
    }

    /**
     * Selecciona el disco del array
     *
     * @param coleccion Disco[]
     * @return int disco
     */

    public static int seleccionDisco(Disco[] coleccion) {

        Scanner teclado = new Scanner(System.in);

        int disco;
        String input;
        boolean codigoLibre = true;

        do {
            input = teclado.nextLine();

            // Comprueba que el codigo esta

            disco = -1;

            for (int i = 0; i < N; i++, disco++) {
                if (coleccion[i].getCodigo().equals(input)) {
                    codigoLibre = false;
                    i = N;
                } else {
                    codigoLibre = true;
                }
            }

            if (codigoLibre) {
                System.out.println("El codigo introducido no existe. Introduzca otro");
            }

        } while (codigoLibre);

        return disco;
    }

    /**
     * Selecciona la cancion del array.
     *
     * @param canciones Cancion[]
     * @return int cancion
     */

    public static int seleccionCancion (Cancion[] canciones) {

        Scanner teclado = new Scanner(System.in);

        int cancion;
        int numero;
        boolean numeroLibre = true;

        do {

            numero = Integer.parseInt(teclado.nextLine());

            cancion = -1;

            for (int i = 0; i < C; i++, cancion++) {
                if (canciones[i].getNumero() == numero) {
                    numeroLibre = false;
                    i = C;
                } else {
                    numeroLibre = true;
                }
            }

            if (numeroLibre) {
                System.out.println("El numero introducido no existe. Introduzca otro");
            }

        } while (numeroLibre);

        return cancion;
    }


    /**
     * Reinicializa el array para poner todas las canciones a 0
     *
     * @param c Cancion[]
     */

    public static void borrar(Cancion[] c) {

        for (int i = 0; i < C; i++) {
            c[i] = new Cancion();
        }

    }
}
