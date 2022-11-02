package content_9;
import java.util.Scanner;
public class C09Ex11E {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS
		Scanner teclado = new Scanner (System.in);
		double valorNum, valorDen, serieNum = 0;
		
		// ESTRUTURA DE REPETIÇÃO
		for (int aux = 0; aux <= 100; aux++) {
			
			// CÁLCULOS
			valorNum = (aux * aux) * Math.sqrt(2 * aux + 3);
			valorDen = Math.pow(aux + 1, aux);
			serieNum += valorNum/ valorDen;
		}
		serieNum = (2 / 3) * (serieNum);
		
		// SAÍDA DE DADOS
		System.out.println("Série: "+serieNum);
		teclado.close();
	}

}
