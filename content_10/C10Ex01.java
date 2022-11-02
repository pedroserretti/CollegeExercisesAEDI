package content_10;
import javax.swing.JOptionPane;
public class C10Ex01 {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS
		int cont = 0;
		double valorMulta, numMedia, valorSoma = 0, numValor;
		String numValorStr = null;
		
		// ESTRUTURA DE REPETIÇÃO E ENTRADA DE DADOS
		do {
			
			numValorStr = JOptionPane.showInputDialog(null,
					"Informe um valor: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			numValor = Double.valueOf(numValorStr);
			
			// CONTAS
			valorMulta = numValor * 0.1;
			
			// CONDIÇÃO E SAÍDA DE DADOS
			if (numValor != -1) {
				JOptionPane.showMessageDialog(null,
						"Multa: "+valorMulta,
						"Dados",
						JOptionPane.INFORMATION_MESSAGE);
				valorSoma += valorMulta;
				cont++;
			}}
			while (numValor != -1);
		
			// CONTAS
			numMedia = valorSoma/ cont;
			
			// SAÍDA DE DADOS
			JOptionPane.showMessageDialog(null,
				"Média das multas: "+numMedia,
				"Dados",
				JOptionPane.INFORMATION_MESSAGE);
}}