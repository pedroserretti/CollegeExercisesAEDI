package content_9;
import java.util.Scanner;
public class C09Ex04 {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS
		double valorNum, valorDen, serieNum = 0;
		int qtTermos;
		
		Scanner teclado = new Scanner(System.in);
		
		// ENTRADA DE DADOS
		System.out.println("Digite a quantidade de termos existentes: ");
		qtTermos = teclado.nextInt();
		
		for (int aux = 4; aux <= qtTermos * 4; aux += 4) {
			
			// CÁLCULOS
			valorDen = (aux - 1) * aux;
			valorNum = (aux - 3) * (aux - 2);
			serieNum += valorNum / valorDen;
		}
		
		serieNum = Math.sqrt(serieNum);
		
		// SAÍDA DE DADOS
		System.out.print("Série: "+serieNum);
		teclado.close();

	}

}
