package content_8;
import java.util.Scanner;
public class C08Ex24 {
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS
		double  valorSoma1 = 0, valorSoma2 = 0, serie = 0;
		Scanner teclado = new Scanner(System.in);
		
		// ESTRUTURA DE REPETI��O
		for (int aux = 1; aux <= 99; aux += 2) {
			
			// C�LCULOS
			serie = Math.pow(2, aux);
			valorSoma1 += serie;
		}

		valorSoma2 = (1/ 3.0) * valorSoma1;
		
		// SA�DA DE DADOS
		System.out.println("S�rie: "+valorSoma2);
		teclado.close();
}}
