package content_9;
import javax.swing.JOptionPane;
public class C09Ex01 {
	public static void main(String[] args) {

		// DECLARA��O DE VARI�VEIS
		double valorNum, valorDen, serieNum = 0;
		
		// ESTRUTURA DE REPETI��O
		for (int aux = 1; aux <= 37; aux++) {
			
			// C�LCULOS
			valorNum = (38 - aux) * (39-aux);
			valorDen = aux;
			serieNum += valorNum/ valorDen;
		}

		// SA�DA DE DADOS
		JOptionPane.showMessageDialog(null,
				"Valor da s�rie: "+serieNum,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
