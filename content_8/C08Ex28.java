package content_8;
import java.util.Scanner;
public class C08Ex28 {
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS
		double valorSoma = 0, valorMedia = 0;
		int cont1 = 0;
	
		Scanner teclado = new Scanner(System.in);
		
		// ESTRUTURA DE REPETI��O
		for (int aux = 1; aux <= 10; aux++) {
			
			// CONDI��O
			if ((aux) * (aux + 1) * (aux + 2) <= 1000) {
				valorSoma += (aux) * (aux + 1) * (aux + 2);
				cont1++;
				System.out.println("O numero "+(aux) * (aux + 1) * (aux + 2) +" � triangular.");
			}
		}
		
		// C�LCULO DA M�DIA
		valorMedia = valorSoma/ cont1;
		
		// SA�DA DE DADOS
		System.out.println("M�dia: "+valorMedia);
		teclado.close();
	}

}
