package content_9;
import java.util.Scanner;
public class C09Ex06 {
	public static void main(String[] args) {
		
		// ENTRADA DE DADOS
		double valorNum, valorDen, serieNum = 0;
		Scanner teclado = new Scanner(System.in);
		
		// CONDI��O
		for (int aux = 1; aux <= 20; aux++) {
			
			// C�LCULOS
			valorNum = aux;
			valorDen = Math.sqrt(aux * 2);
			serieNum += valorNum / valorDen;
		}
		
		serieNum = 10 + (serieNum);
		
		// SA�DA DE DADOS
		System.out.println("S�rie: "+serieNum);
		teclado.close();
	}

}
