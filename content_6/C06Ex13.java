package content_6;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class C06Ex13 {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS E ENTRADA DE DADOS
		
		Scanner teclado = new Scanner(System.in);
		int hResult, mResult;
		
		String hInicialStr = JOptionPane.showInputDialog(null,
				"Informe a hora inicial do jogo: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int hInicial = Integer.valueOf(hInicialStr);
		
		String minInicialStr = JOptionPane.showInputDialog(null,
				"Informe os minutos iniciais do jogo: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int minInicial = Integer.valueOf(minInicialStr);
		
		String hFinalStr = JOptionPane.showInputDialog(null,
				"Informe a hora final do jogo: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int hFinal = Integer.valueOf(hFinalStr);
		
		String minFinalStr = JOptionPane.showInputDialog(null,
				"Informe os minutos finais do jogo: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int minFinal = Integer.valueOf(minFinalStr);
		
		// CÁLCULOS 
		
		if (minInicial > minFinal) {
			mResult = (60 + minFinal - minInicial);
			hResult = (hFinal - hInicial) - 1;
		}
		
		else {
			mResult = minFinal - minInicial;
			hResult = hFinal - hInicial;
		}
		
		// SAÍDA DE DADOS
		
		JOptionPane.showMessageDialog(null,
				"O jogo durou "+hResult+" horas e "+mResult+" minutos",
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
		teclado.close();
	}

}
