package java_primeros_pasos;

public class TestDescuento {
	public static void main(String[] args) {
		
		double valorCompra = 1000.0;
		double descuento = 0.0;
		double valorFinal = valorCompra;

		if (valorCompra >= 100.0) {
		    switch ((int) valorCompra / 100) {
		        case 1:
		            descuento = 10.0;
		            break;
		        case 2:
		            descuento = 15.0;
		            break;
		        default:
		            descuento = 20.0;
		            break;
		    }
		    descuento /= 100.0; // Convertir el descuento a decimal

		    valorFinal = valorCompra - (valorCompra * descuento);
		}

		System.out.println("Valor de la compra: $" + valorCompra);
		System.out.println("Descuento: " + descuento * 100 + "%");
		System.out.println("Valor final: $" + valorFinal);

	}
}
