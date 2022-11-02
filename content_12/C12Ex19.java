package content_12;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class C12Ex19 {
	public static void main(String[] args) {
	
		Integer[] vetBilhetes = new Integer[10];
		long bilPremiado = -1;
		int valorPos;
		
		for (int aux = 0; aux < 10; aux++) {
			vetBilhetes[aux] = Integer.valueOf(JOptionPane.showInputDialog(null,
					"Digite o número do bilhete: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE));
		}
		
		bilPremiado = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Digite o número de bilhete premiado: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE));
		
		for (int aux = 0; aux < 10; aux++) {
			if (vetBilhetes[aux] == bilPremiado) {
				bilPremiado = aux + 1;
			}
		}
		
		valorPos = Arrays.binarySearch(vetBilhetes, bilPremiado);
		
		for(int aux = 0; aux < 10; aux++) {
			
			if (valorPos < 0) {
			
				JOptionPane.showMessageDialog(null,
						"Bilhete não premiado.",
						"Perdeu",
						JOptionPane.INFORMATION_MESSAGE);
			}
		
			else {
				JOptionPane.showMessageDialog(null,
						"Pessoa premiada!",
						"Premiação",
						JOptionPane.INFORMATION_MESSAGE);	
				break;
			}
		}
}}
