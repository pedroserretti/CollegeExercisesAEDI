package content_8;
import java.util.Scanner;
public class C08Ex30 {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DEVARIÁVEIS
		double valorNum, valorDen, serie = 0;
		int rep1, valorX;
		Scanner teclado = new Scanner(System.in);
		
		// ENTRADA DE DADOS
		System.out.println("Digite um valor para X: ");
		valorX = teclado.nextInt();
		
		System.out.println("Digite o número de repetições: ");
		rep1 = teclado.nextInt();
		
		// ESTRUTURA DE REPETIÇÃO
		for (int aux = 1; aux <= rep1; aux++) {
			
			// CÁLCULOS
			valorNum = Math.pow(valorX, aux);
			valorDen = aux;
			serie += valorNum / valorDen;
		}
		
		serie = Math.log(valorX) + serie;
		
		// SAÍDA DE DADOS
		System.out.println("Série: "+serie);
		teclado.close();

	}

}
