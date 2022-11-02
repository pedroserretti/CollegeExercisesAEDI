package content_8;
import javax.swing.JOptionPane;
public class C08Ex20 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// DECLARAÇÃO DE VARIÁVEIS
		double valorSoma = 0, valorResultado = 0;
	
		String valorNumStr = JOptionPane.showInputDialog(null,
				"Informe a quantidade de termos: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		int valorNum = Integer.valueOf(valorNumStr);
		
		// ESTRUTURA DE REPETIÇÃO
		for (int aux = 0; aux <= -1; aux++) {
		
			// CÁLCULOS
			valorResultado = Math.pow(2, aux);
			valorSoma += valorResultado;
		}
		
		// SAÍDA DE DADOS
		JOptionPane.showMessageDialog(null,
				"Soma dos 100 primeiros termos: "+valorSoma,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
}}
