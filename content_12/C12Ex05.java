package content_12;
import java.util.Scanner;
public class C12Ex05 {
	public static void main(String[] args) {

		// DECLARA��O DE VETOR
		int[] vet = new int[10];
		int vetMaior;
		Scanner teclado = new Scanner(System.in);
		
		// ESTRUTURA DE REPETI��O
		for (int aux = 0; aux < vet.length; aux++) {
		
			// ENTRADA DE VALOR DOS VETORES
			System.out.println("Informe um valor num�rico inteiro: ");
			vet[aux] = teclado.nextInt();
		}
		vetMaior = vet[0];
		// ESTRUTURA DE REPETI��O
		for (int aux = 1; aux < vet.length; aux++) {
			
			// CONDI��O PARA PESQUISAR O MAIOR VALOR
			if (vet[aux] > vetMaior) {
				vetMaior = vet[aux];
		}}
		
		// SA�DA DE DADOS INFORMANDO O MAIOR VETOR
		System.out.println("Maior valor entre os vetores: "+vetMaior);
		teclado.close();
}}
