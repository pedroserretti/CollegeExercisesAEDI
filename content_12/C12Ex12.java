package content_12;
import javax.swing.JOptionPane;
public class C12Ex12 {
	public static void main(String[] args) {
		
		String[] vetNomes = new String[8];
		int[] vetNotas = new int[8];
		int notaMaior = 0;
		
		for (int aux = 0; aux < 8; aux++) 
		{
			vetNomes[aux] = JOptionPane.showInputDialog(null,
					"Digite os nomes: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);

			vetNotas[aux] = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Informe a nota: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE));
		}
		
		notaMaior = vetNotas[0];
		for (int aux = 0; aux < 8; aux++) 
		{
			if (vetNotas[aux] > notaMaior) 
				notaMaior = vetNotas[aux];
		}
		
		for (int aux = 0; aux < 8; aux++) 
		{
			if (vetNotas[aux] == notaMaior)
				JOptionPane.showMessageDialog(null,
						"Alunos que tiveram a maior nota: \n"+vetNomes[aux],
						"Resultado",
						JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
