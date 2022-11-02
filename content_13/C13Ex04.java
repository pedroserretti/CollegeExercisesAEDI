package content_13;
import javax.swing.JOptionPane;
public class C13Ex04 {
	public static void main(String[] args) {

		int cont = 0;
		double numInt = Math.random(), numTentativas;
		
		numInt = (int)(numInt * 100);
		
		do {
			numTentativas = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Digite um número entre 0 e 100: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE));
			
			if (numInt == numTentativas) {
				JOptionPane.showMessageDialog(null,
						"Você acertou o número!",
						"Resultado",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
			else if (numInt < numTentativas) {
				JOptionPane.showMessageDialog(null,
						"Errou, o número é menor!",
						"Erro",
						JOptionPane.QUESTION_MESSAGE);
			}
			
			else {
				JOptionPane.showMessageDialog(null,
						"Errou, o número é maior!",
						"Erro",
						JOptionPane.QUESTION_MESSAGE);
			}
			
			cont++;
				
		} while (numTentativas != -1);
		
		JOptionPane.showMessageDialog(null,
				"O número é :" + cont,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	
		
		
	}

}
