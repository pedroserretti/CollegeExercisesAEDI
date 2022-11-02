package content_9;
import java.util.Scanner;
public class C09Ex05 {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS
		double valorNum, valorNum2, valorDen, serieNum = 0;
		int qtTermos;
		
		Scanner teclado = new Scanner(System.in);
		
		// ENTRADA DE DADOS
		System.out.println("Informe a quantidade de termos: ");
		qtTermos = teclado.nextInt();
		
		// CONDIÇÃO
		for (int aux = 0; aux < qtTermos; aux++) {
			
			// CÁLCULOS
			valorNum = aux * 2;
			valorNum2 = (aux + 1) * 3;
			valorDen = (aux + 1) * 6 + 1;
			serieNum += (valorNum + valorNum2)/ valorDen;
		}
		
		serieNum = 5 * (serieNum);
		
		// SAÍDA DE DADOS
		System.out.println("Série: "+serieNum);
		teclado.close();
	}

}
