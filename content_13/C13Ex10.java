package content_13;
import javax.swing.JOptionPane;
public class C13Ex10 {
	public static void main(String[] args) {

		String print = "";
		String nomePessoa = JOptionPane.showInputDialog(null, 
				"Informe o seu nome: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		String[] nomeSeparado = new String[10];
		
		nomeSeparado = nomePessoa.split("");

		for (String s : nomeSeparado) {
			print += s + "\n";
		}
		
		JOptionPane.showMessageDialog(null,
				print.toUpperCase(),
				"Dados",
				JOptionPane.INFORMATION_MESSAGE);
		
	}

}
