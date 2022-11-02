package content_8;
import java.lang.Math;
import javax.swing.	JOptionPane;

public class C08Ex01 {
	public static void main(String[] args) {

		// DECLARAÇÃO DE VARIÁVEIS
		
		double areaCirc;
		
		// ESTRUTURA DE REPETIÇÃO E ENTRADA DE DADOS
			
		for (int repet = 1; repet <=3; repet++) {
			String valorRaioStr = JOptionPane.showInputDialog(null,
					"Informe o valor do raio: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			int valorRaio = Integer.parseInt(valorRaioStr);
			
			// CÁLCULOS
			
			areaCirc = 3.1416 * Math.pow(valorRaio, 2);
			
			// SAÍDA DE DADOS
			
			JOptionPane.showMessageDialog(null,
					"Área: "+areaCirc,
					"Resultado",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}
}
