public class Ex11frp4 {
  public static void main(String[] args) {
		
		Zona principal = new Zona(10);
		Zona compraVenta = new Zona(5);
		Zona vip = new Zona(5);
		
		int opcion = 0, opcion2 = 0, opcion3 = 0, n = 0;
		String nombre;
		
		
		while (opcion < 4) {
			System.out.println("\nEXPOCOCHES CAMPANILLAS");
			System.out.println("1. Mostrar número de entradas libres");
			System.out.println("2. Reservar entrada");
			System.out.println("3. Vender entrada");
			System.out.println("4. Salir");
			System.out.println("Elige una opción: ");
			
			opcion = Integer.parseInt(System.console().readLine());
			
			if (opcion == 1) {
				System.out.println("\n\nEn la zona principal hay " + principal.getEntradasPorVender());
				System.out.println (principal);
				System.out.println("\nEn la zona de compra venta hay " + compraVenta.getEntradasPorVender());
				System.out.println (compraVenta);
				System.out.println("\nEn la zona vip hay " + vip.getEntradasPorVender());
				System.out.println (vip);
			}
			
			if (opcion == 2) {
				boolean reserva = false;
				
				while (!reserva) {
				
					System.out.println("\n1. Principal");
					System.out.println("2. Compra-venta");
					System.out.println("3. Vip");
					System.out.println("4. Salir");
					System.out.print("Elige la zona para la que quieres reservar las entradas: ");
					
					opcion3 = Integer.parseInt(System.console().readLine());
					
					switch ( opcion3 ) {
						case 1 : reserva = principal.sePuedeReservar();	break;
						case 2 : reserva = compraVenta.sePuedeReservar();	break;
						case 3 : reserva = vip.sePuedeReservar(); break;
						case 4 : reserva = true;
					}
				}
				
				
				
				
			}
			
			if (opcion == 3) {
				System.out.println("\n1. Principal");
				System.out.println("2. Compra-venta");
				System.out.println("3. Vip");
				System.out.print("Elige la zona para la que quieres comprar las entradas: ");
				
				opcion2 = Integer.parseInt(System.console().readLine());
				
				System.out.println ("¿Cual es tu nombre?");
				
				nombre = System.console().readLine();
				
				switch ( opcion2 ) {
					case 1 : principal.vender(nombre);	break;
					case 2 : compraVenta.vender(nombre);	break;
					case 3 : vip.vender(nombre);
				}
				
				
			}
		} // while		
	}
}
