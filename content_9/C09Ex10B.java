package content_9;
import java.util.Scanner;
public class C09Ex10B {
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS
		Scanner teclado = new Scanner(System.in);
		double valorNum, valorDen, serieNum = 0;
		 
		// ESTRUTURA DE REPETI��O
		for (int aux = 1; aux <= 100; aux++) {
			
			// C�LCULOS
			valorNum = (aux * 2);
			valorDen = (aux * 3);
			serieNum += valorNum / valorDen;
		}
		
		serieNum = 1 + Math.sqrt(serieNum);
		
		// SA�DA DE DADOS
		System.out.println("S�rie: "+serieNum);
		teclado.close();
	}

}
