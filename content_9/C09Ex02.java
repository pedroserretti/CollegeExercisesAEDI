package content_9;
import java.util.Scanner;
public class C09Ex02 {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS
		double valorNum, valorDen, serieNum = 0;
		Scanner teclado = new Scanner(System.in);
	     
		// ESTRUTURA DE REPETIÇÃO
		for (int aux = 1; aux <= 100; aux++) {
	         
			// CÁLCULOS
			valorNum = aux;
	        valorDen = (aux * aux) + aux - 1;
	        serieNum += valorNum/ valorDen;
	      
		}
	     
		// SAÍDA DE DADOS
		System.out.print("Série: "+serieNum);
	    teclado.close();

	}

}
