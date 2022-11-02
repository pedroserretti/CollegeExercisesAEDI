package content_6;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class C06Ex10 {
	public static void main(String[] args) {

		// DECLARAÇÃO DE VARIÁVEIS E ENTRADA DE DADOS
		
		Scanner teclado = new Scanner(System.in);
		
		double impRenda, rendimento, valorResg;
		String valorResgFormat;
		
		String numDiasStr = JOptionPane.showInputDialog(null,
				"Informe a quantidade de dias: ",
				"Dados",
				
				JOptionPane.QUESTION_MESSAGE);
		int numDias = Integer.valueOf(numDiasStr);
		
		String taxaDiasStr = JOptionPane.showInputDialog(null,
				"Informe a taxa diária: ",
				"Dados",
				
				JOptionPane.QUESTION_MESSAGE);
		double taxaDias = Double.valueOf(taxaDiasStr);
		
		String capAplicadoStr = JOptionPane.showInputDialog(null,
				"Informe o capital aplicado: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int capAplicado = Integer.valueOf(capAplicadoStr);
		
		// CÁLCULOS
		
		rendimento = (capAplicado * taxaDias * numDias);
		
		impRenda = (rendimento * 0.15);
		
		valorResg = (capAplicado + rendimento - impRenda - 10);
		
		valorResgFormat = new DecimalFormat ("R$#,###.00").format(valorResg);
		
		// SAÍDA DE DADOS
		
		JOptionPane.showMessageDialog(null,
				"Rendimento: "+rendimento+"\nImposto de renda: "+impRenda+"\nValor a ser resgatado: "+valorResgFormat,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
		teclado.close();
		
		
				
	}

}
