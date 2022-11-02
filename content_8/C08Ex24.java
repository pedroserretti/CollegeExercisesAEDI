package content_8;
import java.util.Scanner;
public class C08Ex24 {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS
		double  valorSoma1 = 0, valorSoma2 = 0, serie = 0;
		Scanner teclado = new Scanner(System.in);
		
		// ESTRUTURA DE REPETIÇÃO
		for (int aux = 1; aux <= 99; aux += 2) {
			
			// CÁLCULOS
			serie = Math.pow(2, aux);
			valorSoma1 += serie;
		}

		valorSoma2 = (1/ 3.0) * valorSoma1;
		
		// SAÍDA DE DADOS
		System.out.println("Série: "+valorSoma2);
		teclado.close();
}}
