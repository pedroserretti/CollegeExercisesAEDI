package content_6;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class C06Ex15 {
	public static void main(String[] args) {

		// DECLARAÇÃO DE VARIÁVEIS E ENTRADA DE DADOS
		
		Scanner teclado = new Scanner(System.in);
		int valorFix = 0;
		double valorConta, valorNormal, imposto, canaisPpp = 0;
				
		String numPacoteStr = JOptionPane.showInputDialog(null,
				"Informe o número do pacote: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int numPacote = Integer.valueOf(numPacoteStr);
				
		String qtDiasStr = JOptionPane.showInputDialog(null,
				"Informe a quantidade de dias",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int qtDias = Integer.valueOf(qtDiasStr);
		
		String servExtrasStr = JOptionPane.showInputDialog(null,
				"Informe o valor dos serviços extras: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		double servExtras = Double.valueOf(servExtrasStr);
		
		String cidade = JOptionPane.showInputDialog(null,
				"Informe o nome da cidade: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		
		// CÁLCULOS
		
		if (numPacote == 1) {
			valorFix = 65;
			canaisPpp = (1.2 * qtDias);
		}
		
		if (canaisPpp > 65) {
			canaisPpp = 65;
		}
		
		if (numPacote == 2) {
			valorFix = 104;
			canaisPpp = 2.1 * qtDias;
		}
		
		if (numPacote == 3) {
			valorFix = 137;
			canaisPpp = 0;
		}
		
		valorNormal = valorFix + canaisPpp + servExtras;
		
		if (cidade.equals("Belo Horizonte")) {
			imposto = 0;
		}
		else if (cidade.equals("São Paulo")) {
			imposto = (valorNormal * 0.01);
		}
		else if (cidade.equals("Rio de Janeiro")) {
			imposto = (valorNormal * 0.015);
		}
		else {
			imposto = (valorNormal * 0.02);
		}
		
		valorConta = valorFix + canaisPpp + servExtras + imposto;

		// SAÍDA DE DADOS
		
		JOptionPane.showMessageDialog(null,
				"Total da conta: "+valorConta,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
		teclado.close();
	}
}
