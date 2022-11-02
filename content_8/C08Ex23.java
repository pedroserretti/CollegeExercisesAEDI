package content_8;
import java.util.Scanner;
public class C08Ex23 {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS
		double valorMedia, cont1 = 0, valorSoma = 0;
		int n1, n2, n3, n4;
		Scanner teclado = new Scanner(System.in);
		
		// ESTRUTURA DE REPETIÇÃO
		for (int aux = 1000; aux <= 9999; aux++) {
			
			// CÁLCULOS
			n1 = aux / 1000;
			n2 = aux / 100 % 10;
			n3 = aux / 10 % 10;
			n4 = aux % 10;
			
			// CONDIÇÃO
			if (n1 == n4 && n2 == n3) {
				valorSoma += aux;
				System.out.println(aux);
				cont1++;
			}
		
		}
		// CÁLCULO DA MÉDIA
		valorMedia = valorSoma / cont1;
		
		// SAÍDA DE DADOS
		System.out.println("Média: "+valorMedia);
		teclado.close();
}}
