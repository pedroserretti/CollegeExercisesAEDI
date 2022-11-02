package content_10;
import javax.swing.JOptionPane;
public class C10Ex07 {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS 
		int cont = 0;
		double contamin = 1;
		
		String qtPessoasStr = JOptionPane.showInputDialog(null, 
					"Informe o número de quantidade de pessoas: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
		double qtPessoas = Double.valueOf(qtPessoasStr);
		
		// ESTRUTURA DE REPETIÇÃO
		do {
			
			// ENTRADA DE DADOS
			
			
			// CÁLCULOS
			contamin += 0.003 * contamin;
			cont++;
			
		}
		while (contamin <= qtPessoas);
		
		// SAÍDA DE DADOS
		JOptionPane.showMessageDialog(null,
				"População: "+qtPessoas+"\nAnos: "+cont/365+"\nMeses: "+cont%365/30+"\nDias: "+cont%365%30,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	

}}
