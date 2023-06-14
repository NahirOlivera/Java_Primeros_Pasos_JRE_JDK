package java_primeros_pasos;

public class TestConversion {
	
	public static void main(String[] args) {
		
		//float puntoFlotante = 3.14;
		/*
		 NO COMPILA. Tendremos un error, ya que, para Java, 3.14 es un double. 
		 En el tipo double podemos almacenar 64 bits, en el float y en el int solo 32 bits.
		 Esto puede provocar la pérdida de información, para que este código funcione, 
		 podemos hacer el casting, colocar (float) delante de 3.14
		 */
		
		/* PARA QUE FUNCIONE EN VEZ DE REALIZAR UN CAST LE DIREMOS A JAVA
		 ESPECIFICAMENTE QUE puntoFotante ES UN FLOAT AGREGANDO LA "F" 
		 */
		
		float puntoFlotante = 3.14F;
		
		double salario = 1270.5;
		
		/* int valor = salario;
		 NO COMPILA ya que estamos tratando de asignar
		 una variable DOUBLE dentro de una variable INT.
		 Sin embargo hacer lo inverso es posible
		 */
		
		//PARA QUE COMPILE USAREMOS CAST
		
		int valor = (int) salario;
		System.out.println (valor);
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		System.out.println(total);
		
		
	}
}
