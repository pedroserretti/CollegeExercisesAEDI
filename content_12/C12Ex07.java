package content_12;
import java.util.Scanner;
public class C12Ex07 {
	public static void main(String[] args) {

	String[] nomeAluno = new String [4]; // Declaração do vetor do nome dos alunos
		String conceito;

		int[] notaFinal = new int[4]; // Declaração do vetor das notas finais
	
	Scanner teclado = new Scanner(System.in); // Leitura de Scanner
	
	for (int aux = 0; aux < 4; aux++) { // Estrutura de repetição de vetores
		
		System.out.println("Digite o nome do aluno: "); // Leitura do nome de cada aluno
		nomeAluno[aux] = teclado.nextLine();
		System.out.println("Digite a nota final do aluno: "); // Leitura da nota de cada aluno
		notaFinal[aux] = teclado.nextInt();
		teclado.nextLine();
	}
	
	for (int aux = 0; aux < 4; aux++) { // Estrutura de repetição dos vetores finais 
		
		if (notaFinal[aux] <= 30) { // Condição se a nota for até 30
			conceito = "D";
		}
		else if (notaFinal[aux] >= 31 && notaFinal[aux] <= 60) { // Condição se a nota 
			conceito = "C";										// for entre 31 e 60
		}
		else if (notaFinal[aux] >= 61 && notaFinal[aux] <= 80) { // Condição se a nota
			conceito = "B"; 									// for entre 61 e 80
		}
		else // Condição se a nota for maior que 80
			conceito = "A";
		System.out.println("Nome do aluno: "+nomeAluno[aux]+"\nConceito: "+conceito); // Impressão dos vetores 
	}
	teclado.close();
}}
