
public class DeclaracionMultiplesVariables {
	
	//Siempre y cuando sean del mismo tipo, se pueden declarar e iniciar variables del mismo tipo así:
	//Sirve para ahorrar y optimizar código.
	
	public static void main(String[] args) {
	
	String estudiante1 = "Eric ", estudiante2 = "Facundo ", estudiante3 = "Lucía ", estudiante4 = "Matías ", estudiante5 = "Juan Pablo";
	
	byte edad1 = 17, edad2 = 25, edad3 = 30, edad4 = 21, edad5 = 40;
	
	double kg1 = 66.0, kg2 = 70.5, kg3 = 55.1, kg4 = 61.5, kg5 = 81;
	
	System.out.println("En el curso de java, este año los alumnos son: " + estudiante1 + estudiante2 + estudiante3 + estudiante4 + estudiante5);
	
	System.out.println("Sus edades son: " + edad1 + " " + edad2 + " " + edad3  + " " + edad4 +" "+ edad5);
	
	System.out.println("Su peso al momento de la inscripción: " + kg1 +"  "+ kg2 + "  " + kg3 + "  " + kg4 + "  " + kg5);
	}

}
