package content_7;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class C07Ex04 {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS E ENTRADA DE DADOS
		
		Scanner teclado = new Scanner(System.in);
		
		String time = JOptionPane.showInputDialog(null,
				"Informe o nome do time: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		// Cï¿½LCULOS E SAï¿½DA DE DADOS

		switch (time) {
			case "America", "Atlético", "Cruzeiro", "Villa Nova" -> JOptionPane.showMessageDialog(null,
					"Minas Gerais",
					"Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			case "Botafogo", "Fluminense", "Flamengo", "Vasco" -> JOptionPane.showMessageDialog(null,
					"Rio de Janeiro",
					"Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			case "Corinthians", "Palmeiras", "Santos", "Sï¿½o Paulo" -> JOptionPane.showMessageDialog(null,
					"São Paulo",
					"Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			case "Grêmio", "Internacional", "Juventude" -> JOptionPane.showMessageDialog(null,
					"Rio Grande do Sul",
					"Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			case "Náutico", "Santa Cruz", "Sport" -> JOptionPane.showMessageDialog(null,
					"Pernambuco",
					"Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			default -> JOptionPane.showMessageDialog(null,
					"Erro ao informar a cidade",
					"Erro",
					JOptionPane.WARNING_MESSAGE);
		}
		teclado.close();
		
	}

}
