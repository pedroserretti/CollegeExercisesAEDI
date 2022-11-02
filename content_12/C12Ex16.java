package content_12;
import javax.swing.JOptionPane;
public class C12Ex16 {
	public static void main(String[] args) {

		Integer[] valorNum = new Integer[10];
		double numReal;
		String impressao;
		
		for (int aux = 0; aux < 10; aux++) {
			valorNum[aux] = Integer.valueOf(JOptionPane.showInputDialog(null,
					"Digite um número inteiro: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE));
		}
		
		numReal = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Digite um número real: ", 
				"Dados",
				JOptionPane.QUESTION_MESSAGE));
		
		for (int aux = 0; aux < 10; aux++) {
			impressao = valorNum[aux] * numReal + " ";
			JOptionPane.showMessageDialog(null, 
					""+impressao,
					"Dados",
					JOptionPane.INFORMATION_MESSAGE);
					
		}
	
	}
}
