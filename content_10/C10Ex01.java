package content_10;
import javax.swing.JOptionPane;
public class C10Ex01 {
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS
		int cont = 0;
		double valorMulta, numMedia, valorSoma = 0, numValor;
		String numValorStr = null;
		
		// ESTRUTURA DE REPETI��O E ENTRADA DE DADOS
		do {
			
			numValorStr = JOptionPane.showInputDialog(null,
					"Informe um valor: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			numValor = Double.valueOf(numValorStr);
			
			// CONTAS
			valorMulta = numValor * 0.1;
			
			// CONDI��O E SA�DA DE DADOS
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
			
			// SA�DA DE DADOS
			JOptionPane.showMessageDialog(null,
				"M�dia das multas: "+numMedia,
				"Dados",
				JOptionPane.INFORMATION_MESSAGE);
}}