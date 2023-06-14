package java_primeros_pasos;

public class MientrasWhile {
	public static void main (String[] args) {

        int contador = 1;

        while (contador <= 10) {
            System.out.println (contador);    //si dejamos asi sera un ciclo infinito
            
            contador++;			//generamos el contador que volverá falsa en algun momento la condicion
        }

    }
}
