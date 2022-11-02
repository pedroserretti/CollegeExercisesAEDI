package content_9;
import java.util.Scanner;
public class C09Ex03 {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS
		double valorNum, valorDen, serieNum = 0;
		int qtTermos;
		
		Scanner teclado = new Scanner(System.in);
		
		// ENTRADA DE DADOS
		System.out.println("Digite a quantidade de termos existentes: ");
		qtTermos = teclado.nextInt();
	      
		// CONDIÇÃO
		for (int aux = 1; aux <= qtTermos; aux++) {
	         
			// CÁLCULOS
			valorDen = aux * 3;
	    	valorNum = 1 + Math.sqrt(aux + valorDen);
	        serieNum += valorNum / valorDen;
	    }
	      
		// SAÍDA DE DADOS
		System.out.print("Série: "+serieNum);
		teclado.close();
	}

}
