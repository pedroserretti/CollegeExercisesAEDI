package content_9;
import java.util.Scanner;
public class C09Ex08 {
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS
		double valorNum, valorNum2, valorDen, serieNum = 0;
		Scanner teclado = new Scanner(System.in);
		
		// ESTRUTURA DE REPETI��O
		for (int aux = 1; aux <= 20; aux++) {
			
			// C�LCULOS
			valorNum = aux * 2 + 1;
			valorNum2 = aux * 4 + 1;
			valorDen = Math.pow(5, aux);
			serieNum += (valorNum * Math.sqrt(valorNum2))/ valorDen;
		}
		
		serieNum = Math.pow(serieNum, 2);
		
		// SA�DA DE DADOS
		System.out.println("S�rie: "+serieNum);
		teclado.close();
}}
