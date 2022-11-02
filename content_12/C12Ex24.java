package content_12;
import javax.swing.JOptionPane;
public class C12Ex24 {
	public static void main(String[] args) {

		int i = 0;
		int[] numVet = new int[10];
		int[] numVet2 = new int[10];
		
		for (int aux = 0; aux < numVet.length; aux++) {
			
			numVet[aux] = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Informe um número inteiro: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE));
		}

		for (int j : numVet) {

			if (j % 3 == 0) {
				numVet2[i] = j;
				i++;
			}
		}
		
		for (int aux = 0; aux < i; aux++){
			String impressao = numVet2[aux] +" ";
			JOptionPane.showMessageDialog(null,
					""+impressao,
					"Resultado",
					JOptionPane.QUESTION_MESSAGE);
			}
		}

}
