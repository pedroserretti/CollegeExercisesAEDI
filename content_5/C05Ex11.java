package content_5;
import java.util.Scanner;
public class C05Ex11 {
	public static void main(String[] args) {
		
		//DECLARA��O DE VARI�VEIS E ENTRADA DE DADOS
		int cheque, numBanco, numAgen, numSeq;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o n�mero do cheque: ");
		cheque = teclado.nextInt();
		
		numBanco = cheque / 1000000;
		numAgen = cheque % 1000000 / 1000;
		numSeq = cheque % 1000;
		
		//SA�DA DE DADOS
		System.out.println(); 
		System.out.println("Banco: "+numBanco);
		System.out.println("Ag�ncia: "+numAgen);
		System.out.println("Sequencial: "+numSeq);
		teclado.close();
				
		
	}

}
