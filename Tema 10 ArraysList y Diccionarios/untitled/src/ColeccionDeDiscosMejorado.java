/*
 * 
 * 4. Modifca el programa �Colecci�n de discos� como se indica a continuaci�n:
 *     a) Mejora la opci�n �Nuevo disco� de tal forma que cuando se llenen todas
 *        las posiciones del array, el programa muestre un mensaje de error. No se
 *        permitir� introducir los datos de ning�n disco hasta que no se borre alguno
 *        de la lista.
 *     b) Mejora la opci�n �Borrar� de tal forma que se verifique que el c�digo
 *        introducido por el usuario existe.
 *     c) Modifca el programa de tal forma que el c�digo del disco sea �nico, es
 *        decir que no se pueda repetir.
 *     d) Crea un submen� dentro dentro de �Listado� de tal forma que exista un
 *        listado completo, un listado por autor (todos los discos que ha publicado un
 *        determinado autor), un listado por g�nero (todos los discos de un g�nero
 *        determinado) y un listado de discos cuya duraci�n est� en un rango
 *        determinado por el usuario.
 *         
 * @author Luis Jos� S�nchez
 *         
 *         
 */

public class ColeccionDeDiscosMejorado {

    // N determina el tama�o del array
    static int N = 100;

    public static void main(String[] args) {

        int i;
        String codigoIntroducido = "", codigo, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducidaString;
        int opcion, opcionListado, duracionIntroducida, primeraLibre = -1, limiteInferior, limiteSuperior;
        boolean existeCodigo = true;

        //Crea el array de discos
        Disco[] album = new Disco[N];

        // Crea todos los discos que van en cada una de
        // las celdas del array
        for(i = 0; i < N; i++)
            album[i] = new Disco();

        // Menu
        do {
            System.out.println("\n\nCOLECCI�N DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Introduzca una opci�n: ");
            opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {

                /////////////////////////////////////////////////////////////////////////////
                // LISTADO //////////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////

                case 1:
                    do {
                        System.out.println("\nLISTADO");
                        System.out.println("=======");
                        System.out.println("1. Completo");
                        System.out.println("2. Por autor");
                        System.out.println("3. Por g�nero");
                        System.out.println("4. En un rango de duraci�n");
                        System.out.println("5. Men� principal");
                        System.out.print("Introduzca una opci�n: ");
                        opcionListado = Integer.parseInt(System.console().readLine());

                        switch (opcionListado) {

                            case 1:

                                // Listado completo ////////////////

                                for(i = 0; i < N; i++) {
                                    if (!album[i].getCodigo().equals("LIBRE")) {
                                        System.out.println("------------------------------------------");
                                        System.out.println("C�digo: " + album[i].getCodigo());
                                        System.out.println("Autor: " + album[i].getAutor());
                                        System.out.println("T�tulo: " + album[i].getTitulo());
                                        System.out.println("G�nero: " + album[i].getGenero());
                                        System.out.println("Duraci�n: " + album[i].getDuracion());
                                        System.out.println("------------------------------------------");
                                    }
                                }

                                break;


                            case 2:

                                // Listado por autor ////////////////

                                System.out.print("Introduzca el autor: ");
                                autorIntroducido = System.console().readLine();

                                for(i = 0; i < N; i++) {
                                    if ( (!album[i].getCodigo().equals("LIBRE")) && (album[i].getAutor().equals(autorIntroducido)) ){
                                        System.out.println("------------------------------------------");
                                        System.out.println("C�digo: " + album[i].getCodigo());
                                        System.out.println("Autor: " + album[i].getAutor());
                                        System.out.println("T�tulo: " + album[i].getTitulo());
                                        System.out.println("G�nero: " + album[i].getGenero());
                                        System.out.println("Duraci�n: " + album[i].getDuracion());
                                        System.out.println("------------------------------------------");
                                    }
                                }

                                break;


                            case 3:

                                // Listado por g�nero ////////////////

                                System.out.print("Introduzca el g�nero: ");
                                generoIntroducido = System.console().readLine();

                                for(i = 0; i < N; i++) {
                                    if ( (!album[i].getCodigo().equals("LIBRE")) && (album[i].getGenero().equals(generoIntroducido)) ){
                                        System.out.println("------------------------------------------");
                                        System.out.println("C�digo: " + album[i].getCodigo());
                                        System.out.println("Autor: " + album[i].getAutor());
                                        System.out.println("T�tulo: " + album[i].getTitulo());
                                        System.out.println("G�nero: " + album[i].getGenero());
                                        System.out.println("Duraci�n: " + album[i].getDuracion());
                                        System.out.println("------------------------------------------");
                                    }
                                }

                                break;


                            case 4:

                                // Listado en un rango de duraci�n ////////////////

                                System.out.println("Establezca el intervalo para la duraci�n");
                                System.out.print("Introduzca el l�mite inferior de duraci�n en minutos: ");
                                limiteInferior = Integer.parseInt(System.console().readLine());
                                System.out.print("Introduzca el l�mite superior de duraci�n en minutos: ");
                                limiteSuperior = Integer.parseInt(System.console().readLine());

                                for(i = 0; i < N; i++) {
                                    if ( (!album[i].getCodigo().equals("LIBRE")) && (album[i].getDuracion() <= limiteSuperior) && (album[i].getDuracion() >= limiteInferior) ){
                                        System.out.println("------------------------------------------");
                                        System.out.println("C�digo: " + album[i].getCodigo());
                                        System.out.println("Autor: " + album[i].getAutor());
                                        System.out.println("T�tulo: " + album[i].getTitulo());
                                        System.out.println("G�nero: " + album[i].getGenero());
                                        System.out.println("Duraci�n: " + album[i].getDuracion());
                                        System.out.println("------------------------------------------");
                                    }
                                }

                        } // switch (opcionListado)



                    } while (opcionListado != 5);

                    break;


                /////////////////////////////////////////////////////////////////////////////
                // NUEVO DISCO //////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////
                case 2:
                    System.out.println("\nNUEVO DISCO");
                    System.out.println("===========");

                    // Busca la primera posici�n libre del array
                    primeraLibre = 0;
                    codigo = album[primeraLibre].getCodigo();
                    while ((primeraLibre < N) && (!(codigo.equals("LIBRE")))) {
                        primeraLibre++;
                        if (primeraLibre < N)
                            codigo = album[primeraLibre].getCodigo();
                    }

                    if (primeraLibre == N) {
                        System.out.println("Lo siento, a base de datos est� llena.");
                    } else {
                        System.out.println("Por favor, introduzca los datos del disco.");
                        System.out.print("C�digo: ");

                        // Comprueba que el c�digo introducido no se repita
                        existeCodigo = true;
                        while (existeCodigo) {
                            existeCodigo = false;
                            codigoIntroducido = System.console().readLine();

                            for (i = 0; i < N; i++)
                                if (codigoIntroducido.equals(album[i].getCodigo()))
                                    existeCodigo = true;

                            if (existeCodigo) {
                                System.out.println("Ese c�digo ya existe en la base de datos.");
                                System.out.print("Introduzca otro c�digo: ");
                            }
                        } // while (existeCodigo)

                        album[primeraLibre].setCodigo(codigoIntroducido);

                        System.out.print("Autor: ");
                        autorIntroducido = System.console().readLine();
                        album[primeraLibre].setAutor(autorIntroducido);

                        System.out.print("T�tulo: ");
                        tituloIntroducido = System.console().readLine();
                        album[primeraLibre].setTitulo(tituloIntroducido);

                        System.out.print("G�nero: ");
                        generoIntroducido = System.console().readLine();
                        album[primeraLibre].setGenero(generoIntroducido);

                        System.out.print("Duraci�n: ");
                        duracionIntroducida = Integer.parseInt(System.console().readLine());
                        album[primeraLibre].setDuracion(duracionIntroducida);
                    }

                    break;


                /////////////////////////////////////////////////////////////////////////////
                // MODIFICAR ////////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////

                case 3:
                    System.out.println("\nMODIFICAR");
                    System.out.println("===========");

                    System.out.print("Por favor, introduzca el c�digo del disco cuyos datos desea cambiar: ");
                    codigoIntroducido = System.console().readLine();

                    i = -1;
                    do i++;
                    while (!((album[i].getCodigo()).equals(codigoIntroducido)));

                    System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

                    System.out.println("C�digo: " + album[i].getCodigo());
                    System.out.print("Nuevo c�digo: ");
                    codigoIntroducido = System.console().readLine();
                    if (!codigoIntroducido.equals(""))
                        album[i].setCodigo(codigoIntroducido);

                    System.out.println("Autor: " + album[i].getAutor());
                    System.out.print("Nuevo autor: ");
                    autorIntroducido = System.console().readLine();
                    if (!autorIntroducido.equals(""))
                        album[i].setAutor(autorIntroducido);

                    System.out.println("T�tulo: " + album[i].getTitulo());
                    System.out.print("Nuevo t�tulo: ");
                    tituloIntroducido = System.console().readLine();
                    if (!tituloIntroducido.equals(""))
                        album[i].setTitulo(tituloIntroducido);

                    System.out.println("G�nero: " + album[i].getGenero());
                    System.out.print("Nuevo g�nero: ");
                    generoIntroducido = System.console().readLine();
                    if (!generoIntroducido.equals(""))
                        album[i].setGenero(generoIntroducido);

                    System.out.println("Duraci�n: " + album[i].getDuracion());
                    System.out.print("Duraci�n: ");
                    duracionIntroducidaString = System.console().readLine();
                    if (!duracionIntroducidaString.equals(""))
                        album[i].setDuracion(Integer.parseInt(duracionIntroducidaString));

                    break;


                /////////////////////////////////////////////////////////////////////////////
                // BORRAR ///////////////////////////////////////////////////////////////////
                /////////////////////////////////////////////////////////////////////////////

                case 4:
                    System.out.println("\nBORRAR");
                    System.out.println("======");

                    System.out.print("Por favor, introduzca el c�digo del disco que desea borrar: ");
                    codigoIntroducido = System.console().readLine();

                    i = -1;
                    codigo = "";
                    do {
                        System.out.println(i);
                        i++;
                        if (i < N)
                            codigo = album[i].getCodigo();
                    } while (!(codigo.equals(codigoIntroducido)) && (i < N));

                    System.out.println(i);

                    if (i == N)
                        System.out.println("Lo siento, el c�digo introducido no existe.");
                    else {
                        album[i].setCodigo("LIBRE");
                        System.out.println("Album borrado.");
                    }

            } // switch

        } while (opcion != 5);


    }

}
