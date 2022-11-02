package content_12;
import java.util.Scanner;
public class C12Ex09 {
	public static void main(String[] args) {

		int vet[] = new int[10]; // Declaração de vetores
		int somaVet = 0;
		Scanner teclado = new Scanner(System.in); // Leitura do Scanner
		
		for (int aux = 0; aux < vet.length; aux++) { // Estrutura de repetição
			
			System.out.println("Informe um valor numérico inteiro: "); // Entrada do valor dos vetores
			vet[aux] = teclado.nextInt();
		}
		
		for (int aux = 0; aux < vet.length; aux++) { // Estrutura de repetição
			somaVet += vet[aux]; // Somatório de vetores
		}
		for (int aux = 0; aux < vet.length; aux++) {
	
			if (somaVet % vet[aux] == 0) { // Divisores da soma 
				System.out.println("Vetores impressos: "+vet[aux]); // Impressão dos divisores da soma
		}}
		teclado.close();

}}
