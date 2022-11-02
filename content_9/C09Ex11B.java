package content_9;
import java.util.Scanner;
public class C09Ex11B {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS
		Scanner teclado = new Scanner(System.in);
		double valorNum, valorDen, serieNum = 0;
		
		// ESTRUTURA DE REPETIÇÃO
		for (int aux = 1; aux <= 100; aux++) {
			
			// CÁLCULOS
			valorNum = aux * 3 - 2;
			valorDen = Math.sqrt(valorNum + 6);
			serieNum += valorNum / valorDen;
		}
		
		serieNum = (5 / 3) * (serieNum);
		
		// SÁIDA DE DADOS
		System.out.println("Série: "+serieNum);
		teclado.close();
	}

}
