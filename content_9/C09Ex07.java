package content_9;
import java.util.Scanner;
public class C09Ex07 {
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS
		double valorNum, valorNum2, valorDen, serieNum = 0;
		Scanner teclado = new Scanner(System.in);
		
		// CONDI��O
		for (int aux = 0; aux < 6; aux++) {
			
			// C�LCULOS
			valorNum = aux * 2;
			valorNum2 = (aux + 1) * 3;
			valorDen = (aux + 1) * 6 + 1;
			serieNum += (valorNum + valorNum2)/ valorDen;
		}
		
		// SA�DA DE DADOS
		System.out.println("S�rie: "+serieNum);
		teclado.close();
	}

}
