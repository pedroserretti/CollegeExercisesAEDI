package content_9;
import java.util.Scanner;
public class C09Ex06 {
	public static void main(String[] args) {
		
		// ENTRADA DE DADOS
		double valorNum, valorDen, serieNum = 0;
		Scanner teclado = new Scanner(System.in);
		
		// CONDIÇÃO
		for (int aux = 1; aux <= 20; aux++) {
			
			// CÁLCULOS
			valorNum = aux;
			valorDen = Math.sqrt(aux * 2);
			serieNum += valorNum / valorDen;
		}
		
		serieNum = 10 + (serieNum);
		
		// SAÍDA DE DADOS
		System.out.println("Série: "+serieNum);
		teclado.close();
	}

}
