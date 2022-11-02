package content_12;
import javax.swing.JOptionPane;
public class C12Ex22 {
	public static void main(String[] args) {
		
		Integer[] numVet = new Integer[20];
		
		for (int aux = 0; aux < 20; aux++) {
			numVet[aux] = Integer.valueOf(JOptionPane.showInputDialog(null,
					"Digite um número inteiro aleatório",
					"Dados",
					JOptionPane.QUESTION_MESSAGE));
		}
		
		for (int aux = 0; aux < 20; aux++) {
			String impressao1 = numVet[aux] + " ";
			boolean impressao2 = numVet[aux] % 2 == 0;
			
			if (numVet[aux] % 2 != 0)
				JOptionPane.showMessageDialog(null,
					""+impressao1+
					"\n"+impressao2,
					"Resultado",
					JOptionPane.INFORMATION_MESSAGE);
			}
	
	}
}
