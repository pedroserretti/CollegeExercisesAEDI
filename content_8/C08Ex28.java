package content_8;
import java.util.Scanner;
public class C08Ex28 {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS
		double valorSoma = 0, valorMedia = 0;
		int cont1 = 0;
	
		Scanner teclado = new Scanner(System.in);
		
		// ESTRUTURA DE REPETIÇÃO
		for (int aux = 1; aux <= 10; aux++) {
			
			// CONDIÇÃO
			if ((aux) * (aux + 1) * (aux + 2) <= 1000) {
				valorSoma += (aux) * (aux + 1) * (aux + 2);
				cont1++;
				System.out.println("O numero "+(aux) * (aux + 1) * (aux + 2) +" é triangular.");
			}
		}
		
		// CÁLCULO DA MÉDIA
		valorMedia = valorSoma/ cont1;
		
		// SAÍDA DE DADOS
		System.out.println("Média: "+valorMedia);
		teclado.close();
	}

}
