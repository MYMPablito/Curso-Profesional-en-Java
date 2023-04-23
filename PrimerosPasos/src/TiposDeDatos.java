
public class TiposDeDatos {

	public static void main(String[] args) {
		
									// TIPOS DE DATOS PRIMITIVOS EN JAVA
		
		//Enteros:
		
		int edad = 32; //4 bytes de espacio para almacenamiento. Desde -2,147,483,648 hasta 2,147,483,647
		
		short año = 2023; //2 bytes. Desde -32,768 hasta 32,767
		
		long tiempo = 80000000L; //8 bytes. Desde -9.223.372.036.854.775.808 hasta 9.223.372.036.854.775.807. Usa sufijo L.
		
		byte hora = 1; //1 byte. Desde -128 hasta 127.
		
		//Coma flotante (decimales)
		
		float peso = 82.5f; //4 bytes. Aprox. 6 a 7 cifras decimales significativas. Usa sufijo F.
		
		double gravedad = 9.5; //8 bytes. Aprox. 15 cifras decimales significativas.
		
		//Boleanos:
		
		//boolean  True; //Valores booleanos, si/no, True/False.
		
		//Caracteres:
		
		char primerLetra = 'a'; //Representar caracteres uno a la vez.
		
		//Las cadenas de caracteres, en Java, NO SON un tipo de dato primitivo, sino que son un objeto y se usan así:
		
		String nombre = "Pablo";
		
		System.out.println("Tengo " + edad + " años" + " y vivo en el año " + año);
		
		System.out.println("Hace " + hora + " hora fuí al museo y vi que los dinosaurios vivieron hace " + tiempo + " millones de años");
		
		System.out.println("Mi nombre es " + nombre + " y le segunda letra es " + primerLetra);
		
		System.out.println(tiempo);
		
		System.out.println(peso);
		
		System.out.println(gravedad);
		
		
	}
	
	

}
