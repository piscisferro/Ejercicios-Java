public class Usuario {
	
	private String nombre, apellidos, email;
	private boolean activado;
	private int contraseña;
	private static int activados = 0;
	
	
	public Usuario (String n, String a, String e) {
		
		this.nombre = n;
		this.apellidos = a;
		this.email = e;
		this.activado = false;		
		
	}
	
	public void activa() {
		
		this.activado = true;
		activados++;
		this.contraseña = (int)(Math.random() * 8999999 + 1000000);
		
	}

	public static int getActivados() {
		
		return activados;
		
	}
	
	public String toString() {
		String usuario = this.apellidos;
		usuario+= ", ";
		usuario+= this.nombre;
		usuario+= " <";
		usuario+= this.email;
		usuario+= "> - ";
		
		if (this.activado) {
			
			usuario+= contraseña;
			
		} else {
			
			usuario+= "Usuario no Activado";
			
		}
		
		return usuario;
	}
}

