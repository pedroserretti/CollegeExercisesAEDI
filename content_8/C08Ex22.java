package content_8;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class C08Ex22 {
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS
		Scanner teclado = new Scanner(System.in);
		int valorNum;
		double cont1 = 0;
		
		// ENTRADA DE DADOS
		System.out.println("Informe um numero inteiro, maior que zero: ");
		valorNum = teclado.nextInt();
		
		// ESTRUTURA DE REPETI��O
		for (int aux = 1; aux <= valorNum; aux++) {
			
			// CONDI��O
			if (valorNum % aux == 0) {
				cont1++;
			}
			
			else if (cont1 >= 3) {
				break;
			}
		}
		
		// SA�DA DE DADOS E CONDI��O
		if (cont1 == 2)
			JOptionPane.showMessageDialog(null,
					"O n�mero � primo.",
					"Resultado",
					JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,
					"O n�mero n�o � primo.",
					"Resultado",
					JOptionPane.INFORMATION_MESSAGE);
		teclado.close();
			
	}

}
