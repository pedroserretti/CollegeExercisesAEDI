package content_12;
import java.util.Scanner;
public class C12Ex02 {
	public static void main(String[] args) {

		// DECLARA��O DE VARI�VEIS
		int vet[] = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		// ESTRUTURA DE REPETI��O
		for (int aux = 0; aux<vet.length; aux++) {
	
			// ENTRADA DE DADOS, VALORES DOS VETORES
			System.out.println("Informe um valor num�rico inteiro: ");
			vet[aux] = teclado.nextInt();
		}
		
		// LEITURA DA QUANTIDADE DE N�MEROS MENORES QUE 5 E MAIORES QUE 10
		for (int aux = 0; aux<vet.length; aux++) {
			if (vet[aux] > 5 && vet[aux] < 10) {
				System.out.println("N�meros menores que 5 e maiores que 10: "+vet[aux]);
		}}
		teclado.close();
		
	

}}
