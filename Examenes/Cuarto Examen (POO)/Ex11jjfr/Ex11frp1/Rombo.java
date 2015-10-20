public class Rombo extends Figura {
	
	private int altura;
	
	public Rombo (String c, int a) {
		
		this.altura = a;
		this.caracter = c;
	}

	
	
	public String toString() {
		int i = 0;
		int posicion = 0; 
		String resultado = "";
		
		
		///////////////////////////////// Si es par //////////////////////////7
		
		if ((altura % 2) == 0) {
			
			// Parte de arriba
			
			
			for (i = 0; i < altura/2; i++) {

				
				while (posicion < (altura/2 - i)) {
					resultado+= " ";
					posicion++;
				}
				
				while (posicion == altura/2 - i){
					resultado+= caracter;
					posicion++;
				}
				
				
				if (i != (altura - 1)) {
					while (posicion < (altura/2 + i)) {
						resultado+= " ";
						posicion++;
					}
				} else {
					while (posicion < (altura/2 + i)) {
						resultado+= caracter;
						posicion++;			
					}	
				}			
				
				while (posicion == altura/2 + i) {
					resultado+= caracter;
					posicion++;
				}
				
				resultado+= "\n";
				posicion = 0;
			}
			
			// Parte de abajo
			
			
			
			for (i = (altura/2) - 1; i >= 0; i--) {
				
				while (posicion < (altura/2 - i)) {
					resultado+= " ";
					posicion++;
				}
				
				while (posicion == altura/2 - i){
					resultado+= caracter;
					posicion++;
				}
				
				
				if (i != (altura - 1)) {
					while (posicion < (altura/2 + i)) {
						resultado+= " ";
						posicion++;
					}
				} else {
					while (posicion < (altura/2 + i)) {
						resultado+= caracter;
						posicion++;			
					}	
				}			
				
				while (posicion == altura/2 + i) {
					resultado+= caracter;
					posicion++;
				}
				
				resultado+= "\n";
				posicion = 0;
				
			}
		}
			
		////////////////////// Si es Impar ////////////////////////////////////
			
			else {
		
			// Parte de arriba
			
			
			for (i = 0; i < altura/2; i++) {

				
				while (posicion < (altura/2 - i)) {
					resultado+= " ";
					posicion++;
				}
				
				while (posicion == altura/2 - i){
					resultado+= caracter;
					posicion++;
				}
				
				
				if (i != (altura - 1)) {
					while (posicion < (altura/2 + i)) {
						resultado+= " ";
						posicion++;
					}
				} else {
					while (posicion < (altura/2 + i)) {
						resultado+= caracter;
						posicion++;			
					}	
				}			
				
				while (posicion == altura/2 + i) {
					resultado+= caracter;
					posicion++;
				}
				
				resultado+= "\n";
				posicion = 0;
			}
			
			// Parte de abajo
			
			
			
			for (i = altura/2; i >= 0; i--) {
				
				while (posicion < (altura/2 - i)) {
					resultado+= " ";
					posicion++;
				}
				
				while (posicion == altura/2 - i){
					resultado+= caracter;
					posicion++;
				}
				
				
				if (i != (altura - 1)) {
					while (posicion < (altura/2 + i)) {
						resultado+= " ";
						posicion++;
					}
				} else {
					while (posicion < (altura/2 + i)) {
						resultado+= caracter;
						posicion++;			
					}	
				}			
				
				while (posicion == altura/2 + i) {
					resultado+= caracter;
					posicion++;
				}
				
				resultado+= "\n";
				posicion = 0;
				
			}
		}
		
		return resultado;
	}
}


	
