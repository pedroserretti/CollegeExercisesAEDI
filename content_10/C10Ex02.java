package content_10;
import javax.swing.JOptionPane;
public class C10Ex02 {
	public static void main(String[] args) {

		// DECLARA��O DE VARI�VEIS
		String numValorStr;
		double numValor, mediaValor, valorSoma = 0 , cont1 = 0, cont2 = 0;
		
		do {
			
			numValorStr = JOptionPane.showInputDialog(null,
					"Informe o valor recebido: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			numValor = Double.valueOf(numValorStr);
			
			if (numValor != 0) {
				valorSoma += numValor;
				cont1++;
				if (numValor > 1000)
					cont2++;
				
			}}while (numValor != 0);
		
		mediaValor = valorSoma / cont1;
		
		JOptionPane.showMessageDialog(null,
				"Valor total recebido: "+valorSoma+"\nM�dia dos valores recebidos: "+mediaValor+"\nQuantidade dos valores acima: "+cont2,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
		
		
	}

}
