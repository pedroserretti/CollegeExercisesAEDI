package content_9;
import java.util.Scanner;
public class C09Ex11D {
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS
		Scanner teclado = new Scanner(System.in);	
		double valorNum, valorDen, serieNum = 0;
		
		// ESTRUTURA DE REPETI��O
		for (int aux = 0; aux <= 100; aux++) {
			
			// C�LCULOS
			valorNum = Math.pow(aux, 3);
			valorDen = Math.pow(10, aux - 1);
			serieNum += valorNum / valorDen;
		}
		
		// SA�DA DE DADOS
		System.out.println("S�rie: "+serieNum);
		teclado.close();

	}

}
