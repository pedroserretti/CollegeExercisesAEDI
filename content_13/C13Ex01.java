package content_13;
import java.util.Scanner;
public class C13Ex01 {
	public static void main(String[] args) {

		// DECLARA��O DE VARI�VEIS
		Scanner teclado = new Scanner(System.in);
		double valorX1, valorX2, valorY1, valorY2;
		
		// ENTRADA DE VALORES
		System.out.println("Informe o primeiro valor de X: ");
		valorX1 = teclado.nextDouble();
		
		System.out.println("Informe o segundo valor de X: ");
		valorX2 = teclado.nextDouble();
		
		System.out.println("Informe o primeiro valor de Y: ");
		valorY1 = teclado.nextDouble();
		
		System.out.println("Informe o segundo valor de Y: ");
		valorY2 = teclado.nextDouble();
		
		System.out.println("Dist�ncia: "+valorDist(valorX1, valorX2, valorY1, valorY2));
		teclado.close();
		
	}

	// M�TODO STATIC
	static double valorDist (double valorX1, double valorX2, double valorY1, double valorY2) {
		
		return Math.sqrt((Math.pow(valorX1 - valorX2, 2)) + ((Math.pow(valorY1 - valorY2, 2))));
	}
}
