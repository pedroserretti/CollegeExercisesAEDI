package content_12;
import javax.swing.JOptionPane;
public class C12Ex18 {
	public static void main(String[] args) {

		String[] vetNomes = new String[10];
		String nomePes;
		int valorPos = -1;
		for (int aux = 0; aux < 10; aux++) {
			vetNomes[aux] = JOptionPane.showInputDialog(null,
					"Digite um nome: ",
					"Dados",
					JOptionPane.INFORMATION_MESSAGE);
		}
		
		nomePes = JOptionPane.showInputDialog(null,
				"Digite um nome para pesquisar: ",
				"Dados",
				JOptionPane.INFORMATION_MESSAGE);
		
		for (int aux = 0; aux < 10; aux++) {
			if (vetNomes[aux].equalsIgnoreCase(nomePes)) {
				valorPos = aux + 1;
				JOptionPane.showMessageDialog(null,
						"Pesquisa encontrada na posição: " +valorPos,
						"Pesquisa encontrada",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			}
		}
		
		if (valorPos == -1)
			JOptionPane.showMessageDialog(null,
					"Nome não encontrado.",
					"Erro",
					JOptionPane.WARNING_MESSAGE);
	}
}


