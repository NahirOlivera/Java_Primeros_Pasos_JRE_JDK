package java_primeros_pasos;

public class DesafioFactorial {
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i ++) {
			int factorial = 1;
			
			for(int n = 1; n <= i; n++) {
				factorial *= n;
			}
			System.out.println("El factorial de " + i + "! = "
					+ factorial);
		}
	}
}
