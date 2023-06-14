package java_primeros_pasos;

public class EjemploCondicionales2 {
	public static void main(String[] args) {
		System.out.println("Probando Condicionales");
		
		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja = cantidadPersonas > 1;
		
		System.out.println("El valor de la condición es: " + esPareja);
		
		//CONDICIONAL con OR
		/*
		if(edad >= 18 || cantidadPersonas >= 2) {
			System.out.println("Tienes más de 18 años");
			System.out.println("Bienvenido");
		}
		*/
		
		//CONDICIONAL con AND
		
		if(edad >= 18 && esPareja) {
			System.out.println("Tienes más de 18 años");
			System.out.println("Bienvenido");
		}
		
		else {
			
			System.out.println("Lamentablemente no puedes ingresar");
		}
			
	}
}
