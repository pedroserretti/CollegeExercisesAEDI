package content_9;
import java.util.Scanner;
public class C09Ex11C {
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS
		Scanner teclado = new Scanner(System.in);
		double valorNum1, valorNum2, valorDen, serieNum = 0;
	
		// ESTRUTURA DE REPETI��O
		for (int aux = 1; aux <= 100; aux++) {
			
			// C�LCULOS
			valorNum1 = (aux * 2 + 1);
			valorNum2 = Math.sqrt(valorNum1 * 2 - 1);
			valorDen = Math.pow(5, aux);
			serieNum += (valorNum1 * valorNum2)/ valorDen;
		}
		
		serieNum = Math.pow(serieNum, 2);
		
		// SA�DA DE DADOS
		System.out.println("S�rie: "+serieNum);
		teclado.close();
	}

}
