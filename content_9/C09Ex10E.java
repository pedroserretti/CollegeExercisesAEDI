package content_9;
import java.util.Scanner;
public class C09Ex10E {
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS
		Scanner teclado = new Scanner(System.in);
		double valorNum, valorDen, serieNum = 0;
		
		// ESTRUTURA DE REPETI��O
		for (int aux = 1; aux <= 100; aux++) {
			
			// C�LCULOS
			valorNum = aux;
			valorDen = 3 * (aux * 2);
			serieNum += valorNum/ valorDen;
		}
		
		// SA�DA DE DADOS
		System.out.println("S�rie: "+serieNum);
		teclado.close();
	}

}
