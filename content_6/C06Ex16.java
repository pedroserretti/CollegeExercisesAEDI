package content_6;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class C06Ex16 {
	public static void main(String[] args) {
		
		//DECLARAÇÃO DE VARIÁVEIS E ENTRADA DE DADOS

		Scanner teclado = new Scanner(System.in);
		int numPeso1, numPeso2;
		double Maior1 = 0, Maior2 = 0, finalNota;
		
		String numProva1Str = JOptionPane.showInputDialog(null,
				"Informe a nota da primeira prova",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		double numProva1 = Double.parseDouble(numProva1Str);
		
		String numProva2Str = JOptionPane.showInputDialog(null,
				"Informe a nota da segunda prova: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		double numProva2 = Double.parseDouble(numProva2Str);
		
		String numProva3Str = JOptionPane.showInputDialog(null,
				"Informe a nota da terceira prova: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		double numProva3 = Double.parseDouble(numProva3Str);
		
		String qtFaltasStr = JOptionPane.showInputDialog(null,
				"Informe a quantidade de faltas que o aluno teve: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int qtFaltas = Integer.parseInt(qtFaltasStr);
		
		String idadeAlunoStr = JOptionPane.showInputDialog(null,
				"Informe a idade do aluno: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		double idadeAluno = Double.parseDouble(idadeAlunoStr);
		
		String notaTrabalhoStr = JOptionPane.showInputDialog(null,
				"Informe a nota que o aluno obteve em seu trabalho: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		double notaTrabalho = Double.parseDouble(notaTrabalhoStr);
		
		// CÁLCULOS 
		
		if (qtFaltas <= 5) {
			numPeso1 = 3;
		}
		
		else if (qtFaltas < 10) {
			numPeso1 = 2;
		}
		
		else {
			numPeso1 = 1;
		}
		
		if (idadeAluno <= 17) {
			numPeso2 = 1;
		}
		
		else if (idadeAluno <= 50) {
			numPeso2 = 2;
		}
		
		else
			numPeso2 = 3;
		
		if (numProva1 >= numProva2 && numProva1 >= numProva3) {
			Maior1 = numProva1;
			
			if (numProva2 >= numProva3) {
				Maior2 = numProva2;
			}
			else {
				Maior2 = numProva3;
			}
		}
		else if (numProva2 >= numProva1 && numProva2 >= numProva3) {
			Maior1 = numProva2;
			
			if (numProva1 >= numProva3) {
				Maior2 = numProva1;
			}
			else {
				Maior2 = numProva3;
			}
		} 
		else if (numProva3 >= numProva1 && numProva3 >= numProva2) {
			Maior1 = numProva3;
			
			if (numProva1 >= numProva2) {
				Maior2 = numProva1;
			}
			
			else {
				Maior2 = numProva2;
			}
		}
		
			finalNota = (Maior1 + Maior2 / 2) * numPeso1 + (notaTrabalho * numPeso2);
			
			// CÁLCULOS E SAÍDA DE DADOS
			
			if (finalNota <= 50)
				JOptionPane.showMessageDialog(null,
					"Resultado: Reprovado",
					"Resultado final",
					JOptionPane.INFORMATION_MESSAGE);
			
			else if (finalNota <= 70)
				JOptionPane.showMessageDialog(null,
					"Resultado = Regular",
					"Resultado final",
					JOptionPane.INFORMATION_MESSAGE);
			
			else if (finalNota <= 80)
				JOptionPane.showMessageDialog(null,
					"Resultado: Bom",
					"Resultado final",
					JOptionPane.INFORMATION_MESSAGE);
			
			else if (finalNota <= 90)
				JOptionPane.showMessageDialog(null, 
					"Resultado: Muito Bom",
					"Resultado final",
					JOptionPane.INFORMATION_MESSAGE);
			
			else
				JOptionPane.showMessageDialog(null, 
					"Resultado: Excelente",
					"Resultado final",
					JOptionPane.INFORMATION_MESSAGE);
			
			teclado.close();


	}

}
