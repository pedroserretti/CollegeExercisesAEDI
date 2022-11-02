package content_9;
import java.util.Scanner;
public class C09Ex11C {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS
		Scanner teclado = new Scanner(System.in);
		double valorNum1, valorNum2, valorDen, serieNum = 0;
	
		// ESTRUTURA DE REPETIÇÃO
		for (int aux = 1; aux <= 100; aux++) {
			
			// CÁLCULOS
			valorNum1 = (aux * 2 + 1);
			valorNum2 = Math.sqrt(valorNum1 * 2 - 1);
			valorDen = Math.pow(5, aux);
			serieNum += (valorNum1 * valorNum2)/ valorDen;
		}
		
		serieNum = Math.pow(serieNum, 2);
		
		// SAÍDA DE DADOS
		System.out.println("Série: "+serieNum);
		teclado.close();
	}

}
