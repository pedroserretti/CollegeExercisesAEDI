package content_9;
import java.util.Scanner;
public class C09Ex10C {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS
		Scanner teclado = new Scanner(System.in);
		double valorNum, valorDen, serieNum = 0;
		
		// ESTRUTURA DE REPETIÇÃO
		for (int aux = 1; aux <= 100; aux++) {
			
			// CÁLCULOS
			valorDen = aux * 2;
			valorNum = valorDen - 1;
			serieNum += valorNum / valorDen;
		}
		
		serieNum = 1 / 3 * (Math.pow(serieNum, 2));
		
		// SAÍDA DE DADOS
		System.out.println("Série: "+serieNum);
		teclado.close();
		}
		
	}


