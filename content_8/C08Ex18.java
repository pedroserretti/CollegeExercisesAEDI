package content_8;
import java.util.Scanner;
public class C08Ex18 {
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS
		int valorNum = 0, valorMultiplicacao = 0;
		Scanner teclado = new Scanner(System.in);
		
		// ENTRADA DE DADOS
		System.out.println("Informe um n�mero inteiro de 1 a 9: ");
		valorNum = teclado.nextInt();
		
		// ESTRUTURA DE REPETI��O
		for (int aux = 1; aux <= 9; aux++) {
			
			// C�LCULOS
			valorMultiplicacao = aux * valorNum;
			
			// SA�DA DE DADOS
			System.out.println(aux +" x "+valorNum+" = "+valorMultiplicacao);
		}
		teclado.close();
}}
