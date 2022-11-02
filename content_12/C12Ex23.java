package content_12;
import javax.swing.JOptionPane;
public class C12Ex23 {
	public static void main(String[] args) {
		
		String pesquisa = "-1";
		String[] vetNomes = new String[10];
		String[] carroPlaca = new String[10];
		int posVaga = -1;
		
		for (int aux = 0; aux < 10; aux++) {
			
			carroPlaca[aux] = JOptionPane.showInputDialog(null,
					"Digite o número da placa: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			vetNomes[aux] = JOptionPane.showInputDialog(null,
					"Digite o nome da pessoa que é dona da placa: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
		}
		for (int aux = 0; aux < 10; aux++) {
			
			pesquisa = JOptionPane.showInputDialog(null,
					"Digite o número da placa de um carro ou um nome de algum morador: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			if (carroPlaca[aux].equalsIgnoreCase(pesquisa) || vetNomes[aux].equalsIgnoreCase(pesquisa)) {
				posVaga = aux + 1;
				JOptionPane.showMessageDialog(null,
						"Está posicionado na vaga "+posVaga,
						"Dados",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}

}
