package java_primeros_pasos;

public class TesBucles2 {
	public static void main(String[] args) {
		/*for (int fila = 0; fila < 10; fila++) {
            for(int columna = 0; columna < 10; columna++) {
                if (columna > fila) {
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
        MODIFICAMOS EL CODIGO PARA HACERLO MAS FUNCIONAL
        
        Eliminamos el if y cambiamos los criterios del for interno para:
		columna <= fila

        */
		
		for (int fila = 0; fila < 10; fila++) {
            for(int columna = 0; columna <= fila; columna++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
