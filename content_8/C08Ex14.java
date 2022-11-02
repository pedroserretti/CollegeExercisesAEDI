package content_8;
import javax.swing.JOptionPane;
public class C08Ex14 {
	public static void main(String[] args) {
		
		// DECLARAÇÃO DE VARIÁVEIS 
		String rep = "", espaco = "", rep1 = "";
		String numeroStr = JOptionPane.showInputDialog(null,
				"Informe um número inteiro entre 1 e 20: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		int numero = Integer.parseInt(numeroStr);
		
		String caractereStr = JOptionPane.showInputDialog(null,
				"Digite um caractere para fazer o desenho: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		char caractere = caractereStr.charAt(0);
		rep = caractere + espaco;
		
		for (int aux = 1; aux <= numero; aux++) {
			rep1 += rep;
		}
		
		for (int aux = 1; aux <= numero; aux++) {
			System.out.println(rep1);
		}
			

	

}}
