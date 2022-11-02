package content_8;
import java.util.Scanner;
public class C08Ex19 {
	public static void main(String[] args) {

		// DECLARAÇÃO DE VARIÁVEIS
		double valorTermo;
		int valorSoma = 0;
		Scanner teclado = new Scanner(System.in);
		
		// ESTRUTURA DE REPETIÇÃO
		for (int aux = 1; aux <= 100; aux++) {
			
			// CÁLCULOS
			valorTermo = Math.pow(aux, 2);
			
			valorSoma += valorTermo;
			
			System.out.println(valorTermo);
		}
		
		// SAÍDA DE DADOS
		System.out.println("O resultado final da soma é: "+valorSoma);
		teclado.close();
}}
