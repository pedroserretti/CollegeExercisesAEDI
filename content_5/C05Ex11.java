package content_5;
import java.util.Scanner;
public class C05Ex11 {
	public static void main(String[] args) {
		
		//DECLARAÇÃO DE VARIÁVEIS E ENTRADA DE DADOS
		int cheque, numBanco, numAgen, numSeq;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o número do cheque: ");
		cheque = teclado.nextInt();
		
		numBanco = cheque / 1000000;
		numAgen = cheque % 1000000 / 1000;
		numSeq = cheque % 1000;
		
		//SAÍDA DE DADOS
		System.out.println(); 
		System.out.println("Banco: "+numBanco);
		System.out.println("Agência: "+numAgen);
		System.out.println("Sequencial: "+numSeq);
		teclado.close();
				
		
	}

}
