package content_9;
import java.util.Scanner;
public class C09Ex10C {
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS
		Scanner teclado = new Scanner(System.in);
		double valorNum, valorDen, serieNum = 0;
		
		// ESTRUTURA DE REPETI��O
		for (int aux = 1; aux <= 100; aux++) {
			
			// C�LCULOS
			valorDen = aux * 2;
			valorNum = valorDen - 1;
			serieNum += valorNum / valorDen;
		}
		
		serieNum = 1 / 3 * (Math.pow(serieNum, 2));
		
		// SA�DA DE DADOS
		System.out.println("S�rie: "+serieNum);
		teclado.close();
		}
		
	}


