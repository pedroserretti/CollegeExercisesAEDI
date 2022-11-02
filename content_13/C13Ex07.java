package content_13;
import javax.swing.JOptionPane;
public class C13Ex07 {
	public static void main(String[] args) {
		
		String compName, lastName;
		compName = JOptionPane.showInputDialog(null,
				"Informe seu nome completo: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		String[] separateName = compName.split(" ");
		
		lastName = separateName[separateName.length-1];
		
		JOptionPane.showMessageDialog(null,
				"Sobrenome: "+lastName,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);

	}

}
