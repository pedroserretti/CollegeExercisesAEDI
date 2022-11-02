package content_9;
import java.util.Scanner;
public class C09Ex11D {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS
		Scanner teclado = new Scanner(System.in);	
		double valorNum, valorDen, serieNum = 0;
		
		// ESTRUTURA DE REPETIÇÃO
		for (int aux = 0; aux <= 100; aux++) {
			
			// CÁLCULOS
			valorNum = Math.pow(aux, 3);
			valorDen = Math.pow(10, aux - 1);
			serieNum += valorNum / valorDen;
		}
		
		// SAÍDA DE DADOS
		System.out.println("Série: "+serieNum);
		teclado.close();

	}

}
