package content_12;
import javax.swing.JOptionPane;
public class C12Ex17 {
	public static void main(String[] args) {
		
		int[] valorVet = new int[10];
		int[] valorVet2 = new int[valorVet.length];
		
		for (int aux = 0; aux < valorVet.length; aux++) 
		{
			valorVet[aux] = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Digite o valor para a posição "+aux+": ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE));
		}
		for (int aux = 0; aux < valorVet.length; aux++) 
		{
			valorVet2[valorVet.length -1 - aux] = valorVet[aux];
		}
		JOptionPane.showMessageDialog(null,
				"Vetor invertido: ", 
				"Dados", 
				JOptionPane.INFORMATION_MESSAGE);
		for (int aux = 0; aux < valorVet.length; aux++) 
		{
			String impressao = valorVet2[aux] + " ";
			JOptionPane.showMessageDialog(null,
					""+impressao,
					"Dados",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
