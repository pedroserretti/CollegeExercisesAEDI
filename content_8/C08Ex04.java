package content_8;
import javax.swing.JOptionPane;
public class C08Ex04 {
	public static void main(String[] args) {

		// DECLARA��O DE VARI�VEIS E ENTRADA DE DADOS
		
		int cont1 = 0, cont2 = 0; 
		
		for (int aux = 1; aux <=5; aux++) {
			String nomeAluno = JOptionPane.showInputDialog(null,
					"Informe o nome do aluno: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			String idadeAlunoStr = JOptionPane.showInputDialog(null,
					"Informe a idade do aluno: ",
					"Dados",
					JOptionPane.QUESTION_MESSAGE);
			
			int idadeAluno = Integer.valueOf(idadeAlunoStr);
			
			// C�LCULOS
			
			if (idadeAluno <= 18) {
					cont1++;
				}
				
			else {
				cont2++;
				}		
			
			JOptionPane.showMessageDialog(null,
					"Nome: "+nomeAluno+"\nIdade: "+idadeAluno,
					"Dados",
					JOptionPane.INFORMATION_MESSAGE);
			
			}	
			
			// SA�DA DE DADOS
			
				JOptionPane.showMessageDialog(null,
						"At� 18: "+cont1+"\nAcima de 18: "+cont2,
						"Resultado",
						JOptionPane.INFORMATION_MESSAGE);
	
		
		


}}
