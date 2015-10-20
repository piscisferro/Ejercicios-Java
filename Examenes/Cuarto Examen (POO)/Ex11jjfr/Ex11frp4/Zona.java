public class Zona {
  
  private int entradasPorVender;
  private int entrada;
  private int maximoEntradas;
  private String[] numeroEntrada;
  
  public Zona(int n){
    entradasPorVender = n;
    entrada = 0;
    maximoEntradas = n;
    this.numeroEntrada = new String[n];

    for (int x = 0; x < n; x++) {
			this.numeroEntrada[x] = "Libre";
		}
    
  }
  
  public String toString() {
		
		String entrada = ""; 
		int plaza = 0;
		
		for (String i : this.numeroEntrada) {
			
			plaza++;
			entrada += plaza;
			entrada += ":";
			entrada += i;
			entrada += " ";
			
		}
		
		return entrada;
		
	}
  
  public int getEntradasPorVender() {
    return entradasPorVender;
  }

  public void vender(String n) {
		
		boolean flag = false;
		
		for (int i = 0; i < maximoEntradas; i++) {
			
			if (numeroEntrada[i].equals(n)) {
				
				flag = true;
				numeroEntrada[i] = "Vendida";
				
				System.out.println ("Entrada reservada vendida");
				
			}
			
		}
		
		
		if (!flag) {

			if (entrada == maximoEntradas) {
				System.out.println("Lo siento, las entradas para esa zona están agotadas.");
			} else {
				
				
				
				this.numeroEntrada[entrada] = "Vendida";
				entrada++;
				entradasPorVender--;
				System.out.println("Aquí tiene su entrada, gracias.");
			}
			
		}
  }
  
  public void reservar(int n) {
		
	}
	
	public boolean sePuedeReservar() {
		
		int x = 0;
		String nombre;
		
		if (entrada == maximoEntradas) {
      System.out.println("\n\nLo siento, las entradas para esa zona están agotadas.");
      return false;
		} else {
			System.out.println("\n\nHay entradas libres para la zona elegida. ¿Quiere reservar?");
			System.out.println("1: Si");
			System.out.println("2: No");
			
			x = Integer.parseInt(System.console().readLine());
			
			if (x == 1) {
				
				System.out.println ("Introduce tu nombre");
				nombre = System.console().readLine();
				numeroEntrada[entrada] = nombre;
				entrada++;
				System.out.println ("La entrada ha sido reservada");
				
			}
			
			return true;
			
		}
		
	}
  
}
