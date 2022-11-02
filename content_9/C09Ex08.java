package content_9;
import java.util.Scanner;
public class C09Ex08 {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS
		double valorNum, valorNum2, valorDen, serieNum = 0;
		Scanner teclado = new Scanner(System.in);
		
		// ESTRUTURA DE REPETIÇÃO
		for (int aux = 1; aux <= 20; aux++) {
			
			// CÁLCULOS
			valorNum = aux * 2 + 1;
			valorNum2 = aux * 4 + 1;
			valorDen = Math.pow(5, aux);
			serieNum += (valorNum * Math.sqrt(valorNum2))/ valorDen;
		}
		
		serieNum = Math.pow(serieNum, 2);
		
		// SAÍDA DE DADOS
		System.out.println("Série: "+serieNum);
		teclado.close();
}}
