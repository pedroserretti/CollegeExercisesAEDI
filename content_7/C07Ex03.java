package content_7;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class C07Ex03 {
	public static void main(String[] args) {

		// DECLARAÇAO DE VARIAVEIS E ENTRADA DE DADOS
		
		Scanner teclado = new Scanner(System.in);
		int imposto = 100;
		double percentMulta1, percentMulta2;		
		
		String numDiasStr = JOptionPane.showInputDialog(null,
				"Informe o número de dias: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		// Cï¿½LCULOS E SAï¿½DA DE DADOS
		
		int numDias = Integer.parseInt(numDiasStr);
	
		percentMulta1 = (imposto * 0.1) + 0.5 * numDias;
		percentMulta2 = (imposto * 1.5) + 1 * numDias;

		switch (numDias) {
			case 1, 2, 3, 4, 5 ->
				JOptionPane.showMessageDialog(null,
						"Isento da multa",
						"Resultado",
						JOptionPane.INFORMATION_MESSAGE);
			case 6, 7, 8 ->
				JOptionPane.showMessageDialog(null,
						"Multa: 0.2",
						"Resultado",
						JOptionPane.INFORMATION_MESSAGE);
			case 9, 10 ->
				JOptionPane.showMessageDialog(null,
						"Multa: "+percentMulta1+" por dia de atraso",
						"Resultado",
						JOptionPane.INFORMATION_MESSAGE);
			case 11 ->
				JOptionPane.showMessageDialog(null,
						"Multa: "+percentMulta2+" por dia de atraso",
						"Resultado",
						JOptionPane.INFORMATION_MESSAGE);
			}
		
		teclado.close();
		
	}

}
