package content_5;
import java.util.Scanner;
public class C05Ex10 {
	public static void main(String[] args) {
		
		//DECLARA��O DE VARI�VEIS E ENTRADA DE DADOS
		int numInteiro, n1, n2, n3, n4, n5;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro de 5 d�gitos: ");
		numInteiro = teclado.nextInt();
		n1 = numInteiro / 10000;
		n2 = numInteiro / 1000 % 10;
		n3 = numInteiro / 100 % 10;
		n4 = numInteiro / 10 % 10;
		n5 = numInteiro % 10;
		
		//SA�DA DE DADOS
		System.out.println();
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		teclado.close();

		
	}

}
