package content_7;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class C07Ex01 {
	public static void main(String[] args) {

		// DECLARAÇÃO DE VARIÁVEIS E ENTRADA DE DADOS
		
		Scanner teclado = new Scanner(System.in);
		
		String numAcertosStr = JOptionPane.showInputDialog(null,
				"Informe o número de acertos: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int numAcertos = Integer.valueOf(numAcertosStr);
		
		// CÁLCULOS E SAÍDA DE DADOS
		
		switch (numAcertos) {
			case 1, 2, 3, 4, 5 ->
				JOptionPane.showMessageDialog(null,
						"Não ganhou nenhum prêmio",
						"Prêmio",
						JOptionPane.INFORMATION_MESSAGE);
			case 6, 7, 8, 9, 10 ->
				JOptionPane.showMessageDialog(null,
						"Recebe outro cartão para apostar",
						"Prêmio",
						JOptionPane.INFORMATION_MESSAGE);
			case 11 ->
				JOptionPane.showMessageDialog(null,
						"Prêmio de R$100.00",
						"Prêmio",
						JOptionPane.INFORMATION_MESSAGE);
			case 12 ->
				JOptionPane.showMessageDialog(null,
						"Prêmio de R$1000.00",
						"Prêmio",
						JOptionPane.INFORMATION_MESSAGE);
			case 13 -> 
				JOptionPane.showMessageDialog(null,
						"Prêmio de R$50.000",
						"Prêmio",
						JOptionPane.INFORMATION_MESSAGE);
			default ->
				JOptionPane.showMessageDialog(null,
						"Número de acertos inválidos",
						"Erro",
						JOptionPane.WARNING_MESSAGE);
			}
			teclado.close();

		
	}

}
