package content_12;
import javax.swing.JOptionPane;
public class C12Ex15 {
	public static void main(String[] args) {
		
		String valorPar = "";
		Integer[] valorNum = new Integer[10];
		int valorMedia;
		Integer valorSoma = 0;
		Integer cont = 0;

		for (int aux = 0; aux < 10; aux++) {
			valorNum[aux] = Integer.valueOf(JOptionPane.showInputDialog(null,
					"Informe um número inteiro: ", 
					"Dados",
					JOptionPane.QUESTION_MESSAGE));

			if (valorNum[aux] % 2 == 0) {
				valorPar += valorNum[aux] +" ";
				cont++;
				valorSoma += valorNum[aux];
			}
		}	
		valorMedia = valorSoma / cont;
		JOptionPane.showMessageDialog(null,
				""+valorPar+
				"\nMédia: "+valorMedia,
				"Resultado",
				JOptionPane.QUESTION_MESSAGE);
		
		
	}
}
