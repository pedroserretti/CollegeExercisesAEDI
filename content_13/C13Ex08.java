package content_13;
import javax.swing.JOptionPane;
public class C13Ex08 {
	public static void main(String[] args) {

		String nomePessoa = JOptionPane.showInputDialog(null,
				"Informe seu nome completo: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		String[] nomeSeparado = new String[10];
		String print = "";
		char[] nomeIniciais = new char[9];
		
		nomeSeparado = nomePessoa.split(" ");
		
		String sobrenome = nomeSeparado[nomeSeparado.length - 1];
		
		for (int aux = 1; aux < nomeSeparado.length; aux++) 
		{
			nomeIniciais[aux] = nomeSeparado[aux - 1].charAt(0);
			print += nomeIniciais[aux] + ". ";
		}
		
		JOptionPane.showMessageDialog(null,
				sobrenome.toUpperCase() + ", " + print, 
				"Resultado", 
				JOptionPane.INFORMATION_MESSAGE);
	}

}
