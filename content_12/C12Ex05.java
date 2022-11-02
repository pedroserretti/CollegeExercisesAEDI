package content_12;
import java.util.Scanner;
public class C12Ex05 {
	public static void main(String[] args) {

		// DECLARAÇÃO DE VETOR
		int[] vet = new int[10];
		int vetMaior;
		Scanner teclado = new Scanner(System.in);
		
		// ESTRUTURA DE REPETIÇÃO
		for (int aux = 0; aux < vet.length; aux++) {
		
			// ENTRADA DE VALOR DOS VETORES
			System.out.println("Informe um valor numérico inteiro: ");
			vet[aux] = teclado.nextInt();
		}
		vetMaior = vet[0];
		// ESTRUTURA DE REPETIÇÃO
		for (int aux = 1; aux < vet.length; aux++) {
			
			// CONDIÇÃO PARA PESQUISAR O MAIOR VALOR
			if (vet[aux] > vetMaior) {
				vetMaior = vet[aux];
		}}
		
		// SAÍDA DE DADOS INFORMANDO O MAIOR VETOR
		System.out.println("Maior valor entre os vetores: "+vetMaior);
		teclado.close();
}}
