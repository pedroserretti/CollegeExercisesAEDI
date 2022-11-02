package content_12;
import javax.swing.JOptionPane;
public class C12Ex20 {
	public static void main(String[] args) {
		
		Integer[] numVet = new Integer[10];
		double valorMedia, valorSoma = 0, cont = 0;
		
		for (int aux = 0; aux < 10; aux++) {
			numVet[aux] = Integer.valueOf(JOptionPane.showInputDialog(null,
					"Digite um número inteiro aleatório: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE));
		}
		for (int aux = 0; aux < 10; aux++) {
			String impressao = numVet[aux] + " ";
			if (numVet[aux] > numVet[9]) {
				JOptionPane.showMessageDialog(null,
						""+impressao,
						"Resultado",
						JOptionPane.INFORMATION_MESSAGE);
				cont++;
				valorSoma += numVet[aux];
			}
		}
		
		valorMedia = valorSoma / cont;
		JOptionPane.showMessageDialog(null,
				"Media: "+valorMedia,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
