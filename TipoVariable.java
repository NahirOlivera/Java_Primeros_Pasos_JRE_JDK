package java_primeros_pasos;

public class TipoVariable {
	public static void main(String[] args) {
		/*------>TIPO INT
		 * System.out.println("Hola Mundo!!!");
		
		int edad = 28;
		System.out.println(edad);
		
		edad = 47;
		System.out.println(edad);
		
		edad = 46 + 88;
		System.out.println("Mi edad es " + edad);*/
		
		//---->TIPO DOUBLE
		
		/*double salario = 1250.56;
		System.out.println(salario);
		
		double edad = 28;
		
		double salarioMitad = salario / 2;
		System.out.println(salarioMitad);
		
		int division = 1250 / 3;
		System.out.println(division);
		
		int regalos = 15;
		int personas = 2;
		System.out.println (regalos / personas);*/
		
		//----->CONVERSIONES
		
		double variable1 = 230.89;
		int variable1Entero = (int) variable1;	// ESTO SE DENOMINA CAST
		
		System.out.println(variable1Entero);
		
		//long prueba = 122222222222222222L;	tipo de variable long
		
		
		//OPCIONES PARA REALIZAR OPERACIONES
		
		double resultado = variable1 + variable1Entero; // DECLARO LA VARIABLE COMO DOUBLE PARA EVITAR ERRORES
		System.out.println(resultado);
		
		int resultado2 = (int) variable1 + variable1Entero; // CASTEO VARIABLE1 PARA QUE NO DE ERROR
		System.out.println(resultado2);
		
	}
}
