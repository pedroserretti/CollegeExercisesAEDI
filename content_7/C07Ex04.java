package content_7;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class C07Ex04 {
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS E ENTRADA DE DADOS
		
		Scanner teclado = new Scanner(System.in);
		
		String time = JOptionPane.showInputDialog(null,
				"Informe o nome do time: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		// C�LCULOS E SA�DA DE DADOS

		switch (time) {
			case "America", "Atl�tico", "Cruzeiro", "Villa Nova" -> JOptionPane.showMessageDialog(null,
					"Minas Gerais",
					"Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			case "Botafogo", "Fluminense", "Flamengo", "Vasco" -> JOptionPane.showMessageDialog(null,
					"Rio de Janeiro",
					"Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			case "Corinthians", "Palmeiras", "Santos", "S�o Paulo" -> JOptionPane.showMessageDialog(null,
					"S�o Paulo",
					"Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			case "Gr�mio", "Internacional", "Juventude" -> JOptionPane.showMessageDialog(null,
					"Rio Grande do Sul",
					"Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			case "N�utico", "Santa Cruz", "Sport" -> JOptionPane.showMessageDialog(null,
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
