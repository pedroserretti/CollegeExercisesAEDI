package content_12;
import java.util.Scanner;
import java.lang.Math;
public class C12Ex04 {
	public static void main(String[] args) {

		// DECLARA��O DO VETOR
		int vet[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		//ESTRUTURA DE REPETI��O
		for (int aux = 0; aux < vet.length; aux++) {
			
			// ENTRADA DO VALOR DE CADA VETOR
			System.out.println("Informe um valor num�rico inteiro: ");
			vet[aux] = teclado.nextInt();
		}
		
		// ESTRUTURA DE REPETI��O
		for (int aux = 0; aux < vet.length; aux++) {
			
			// IMPRESS�O DE TODOS OS VETORES ELEVADO AO QUADRADO
			System.out.println("Valores elevados ao quadrado: "+Math.pow(vet[aux], 2));
		}
		teclado.close();
	

}}
