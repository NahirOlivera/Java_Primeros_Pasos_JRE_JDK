package java_primeros_pasos;

public class ProgramaErrorCompil {
	public static void main(String[] args) {

        /*while (contador <= 10) {
            int contador = 1;            
            System.out.println(contador);
            contador++;
        }
        ESTE CÓDIGO NO COMPILA ya que estamos inicializando
        la variable contador dentro del bucle lo cual 
        hará que se reinicie en cada iteración
        */
		
		int contador = 1;        

        while (contador <= 10) {        
            System.out.println(contador);
            contador++;
        }

    }
}
