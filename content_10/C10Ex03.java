package content_10;
import javax.swing.JOptionPane;
import java.lang.Math;
public class C10Ex03 {
	public static void main(String[] args) {

		// DECLARAÇÃO DE VARIÁVEIS
		String valorRaioStr;
		int valorRaio;
		double setorCirc = 0;
		
		JOptionPane.showMessageDialog(null,
				"Para finalizar, digite -1 no valor do raio",
				"Informação",
				JOptionPane.INFORMATION_MESSAGE);
		
		// ENTRADA DE DADOS
		String valorAngStr = JOptionPane.showInputDialog(null,
					"Informe o valor de a: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
		int valorAng = Integer.parseInt(valorAngStr);
		
		// ESTRUTURA DE REPETIÇÃO E ENTRADA DE DADOS
		do {
			
			valorRaioStr = JOptionPane.showInputDialog(null,
					"Informe o valor do raio: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			valorRaio = Integer.parseInt(valorRaioStr);
			
			// CONDIÇÃO 
			if (valorRaio != -1) {
				setorCirc = (valorAng * 3.1416 * Math.pow(valorRaio, 2)/ 360);
			
			}} while (valorRaio != -1);
		
		// SAÍDA DE DADOS
		JOptionPane.showMessageDialog(null,
				"S: "+setorCirc,
				"Resultado Final",
				JOptionPane.INFORMATION_MESSAGE);
}}
