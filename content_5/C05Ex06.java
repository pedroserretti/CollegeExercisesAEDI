package content_5;
import java.util.Scanner;
import java.lang.Math;
public class C05Ex06 {
	public static void main(String[] args) {
		
		//ENTRADA DE DADOS E DECLARA��O DE VARI�VEIS
		int valorX, valorY, valorA, valorB, valorC;
		double distRP;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		valorA = teclado.nextInt();
		
		System.out.println("Informe o valor de B: ");
		valorB = teclado.nextInt();
		
		System.out.println("Informe o valor de C: ");
		valorC = teclado.nextInt();
		
		System.out.println("Informe o valor de X: ");
		valorX = teclado.nextInt();
		
		System.out.println("Informe o valor de Y: ");
		valorY = teclado.nextInt();
		
		//VALOR DA DIST�NCIA
		distRP = ((valorA * valorX) + (valorB * valorY) + valorC)/ Math.sqrt((Math.pow(valorA, 2) + Math.pow(valorB, 2)));
		
		//SA�DA DE DADOS
		System.out.println("Dist�ncia: "+distRP);
		teclado.close();
	}

}
