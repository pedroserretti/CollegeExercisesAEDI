package content_5;
import java.util.Scanner;
import java.lang.Math;
public class C05Ex04 {
	public static void main(String[] args) {
		
		//ENTRADA DE DADOS E DECLARA��O DE VARI�VEIS
		double valueX1, valueX2, valueY1, valueY2, distancia;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o valor da coordenada X1: ");
		valueX1 = teclado.nextDouble();
		
		System.out.println("Informe o valor da coordenada X2: ");
		valueX2 = teclado.nextDouble();
		
		System.out.println("Informe o valor da coordenada Y1: ");
		valueY1 = teclado.nextDouble();
		
		System.out.println("Informe o valor da coordenada Y2: ");
		valueY2 = teclado.nextDouble();
		
		//C�LCULO DA DIST�NCIA
		distancia = Math.sqrt((Math.pow(valueX1 - valueX2, 2) + Math.pow(valueY1 - valueY2, 2)));
		
		//SA�DA DE DADOS
		System.out.println("Dist�ncia: "+distancia);
		teclado.close();
		
		
	}

}
