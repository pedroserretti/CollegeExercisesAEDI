package content_10;
import javax.swing.JOptionPane;
public class C10Ex07 {
	public static void main(String[] args) {
		
		// DECLARA��O DE VARI�VEIS 
		int cont = 0;
		double contamin = 1;
		
		String qtPessoasStr = JOptionPane.showInputDialog(null, 
					"Informe o n�mero de quantidade de pessoas: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
		double qtPessoas = Double.valueOf(qtPessoasStr);
		
		// ESTRUTURA DE REPETI��O
		do {
			
			// ENTRADA DE DADOS
			
			
			// C�LCULOS
			contamin += 0.003 * contamin;
			cont++;
			
		}
		while (contamin <= qtPessoas);
		
		// SA�DA DE DADOS
		JOptionPane.showMessageDialog(null,
				"Popula��o: "+qtPessoas+"\nAnos: "+cont/365+"\nMeses: "+cont%365/30+"\nDias: "+cont%365%30,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	

}}
