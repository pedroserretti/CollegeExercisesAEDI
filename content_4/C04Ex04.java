package content_4;
import javax.swing.JOptionPane; 
public class C04Ex04 {
	public static void main(String[] args) {
		//entrada de dados
		//declaração de variáveis 
		String sobreNome = JOptionPane.showInputDialog(null,
			    "Digite o seu sobrenome: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		String primeiroNome = JOptionPane.showInputDialog(null,
				"Digite o seu primeiro nome: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		String segundoNome = JOptionPane.showInputDialog(null,
				"Digite o seu segundo nome: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		String idadeStr = JOptionPane.showInputDialog(null,
				"Digite a sua idade: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int idade = Integer.valueOf(idadeStr).intValue();
		JOptionPane.showMessageDialog(null,
		"Nome: "+sobreNome+", "+primeiroNome+" "+segundoNome+ "\nIdade: "+idade,
		"Dados",
		JOptionPane.INFORMATION_MESSAGE);
		}

}
