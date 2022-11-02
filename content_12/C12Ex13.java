package content_12;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class C12Ex13 {
	public static void main(String[] args) {
		
		// DECLARA��O DE VETORES
		String[] nomeMeses = new String[12];
		String impressao = "";
		
		// ESTRUTURA DE REPETI��O
		for(int aux = 0; aux < nomeMeses.length; aux++) {
			
			// ENTRADA DE VETORES
			nomeMeses[aux] = JOptionPane.showInputDialog(null,
					"Informe o nome de cada m�s: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
		}	
		// ORDENA��O CRESCENTE EM ORDEM ALFAB�TICA
		Arrays.sort(nomeMeses);
		
		// SA�DA DE DADOS
		for (String obj : nomeMeses) {
			impressao += obj + "\n";
		}
		JOptionPane.showMessageDialog(null,
				"Meses: "+impressao,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
}}
