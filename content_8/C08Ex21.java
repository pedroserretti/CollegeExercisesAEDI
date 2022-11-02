package content_8;
import java.util.Scanner;
import java.text.DecimalFormat;

public class C08Ex21 {
	public static void main(String[] args) {
		
		// DECLARAÇAO DE VARIAVEIS
		String situacao = null;
		int pesoKg;
		double valorImc = 0, alturaMetros;
		Scanner teclado = new Scanner(System.in);
			
		// ENTRADA DE DADOS
		System.out.println("Informe sua altura : ");
		alturaMetros = teclado.nextDouble();
		
			// ESTRUTURA DE REPETIÇAO
			for (pesoKg = 60; pesoKg <= 100; pesoKg++) {
				
				valorImc = pesoKg/ (alturaMetros * alturaMetros);
				
				// CONDIÇAO
				if (valorImc <= 20) {
					situacao = "ABAIXO DO PESO";
				}
				
				else if (valorImc <= 25) {
					situacao = "PESO IDEAL";
				}
				
				else {
					situacao = "ACIMA DO PESO";
				}
				
				// FORMATAÇAO PARA DECIMAL
				DecimalFormat df = new DecimalFormat("0.##");
				String imcStr = df.format(valorImc);
				
				// SA�DA DE DADOS
				System.out.print("Peso:  ");
				System.out.print("Imc:  ");
				System.out.println("Situação Corpórea: ");
				System.out.println(pesoKg+" "+imcStr+"   "+situacao);
			}
			teclado.close();
}}


