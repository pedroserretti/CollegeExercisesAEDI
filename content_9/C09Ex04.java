package content_9;
import java.util.Scanner;
public class C09Ex04 {
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS
		double valorNum, valorDen, serieNum = 0;
		int qtTermos;
		
		Scanner teclado = new Scanner(System.in);
		
		// ENTRADA DE DADOS
		System.out.println("Digite a quantidade de termos existentes: ");
		qtTermos = teclado.nextInt();
		
		for (int aux = 4; aux <= qtTermos * 4; aux += 4) {
			
			// C�LCULOS
			valorDen = (aux - 1) * aux;
			valorNum = (aux - 3) * (aux - 2);
			serieNum += valorNum / valorDen;
		}
		
		serieNum = Math.sqrt(serieNum);
		
		// SA�DA DE DADOS
		System.out.print("S�rie: "+serieNum);
		teclado.close();

	}

}
