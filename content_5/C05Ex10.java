package content_5;
import java.util.Scanner;
public class C05Ex10 {
	public static void main(String[] args) {
		
		//DECLARAÇÃO DE VARIÁVEIS E ENTRADA DE DADOS
		int numInteiro, n1, n2, n3, n4, n5;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro de 5 dígitos: ");
		numInteiro = teclado.nextInt();
		n1 = numInteiro / 10000;
		n2 = numInteiro / 1000 % 10;
		n3 = numInteiro / 100 % 10;
		n4 = numInteiro / 10 % 10;
		n5 = numInteiro % 10;
		
		//SAÍDA DE DADOS
		System.out.println();
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		teclado.close();

		
	}

}
