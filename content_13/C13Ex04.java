package content_13;
import javax.swing.JOptionPane;
public class C13Ex04 {
	public static void main(String[] args) {

		int cont = 0;
		double numInt = Math.random(), numTentativas;
		
		numInt = (int)(numInt * 100);
		
		do {
			numTentativas = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Digite um n�mero entre 0 e 100: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE));
			
			if (numInt == numTentativas) {
				JOptionPane.showMessageDialog(null,
						"Voc� acertou o n�mero!",
						"Resultado",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
			else if (numInt < numTentativas) {
				JOptionPane.showMessageDialog(null,
						"Errou, o n�mero � menor!",
						"Erro",
						JOptionPane.QUESTION_MESSAGE);
			}
			
			else {
				JOptionPane.showMessageDialog(null,
						"Errou, o n�mero � maior!",
						"Erro",
						JOptionPane.QUESTION_MESSAGE);
			}
			
			cont++;
				
		} while (numTentativas != -1);
		
		JOptionPane.showMessageDialog(null,
				"O n�mero � :" + cont,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	
		
		
	}

}
