public class Cuadrado extends Figura {
	
	private int lado;

	public Cuadrado (String c, int l) {
		
		this.lado = l;
		this.caracter = c;
		
	}
		
		public String toString() {
			
			int i, espacios;
			String resultado = "";
			
			for (i = 0; i < this.lado; i++) {
				resultado += caracter;
			}
			
			resultado += "\n";
			
			for (i = 1; i < this.lado - 1; i++) {
				resultado += caracter;
				for (espacios = 1; espacios < this.lado - 1; espacios++) {
					resultado += " ";
				}
				resultado += caracter;
				resultado += "\n";
			}
			
			for (i = 0; i < this.lado; i++) {
				resultado += caracter;
			}
			
			resultado += "\n";
			return resultado;
			
		}

	
	
}
