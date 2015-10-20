public class Ex11frp2 {
  public static void main(String[] args) {
    Usuario usu1 = new Usuario("Carmen", "Varo Gómez", "carmenvg@gmail.com");
    Usuario usuAux = new Usuario("Virginia", "Vázquez Martínez", "virgi84@yahoo.com");
    Usuario usu2 = new Usuario("Jesús", "Pombo López", "jpl789@yahoo.com");
    usuAux.activa();
    usu2.activa();
    System.out.println(usu1);
    System.out.println(usuAux);
    System.out.println(usu2);
    System.out.println("Nº de usuarios activados: " + Usuario.getActivados());
    
  }
}

