package content_9;
import java.util.Scanner;
public class C09Ex03 {
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS
		double valorNum, valorDen, serieNum = 0;
		int qtTermos;
		
		Scanner teclado = new Scanner(System.in);
		
		// ENTRADA DE DADOS
		System.out.println("Digite a quantidade de termos existentes: ");
		qtTermos = teclado.nextInt();
	      
		// CONDI��O
		for (int aux = 1; aux <= qtTermos; aux++) {
	         
			// C�LCULOS
			valorDen = aux * 3;
	    	valorNum = 1 + Math.sqrt(aux + valorDen);
	        serieNum += valorNum / valorDen;
	    }
	      
		// SA�DA DE DADOS
		System.out.print("S�rie: "+serieNum);
		teclado.close();
	}

}
