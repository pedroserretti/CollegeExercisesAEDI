package content_8;
import java.util.Scanner;
public class C08Ex30 {
	public static void main(String[] args) {
		
		// DECLARA��O DEVARI�VEIS
		double valorNum, valorDen, serie = 0;
		int rep1, valorX;
		Scanner teclado = new Scanner(System.in);
		
		// ENTRADA DE DADOS
		System.out.println("Digite um valor para X: ");
		valorX = teclado.nextInt();
		
		System.out.println("Digite o n�mero de repeti��es: ");
		rep1 = teclado.nextInt();
		
		// ESTRUTURA DE REPETI��O
		for (int aux = 1; aux <= rep1; aux++) {
			
			// C�LCULOS
			valorNum = Math.pow(valorX, aux);
			valorDen = aux;
			serie += valorNum / valorDen;
		}
		
		serie = Math.log(valorX) + serie;
		
		// SA�DA DE DADOS
		System.out.println("S�rie: "+serie);
		teclado.close();

	}

}
