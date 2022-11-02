package content_7;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class C07Ex01 {
	public static void main(String[] args) {

		// DECLARA��O DE VARI�VEIS E ENTRADA DE DADOS
		
		Scanner teclado = new Scanner(System.in);
		
		String numAcertosStr = JOptionPane.showInputDialog(null,
				"Informe o n�mero de acertos: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int numAcertos = Integer.valueOf(numAcertosStr);
		
		// C�LCULOS E SA�DA DE DADOS
		
		switch (numAcertos) {
			case 1, 2, 3, 4, 5 ->
				JOptionPane.showMessageDialog(null,
						"N�o ganhou nenhum pr�mio",
						"Pr�mio",
						JOptionPane.INFORMATION_MESSAGE);
			case 6, 7, 8, 9, 10 ->
				JOptionPane.showMessageDialog(null,
						"Recebe outro cart�o para apostar",
						"Pr�mio",
						JOptionPane.INFORMATION_MESSAGE);
			case 11 ->
				JOptionPane.showMessageDialog(null,
						"Pr�mio de R$100.00",
						"Pr�mio",
						JOptionPane.INFORMATION_MESSAGE);
			case 12 ->
				JOptionPane.showMessageDialog(null,
						"Pr�mio de R$1000.00",
						"Pr�mio",
						JOptionPane.INFORMATION_MESSAGE);
			case 13 -> 
				JOptionPane.showMessageDialog(null,
						"Pr�mio de R$50.000",
						"Pr�mio",
						JOptionPane.INFORMATION_MESSAGE);
			default ->
				JOptionPane.showMessageDialog(null,
						"N�mero de acertos inv�lidos",
						"Erro",
						JOptionPane.WARNING_MESSAGE);
			}
			teclado.close();

		
	}

}
