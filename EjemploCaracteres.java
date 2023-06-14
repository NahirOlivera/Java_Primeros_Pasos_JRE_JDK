package java_primeros_pasos;

public class EjemploCaracteres {
	
	public static void main(String[] args) {
		char caracter = 'a';
		System.out.println(caracter);
		
		caracter = 65;
		System.out.println(caracter);
		
		caracter = 65 + 1;
		System.out.println(caracter);
		
		/*
		 char segundoCaracter = caracter + 1; 
		 
		 NO COMPILA porque estoy tratando de sumar una variable 
		 que esta declarada como tipo CHAR con un 
		 número que es del tipo INT
		 */
		
		// PARA QUE FUNCIONE DEBEMOS CASTEAR EL RESULTADO DE LA SUMA DE LA SGTE MANERA
		
		char segundoCaracter = (char)(caracter + 1);
		System.out.println(segundoCaracter);
		
		String palabra = "Alura cursos online";
		System.out.println(palabra);
		
		palabra = palabra + " 2023";
		System.out.println(palabra);
	}

}
