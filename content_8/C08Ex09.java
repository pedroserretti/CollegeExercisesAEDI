package content_8;
import javax.swing.JOptionPane;
public class C08Ex09 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS E ENTRADA DE DADOS
		
		int valorSomaM = 0, valorSomaF = 0;
		double cont1 = 0, cont2 = 0, mediaM, mediaF;
		
		String numPessoasStr = JOptionPane.showInputDialog(null,
				"Informe o n�mero de pessoas: ",
				"Dados",
				JOptionPane.QUESTION_MESSAGE);
		
		int numPessoas = Integer.valueOf(numPessoasStr);
		
		for (int aux = 1; aux <= numPessoas; aux++) {
			String nomePessoa = JOptionPane.showInputDialog(null,
					"Informe o nome da pessoa: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			String idadePessoaStr = JOptionPane.showInputDialog(null,
					"Informe a idade da pessoa: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			int idadePessoa = Integer.valueOf(idadePessoaStr);
			
			String sexoPessoa = JOptionPane.showInputDialog(null,
					"Informe o sexo da pessoa (M ou F): ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			// C�LCULOS
			
				if (sexoPessoa.equalsIgnoreCase("M")) {
					valorSomaM += idadePessoa;
					cont1++;
				}
			
				else {
					valorSomaF += idadePessoa;
					cont2++;
				}
		}
		
		mediaM = valorSomaM / cont1;
		mediaF = valorSomaF / cont2;
		
		// SA�DA DE DADOS 
		
		JOptionPane.showMessageDialog(null,
				"M�dia da idade dos homens: "+mediaM+"\nM�dia da idade das mulheres: "+mediaF,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
		
	}

}
