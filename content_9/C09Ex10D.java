package content_9;
import java.util.Scanner;
public class C09Ex10D {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS
		Scanner teclado = new Scanner(System.in);
		double valorNum, valorDen, serieNum = 0;
		
		// ESTRUTURA DE REPETIÇÃO
		for (int aux = 1; aux <= 100; aux++) {
			
			// CÁLCULOS
			valorNum = aux + aux - 1;
			valorDen = (aux * aux);
			serieNum += valorNum/ valorDen;
		}
		
		// SAÍDA DE DADOS
		System.out.println("Série: "+serieNum);
		teclado.close();
	}

}
