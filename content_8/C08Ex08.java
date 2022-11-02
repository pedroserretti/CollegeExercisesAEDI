package content_8;
import javax.swing.JOptionPane;
public class C08Ex08 {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS E ENTRADA DE DADOS
		
		int cont1 = 0, cont2 = 0;
		String resultado = null;
		double valorSoma = 0, valorMedia;
		
		for (int aux= 1; aux <= 3; aux++) {
			String valorNotaStr = JOptionPane.showInputDialog(null,
					"Informe a nota do aluno: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			int valorNota = Integer.parseInt(valorNotaStr);
			
			String valorFaltaStr = JOptionPane.showInputDialog(null,
					"Informe a quantidade de faltas do aluno: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			int valorFalta = Integer.parseInt(valorFaltaStr);
			
			// CÁLCULOS 
			
				if (valorNota >= 65 & valorFalta <= 16) {
					resultado = "ALUNO APROVADO";
				}
				
				else {
					resultado = "ALUNO REPROVADO";
				}
			
				if (resultado == "ALUNO APROVADO") {
					cont1++;
					valorSoma += valorNota;
				}

				if (valorFalta > 16) {
					cont2++;
				}
				
			JOptionPane.showMessageDialog(null,
					"Resultado final: "+resultado,
					"Resultado",
					JOptionPane.INFORMATION_MESSAGE);
		}
		
		valorMedia = valorSoma / cont1;
		
		// SAÍDA DE DADOS
		
		JOptionPane.showMessageDialog(null,
				"Média da nota dos aprovados: "+valorMedia+"\nQuantidade de alunos com mais de 16 faltas: "+cont2,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
