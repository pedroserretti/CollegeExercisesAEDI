package content_8;
import javax.swing.JOptionPane;
public class C08Ex02 {
	public static void main(String[] args) {
		
		//DECLARAÇÃO DE VARIÁVEIS E ENTRADA DE DADOS
		
		String aluno;
		for (int repeticao=1; repeticao<=50; repeticao++) {
			String numNotaStr = JOptionPane.showInputDialog(null,
					"Informe a nota do aluno: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);	
			int numNota = Integer.parseInt(numNotaStr);
			
			if (numNota == -1) {
				break;
			}
			String numFaltaStr = JOptionPane.showInputDialog(null,
					"Informe o número de faltas: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			int numFalta = Integer.parseInt(numFaltaStr);
			
			if (numNota >= 65 && numFalta < 16) {
				aluno = "APROVADO";
			}
		
			else {
				aluno = "REPROVADO";
			}
			
			JOptionPane.showMessageDialog(null,
					"Situação do aluno: " +aluno,
					"Resultado",
					JOptionPane.INFORMATION_MESSAGE);
		}
		
		
	}

}
