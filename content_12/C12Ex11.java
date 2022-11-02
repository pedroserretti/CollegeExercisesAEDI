package content_12;
import javax.swing.JOptionPane;
public class C12Ex11 {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VETORES E VARIÁVEIS
		String[] nomeAluno = new String [8];
		String maiorNome = "";
		int[] notaAluno = new int[8];
		int maiorNota;

		for (int aux = 0; aux < 8; aux++) {
			nomeAluno[aux] = JOptionPane.showInputDialog(null, "Informe o nome do aluno: ", "Dados", JOptionPane.QUESTION_MESSAGE);
			
			notaAluno[aux] = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Informe a nota do aluno: ", 
					"Dados", 
					JOptionPane.QUESTION_MESSAGE));
		}
		
		maiorNota = notaAluno[0];
		for (int aux = 0; aux < 8; aux++) {
			if(notaAluno[aux] > maiorNota) {
				maiorNota = notaAluno[aux];
				maiorNome = nomeAluno[aux];
			}		
		}
		
		JOptionPane.showMessageDialog(null,
				"Maior nota: "+maiorNome, 
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
}}
