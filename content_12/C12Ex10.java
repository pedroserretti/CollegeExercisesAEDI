package content_12;
import javax.swing.JOptionPane;
public class C12Ex10 {
	public static void main(String[] args) {

		// DECLARA��O DE VETORES E VARI�VEIS
		int[] notaAluno = new int[8];
		String[] nomeAluno = new String[8];
		String impressao = "";

		// ESTRUTURA DE REPETI��O DOS VETORES
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
		// ESTRUTURA DE REPETI��O
		for (int aux = 0; aux < 8; aux++) {
			// CONDI��O, SE A NOTA DO ALUNO FOR MAIOR OU IGUAL A 60, IMPRIMIR
			if (notaAluno[aux] >= 60) {
				impressao += nomeAluno[aux] + " " + notaAluno[aux] + "\n";

				}
		}
		// IMPRESS�O DOS ALUNOS QUE FICARAM ACIMA DA M�DIA (MAIOR QUE 60)
		JOptionPane.showMessageDialog(null,
				"Alunos que ficaram acima da m�dia: " + impressao,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);	
}}
