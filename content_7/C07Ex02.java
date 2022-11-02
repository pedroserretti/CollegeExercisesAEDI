package Conteúdo_7;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class C07Ex02 {
	public static void main(String[] args) {
		
		// DECLARAï¿½ï¿½O DE VARIï¿½VEIS E ENTRADA DE DADOS
		
		Scanner teclado = new Scanner(System.in);
		int notaFinal;
		
		String nota1Str = JOptionPane.showInputDialog(null,
				"Informe a primeira nota: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int nota1 = Integer.valueOf(nota1Str);
		
		String nota2Str = JOptionPane.showInputDialog(null,
				"Informe a segunda nota: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int nota2 = Integer.valueOf(nota2Str);
		
		String nota3Str = JOptionPane.showInputDialog(null,
				"Informe a terceira nota: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int nota3 = Integer.valueOf(nota3Str);
		
		// Cï¿½LCULOS E SAï¿½DA DE DADOS
		
		notaFinal = ((nota1 + nota2 + nota3) / 3);
		
		switch (notaFinal) {
			case 9, 10 ->
				JOptionPane.showMessageDialog(null,
						"Conceito A",
						"Conceito",
						JOptionPane.INFORMATION_MESSAGE);
			case 8 ->
				JOptionPane.showMessageDialog(null,
						"Conceito B",
						"Conceito",
						JOptionPane.INFORMATION_MESSAGE);
			case 7 ->
				JOptionPane.showMessageDialog(null,
						"Conceico C",
						"Conceito",
						JOptionPane.INFORMATION_MESSAGE);
			case 5, 6 -> 
				JOptionPane.showMessageDialog(null,
						"Conceito D",
						"Conceito",
						JOptionPane.INFORMATION_MESSAGE);
			case 1, 2, 3, 4 ->
				JOptionPane.showMessageDialog(null,
						"Conceito E",
						"Conceito",
						JOptionPane.INFORMATION_MESSAGE);
			default ->
				JOptionPane.showMessageDialog(null,
						"A nota informada ï¿½ invï¿½lida",
						"Erro",
						JOptionPane.WARNING_MESSAGE);
			}
		teclado.close();
		
		
	}

}
