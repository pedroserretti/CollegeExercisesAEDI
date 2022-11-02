package content_9;
import java.util.Scanner;
public class C09Ex10E {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS
		Scanner teclado = new Scanner(System.in);
		double valorNum, valorDen, serieNum = 0;
		
		// ESTRUTURA DE REPETIÇÃO
		for (int aux = 1; aux <= 100; aux++) {
			
			// CÁLCULOS
			valorNum = aux;
			valorDen = 3 * (aux * 2);
			serieNum += valorNum/ valorDen;
		}
		
		// SAÍDA DE DADOS
		System.out.println("Série: "+serieNum);
		teclado.close();
	}

}
