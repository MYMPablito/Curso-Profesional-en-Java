
public class Uso_Math {
	
	public static void main(String[] args) {
		
		// Iniciamos con clase Math y empezamos a usar la API de java "Application Programming Interface".
		
		double a = 9;
		
		float b = 8.1F;
		
		
		System.out.println(Math.sqrt(a));
		
		System.out.println(Math.round(Math.sqrt(b)));
		
		// Uso del casting.
		
		double numero = 3.4;
		
		int resultado = (int)Math.round(numero); // Casting
		
		System.out.println(resultado);
	}

}
