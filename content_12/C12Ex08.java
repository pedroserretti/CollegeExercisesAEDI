package content_12;
import java.util.Scanner;
public class C12Ex08 {
	public static void main(String[] args) {

		int vet[] = new int[20]; // Declara��o de vetor
		Scanner teclado = new Scanner(System.in); // Leitura do Scanner
		
		for (int aux = 0; aux < vet.length; aux++) { // Estrutura de repeti��o dos vetores
			
			System.out.println("Informe um valor num�rico inteiro: "); // Entrada do valor do vetor
			vet[aux] = teclado.nextInt();
		}
		for (int aux = 0; aux < 10; aux++) { // Repeti��o do valor final dos vetores
			System.out.println("Soma "+(aux + 1)+" :"+(vet[aux] + vet[aux + 10])); // Impress�o do somat�rio de 10 vetores
		}
		teclado.close();
}}
