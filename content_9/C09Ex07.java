package content_9;
import java.util.Scanner;
public class C09Ex07 {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS
		double valorNum, valorNum2, valorDen, serieNum = 0;
		Scanner teclado = new Scanner(System.in);
		
		// CONDIÇÃO
		for (int aux = 0; aux < 6; aux++) {
			
			// CÁLCULOS
			valorNum = aux * 2;
			valorNum2 = (aux + 1) * 3;
			valorDen = (aux + 1) * 6 + 1;
			serieNum += (valorNum + valorNum2)/ valorDen;
		}
		
		// SAÍDA DE DADOS
		System.out.println("Série: "+serieNum);
		teclado.close();
	}

}
