package content_8;
import java.util.Scanner;
public class C08Ex19 {
	public static void main(String[] args) {

		// DECLARA��O DE VARI�VEIS
		double valorTermo;
		int valorSoma = 0;
		Scanner teclado = new Scanner(System.in);
		
		// ESTRUTURA DE REPETI��O
		for (int aux = 1; aux <= 100; aux++) {
			
			// C�LCULOS
			valorTermo = Math.pow(aux, 2);
			
			valorSoma += valorTermo;
			
			System.out.println(valorTermo);
		}
		
		// SA�DA DE DADOS
		System.out.println("O resultado final da soma �: "+valorSoma);
		teclado.close();
}}
