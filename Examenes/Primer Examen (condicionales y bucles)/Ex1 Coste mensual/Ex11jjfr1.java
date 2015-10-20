/**
 * Examen
 * 
 * Ejercicio 1
 * 
 * Realiza un programa que calcule el coste mensual del servicio de almacenamiento en la nube de los
 * datos de nuestra empresa. El programa debe pedir el tipo de servicio (un número del 1 al 3) y el
 * número de gigabytes que se han transferido durante el mes. El tipo de servicio, según la velocidad de
 * transferencia, puede ser básico, estándar o premium; con un coste mínimo de 200, 500 y 800 euros al
 * mes respectivamente. El precio mínimo se cobra cuando la transferencia de datos ha sido de 40
 * gigabytes o menos. Si se han transferido más de 40 gigabytes, cada gigabyte extra se paga al 5% del
 * coste base, es decir a 10, 25 o 40 euros según el tipo de servicio. Por ejemplo, un servicio de tipo
 * básico con un tráfico de 20 gigabytes costaría 200 euros. Un servicio de tipo estándar con un tráfico
 * de 50 gigabytes costaría 750 euros (500 + 250).
 *
 * @author Juan Jose Fernandez Romero 
 */

public class Ex11jjfr1 {
	public static void main(String[] args) {
		
		System.out.println ("Este programa calcula el coste mensual de nuestro servicio de almacenamiento");
		System.out.println ("Introduce el tipo de servicio contratado");
		System.out.println ("1 - Basico");
		System.out.println ("2 - Estandar");
		System.out.println ("3 - Premium");
		
		int servicio = 0;
		double base1 = 200;
		double base2 = 500;
		double base3 = 800;		
		double total = 0;
		double extra = 0;
		int i = 0;
		
		do {
		
			servicio = Integer.parseInt(System.console().readLine());
		
			if (servicio > 4 || servicio < 1) {
				System.out.println ("Dato incorrecto por favor introduzca un numero del 1 al 3" + 
									"dependiendo del servicio contratado.");
			}
		
		} while (servicio > 3 || servicio < 1);
		
		System.out.println ("Introduce el numero de GBs transferidos");
		
		double gygabytes = Double.parseDouble(System.console().readLine());
		
		if (gygabytes > 40) {
			for (i = 0; i < gygabytes - 40; i++) {
			}
		}
		
		if (servicio == 1) {			
			extra = (base1 * 0.05) * i;
			total = base1 + extra;
		}
		
		if (servicio == 2) {			
			extra = (base2 * 0.05) * i;
			total = base2 + extra;
		}
		
		if (servicio == 3) {			
			extra = (base3 * 0.05) * i;
			total = base3 + extra;
		}
		
		
		System.out.println ("El coste total es de: ");
		System.out.printf ("%.2f€" , total);
	}
}
