package content_12;
import java.util.Scanner;
public class C12Ex01 {
	public static void main(String[] args) {

		// DECLARA��O DE VARI�VEIS
		int vet[] = new int [10], cont = 0;
		Scanner teclado = new Scanner(System.in);
		
		// ESTRUTURA DE REPETI��O
		for (int aux = 0; aux<vet.length; aux++) {
			
			// ENTRADA DE DADOS, VALORES DOS VETORES,
			System.out.println("Informe um valor num�rico inteiro: ");
			vet[aux] = teclado.nextInt();
			
			// LEITURA DA QUANTIDADE DE N�MEROS DIVIS�VEIS POR 5 E 7
			if (vet[aux] % 5 == 0 && vet[aux] % 7 == 0) {
				cont++;
			}
		}
		
		// SA�DA DE DADOS
		for (int aux = 0; aux<vet.length; aux++) {
			System.out.println("Valores informados: "+vet[aux]);
		}
		
		// SA�DA E CONTADOR DE N�MEROS DIVIS�VEIS POR 5 E 7
		System.out.println();
		System.out.println("Quantidade de divisores de 5 e 7 ao mesmo tempo: "+cont);
		teclado.close();
			
		
	}

}
