package content_12;
import javax.swing.JOptionPane;
public class C12Ex10 {
	public static void main(String[] args) {

		// DECLARAÇÃO DE VETORES E VARIÁVEIS
		int[] notaAluno = new int[8];
		String[] nomeAluno = new String[8];
		String impressao = "";

		// ESTRUTURA DE REPETIÇÃO DOS VETORES
		for (int aux = 0; aux < 8; aux++) {
			
			// ENTRADA DE VETORES
			nomeAluno[aux] = JOptionPane.showInputDialog(null,
					"Informe o nome do aluno: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			notaAluno[aux] = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Informe a nota do aluno: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE));
		
		}	
		// ESTRUTURA DE REPETIÇÃO
		for (int aux = 0; aux < 8; aux++) {
			// CONDIÇÃO, SE A NOTA DO ALUNO FOR MAIOR OU IGUAL A 60, IMPRIMIR
			if (notaAluno[aux] >= 60) {
				impressao += nomeAluno[aux] + " " + notaAluno[aux] + "\n";

				}
		}
		// IMPRESSÃO DOS ALUNOS QUE FICARAM ACIMA DA MÉDIA (MAIOR QUE 60)
		JOptionPane.showMessageDialog(null,
				"Alunos que ficaram acima da média: " + impressao,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);	
}}
