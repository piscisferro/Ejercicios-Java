public class Ex11frp3 {
  public static void main(String[] args) {
		
		Tiempo t1 = new Tiempo(4, 22, 30, 33);
    Tiempo t2 = new Tiempo(2, 15, 40, 55);
    Tiempo t3 = new Tiempo(5, 13, 20, 50);
        
    System.out.println (t1 + "\n" + t2 + "\n" + t3 + "\n");
		System.out.println(t1 + " + " + t2 + " = " + t1.suma(t2));
		System.out.println(t2 + " - " + t3 + " = " + t2.resta(t3));	
		
	}
}
