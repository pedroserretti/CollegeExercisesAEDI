package content_9;
import javax.swing.JOptionPane;
public class C09Ex01 {
	public static void main(String[] args) {

		// DECLARAÇÃO DE VARIÁVEIS
		double valorNum, valorDen, serieNum = 0;
		
		// ESTRUTURA DE REPETIÇÃO
		for (int aux = 1; aux <= 37; aux++) {
			
			// CÁLCULOS
			valorNum = (38 - aux) * (39-aux);
			valorDen = aux;
			serieNum += valorNum/ valorDen;
		}

		// SAÍDA DE DADOS
		JOptionPane.showMessageDialog(null,
				"Valor da série: "+serieNum,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
