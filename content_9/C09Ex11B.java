package content_9;
import java.util.Scanner;
public class C09Ex11B {
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS
		Scanner teclado = new Scanner(System.in);
		double valorNum, valorDen, serieNum = 0;
		
		// ESTRUTURA DE REPETI��O
		for (int aux = 1; aux <= 100; aux++) {
			
			// C�LCULOS
			valorNum = aux * 3 - 2;
			valorDen = Math.sqrt(valorNum + 6);
			serieNum += valorNum / valorDen;
		}
		
		serieNum = (5 / 3) * (serieNum);
		
		// S�IDA DE DADOS
		System.out.println("S�rie: "+serieNum);
		teclado.close();
	}

}
