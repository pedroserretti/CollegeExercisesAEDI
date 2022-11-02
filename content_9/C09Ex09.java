package content_9;
import java.util.Scanner;
public class C09Ex09 {
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS
		Scanner teclado = new Scanner (System.in);
		int qtTermos;
		double valorNum, valorDen, serieNum = 0;
		
		// ENTRADA DE DADOS
		System.out.println("Informe o numero de termos: ");
		qtTermos = teclado.nextInt();
		
		// ESTRUTURA DE REPETI��O
		for (int aux = 1; aux <= qtTermos; aux++) {
			
			// C�LCULOS
			valorNum = Math.pow(3, aux + 1);
			valorDen = (aux + 9)*Math.sqrt(Math.pow(aux, 4)); 
			serieNum += valorNum / valorDen;
		}
		
		serieNum = 100 - (Math.pow(serieNum, 3));
		
		// SA�DA DE DADOS
		System.out.println("S�rie: "+serieNum);
		teclado.close();

	}

}
