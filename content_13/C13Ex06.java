package content_13;
import javax.swing.JOptionPane;
public class C13Ex06 {
	public static void main(String[] args) {
		
		String sobrenome;
		String nomeComp;
		String[] palavras = null;
		int cont = 0;
	
		sobrenome = JOptionPane.showInputDialog(null,
				"Digite o nome de uma fam�lia: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		for (int aux = 0; aux < 5; aux++) 
		{
		
			nomeComp = JOptionPane.showInputDialog(null,
				"Digite o nome completo de uma pessoa: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
			palavras = nomeComp.split(" ");
		
			if (palavras[palavras.length - 1].compareToIgnoreCase(sobrenome) == 0) 
			{
			cont++;
			}
		}
		
		JOptionPane.showMessageDialog(null,
				"O n�mero de pessoas pertencentes a fam�lia � "+cont,
				"Dados",
				JOptionPane.INFORMATION_MESSAGE);
	
		


}}
