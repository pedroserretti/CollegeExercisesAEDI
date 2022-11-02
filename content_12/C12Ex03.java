package content_12;
import java.util.Scanner;
public class C12Ex03 {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS
		int vet[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		// ESTRUTURA DE REPETIÇÃO
		for (int aux = 0; aux<vet.length; aux++) {
	
			// ENTRADA DE VALOR DOS VETORES
			System.out.println("Informe um valor numérico inteiro: ");
			vet[aux] = teclado.nextInt();
		}
		
		// LEITURA DE QUAIS NÚMEROS SÃO DIVISORES POR 34
		for (int aux = 0; aux<vet.length; aux++) {
			if (34 % vet[aux] == 0) {
				System.out.println("Valores divisíveis por 34: "+vet[aux]);
		}}
		teclado.close();		
}}
