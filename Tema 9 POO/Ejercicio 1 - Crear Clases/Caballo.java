public class Caballo {
	
	private String nombre, color, sexo;
	private int peso, edad;
	
	public Caballo (String n, String c, String s, int p, int e) {
		
		this.nombre = n;
		this.color = c;
		this.sexo = s;
		this.peso = p;
		this.edad = e;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public int getPeso() {
		return this.peso;
	}
	
	public String getColor () {
		return this.color;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void come (String comida) {
		
		if (comida.equals("paja")) {
			System.out.println ("Que rico, me encanta la paja.");
		} else {
			System.out.println ("Que asco, solo me gusta la paja");
		}
	}
}
