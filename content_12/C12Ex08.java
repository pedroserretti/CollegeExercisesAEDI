package content_12;
import java.util.Scanner;
public class C12Ex08 {
	public static void main(String[] args) {

		int vet[] = new int[20]; // Declaração de vetor
		Scanner teclado = new Scanner(System.in); // Leitura do Scanner
		
		for (int aux = 0; aux < vet.length; aux++) { // Estrutura de repetição dos vetores
			
			System.out.println("Informe um valor numérico inteiro: "); // Entrada do valor do vetor
			vet[aux] = teclado.nextInt();
		}
		for (int aux = 0; aux < 10; aux++) { // Repetição do valor final dos vetores
			System.out.println("Soma "+(aux + 1)+" :"+(vet[aux] + vet[aux + 10])); // Impressão do somatório de 10 vetores
		}
		teclado.close();
}}
