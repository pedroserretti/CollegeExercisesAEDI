package content_8;
import javax.swing.JOptionPane;
public class C08Ex03 {
	public static void main(String[] args) {

		// DECLARAÇÃO DE VARIÁVEIS E ENTRADA DE DADOS
		
		int cont1 = 0, cont2 = 0;
		String resultado = null;
		
		for (int aux= 1; aux <= 3; aux++) {
			String valorNotaStr = JOptionPane.showInputDialog(null,
					"Informe a nota do aluno: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			int valorNota = Integer.valueOf(valorNotaStr);
			
			String valorFaltaStr = JOptionPane.showInputDialog(null,
					"Informe a quantidade de faltas do aluno: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			int valorFalta = Integer.valueOf(valorFaltaStr);
			
			// CÁLCULOS 
			
				if (valorNota >= 65 & valorFalta <= 16) {
				resultado = "ALUNO APROVADO";
				}
				
				else {
				resultado = "ALUNO REPROVADO";
				}
			
				if (resultado == "ALUNO APROVADO") {
				cont1++;
				}
			
				else {
					cont2++;
				}
			JOptionPane.showMessageDialog(null,
					"Resultado final: "+resultado,
					"Resultado",
					JOptionPane.INFORMATION_MESSAGE);
		}
		
		// SAÍDA DE DADOS
		
		JOptionPane.showMessageDialog(null,
				"Aprovados: "+cont1+"\nReprovados: "+cont2,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
