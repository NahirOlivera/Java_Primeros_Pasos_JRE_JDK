package java_primeros_pasos;

public class TestPuntoFlotante {
	
	public static void main(String[] args) {
		
		double salario = 1250.70;
		System.out.println(salario);
		
		System.out.println("Mi salario es " + salario);
		
		//int valor = 12.5;		NO COMPILA
		
		//int valor2 = 0.0;		NO COMPILA
		
		double test = 125.50;
		System.out.println(test);	//SI COMPILA
		
		//int valor3 = test;	NO COMPILA
		
		int division = 5/2;
		System.out.println(division);	//COMPILA PERO NO MUESTRA EL RESULTADO CORRECTO
		
		double division2 = 5/2;
		System.out.println(division2);	//COMPILA PERO NUEVAMENTE NO NUESTRA EL RESULTADO CORRECTO
		
		double division3 = 5.0 / 2;
		System.out.println(division3);	//COMPILA Y MUESTRA EL RESULTADO CORRECTO
	}
}
