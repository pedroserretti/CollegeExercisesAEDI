package content_9;
import java.util.Scanner;
public class C09Ex02 {
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS
		double valorNum, valorDen, serieNum = 0;
		Scanner teclado = new Scanner(System.in);
	     
		// ESTRUTURA DE REPETI��O
		for (int aux = 1; aux <= 100; aux++) {
	         
			// C�LCULOS
			valorNum = aux;
	        valorDen = (aux * aux) + aux - 1;
	        serieNum += valorNum/ valorDen;
	      
		}
	     
		// SA�DA DE DADOS
		System.out.print("S�rie: "+serieNum);
	    teclado.close();

	}

}
