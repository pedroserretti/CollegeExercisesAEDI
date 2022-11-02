package content_12;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class C12Ex13 {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VETORES
		String[] nomeMeses = new String[12];
		String impressao = "";
		
		// ESTRUTURA DE REPETIÇÃO
		for(int aux = 0; aux < nomeMeses.length; aux++) {
			
			// ENTRADA DE VETORES
			nomeMeses[aux] = JOptionPane.showInputDialog(null,
					"Informe o nome de cada mês: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
		}	
		// ORDENAÇÃO CRESCENTE EM ORDEM ALFABÉTICA
		Arrays.sort(nomeMeses);
		
		// SAÍDA DE DADOS
		for (String obj : nomeMeses) {
			impressao += obj + "\n";
		}
		JOptionPane.showMessageDialog(null,
				"Meses: "+impressao,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
}}
