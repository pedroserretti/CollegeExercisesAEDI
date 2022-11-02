package content_12;
import java.util.Scanner;
import java.lang.Math;
public class C12Ex04 {
	public static void main(String[] args) {

		// DECLARAÇÃO DO VETOR
		int vet[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		//ESTRUTURA DE REPETIÇÃO
		for (int aux = 0; aux < vet.length; aux++) {
			
			// ENTRADA DO VALOR DE CADA VETOR
			System.out.println("Informe um valor numérico inteiro: ");
			vet[aux] = teclado.nextInt();
		}
		
		// ESTRUTURA DE REPETIÇÃO
		for (int aux = 0; aux < vet.length; aux++) {
			
			// IMPRESSÃO DE TODOS OS VETORES ELEVADO AO QUADRADO
			System.out.println("Valores elevados ao quadrado: "+Math.pow(vet[aux], 2));
		}
		teclado.close();
	

}}
